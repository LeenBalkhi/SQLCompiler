package CodeGen.GenerateCodeFromNodes;

import Rules.AST.Java.Logic.VariableAssignment;
import Rules.AST.Java.Logic.VariableAssignmentValue;
import Rules.AST.Java.Logic.VariableDeclaration;
import Rules.AST.Java.Utils.Assignment;
import Rules.AST.Java.Utils.SimpleVariable;
import Rules.AST.Java.Utils.Variable;
import Rules.AST.SQL.DQL.FactoredSelectStatement;
import Rules.AST.SQL.DQL.SelectCore;
import Rules.AST.SQL.DQL.TableOrSubquery;
import Rules.AST.SQL.Database.ResultColumn;
import Rules.AST.SQL.Expression.*;
import Rules.AST.SQL.JoinClause;
import Rules.AST.SQL.JoinOperator;
import Rules.SymbolTableMu.SqlType;
import Rules.SymbolTableMu.SqlTypeEntry;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class VariableDeclarationGen {
    Writer output;

    Writer fromOutput;

    VariableDeclaration variableDeclaration;

    public String name ;

    public ArrayList<String> inWhere = new ArrayList<>();

    public ArrayList<String> fields = new ArrayList<>();

    public ArrayList<String> tos = new ArrayList<>();

    public VariableDeclarationGen(VariableDeclaration v){
        variableDeclaration = v;
        name = ((SimpleVariable)((Variable)((VariableAssignment)variableDeclaration.variableAssignments.get(0)).variable).variable).VariableName.get(0);
    }

    public void genVariableDeclaration() throws IOException {

        VariableAssignment varAss = (VariableAssignment)variableDeclaration.variableAssignments.get(0);
        FactoredSelectStatement f = (FactoredSelectStatement) ((VariableAssignmentValue)(((Assignment)varAss.assignments.get(0))).variableAssignmentValue).Value;
        SelectCore selectCore = (SelectCore) f.selectCore;

//        openMain();
//        output.append(name+" instanceOFName = new "+name+"()");
//        output.close();

        OpenFile();
        try {
            output.append("package CodeGen.CreatedClasses;\n");
            output.append("import java.io.*;\n"+
                    "import java.util.*;\n" +
                    "import java.util.stream.Collectors;\n");
            output.append("public class "+name+"{\n");

            for(Object obj : selectCore.resultColumns){
                ResultColumn resultColumn = (ResultColumn)obj;
                if(((SqlExpression)resultColumn.expression).expression instanceof SqlExpressionCase2){
                    SqlExpressionCase2 sqlc2 = (SqlExpressionCase2) ((SqlExpression)resultColumn.expression).expression;
                    if(sqlc2.tableName!=null){
                        SqlType sqlType = SymbolTableHolder.symbolTable.sqlTypes.get(sqlc2.tableName.name);
                        for(SqlTypeEntry entry : sqlType.entries){
                            if(entry.name.equals(sqlc2.columnName.name)){
                                output.append("\tpublic "+entry.type+" "+sqlType.name+"$"+entry.name+";\n");
                                fields.add(sqlType.name+"$"+entry.name);
                            }
                        }
                    }else{
                        for(int i=0;i<selectCore.tableOrSubQueries.size();i++){
                            TableOrSubquery tableOrSubquery = (TableOrSubquery) selectCore.tableOrSubQueries.get(i);
                            if(tableOrSubquery.tableName!=null){
                                String tableName = tableOrSubquery.tableName.name;
                                SqlType sqlType = SymbolTableHolder.symbolTable.sqlTypes.get(tableName);
                                for(SqlTypeEntry entry : sqlType.entries){
                                    if(entry.name.equals(sqlc2.columnName.name)){
                                        output.append("\tpublic "+entry.type+" "+sqlType.name +"$"+ entry.name+";\n");
                                        fields.add(sqlType.name+"$"+entry.name);
                                    }
                                }
                            }else if(tableOrSubquery.selectStatment!=null){
                                String tableName = tableOrSubquery.type.name;
                                SqlType sqlType = SymbolTableHolder.symbolTable.sqlTypes.get(tableName);
                                for(SqlTypeEntry entry : sqlType.entries){
                                    if(entry.name.equals(sqlc2.columnName.name)){
                                        output.append("\tpublic "+entry.type+" "+sqlType.name+"$"+entry.name+";\n");
                                        fields.add(sqlType.name+"$"+entry.name);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            output.append("\tpublic ArrayList<" + name + "> list_"+ name +" = new ArrayList<>();\n");

            for(int i=0;i<selectCore.tableOrSubQueries.size();i++){
                TableOrSubquery tableOrSubquery = (TableOrSubquery) selectCore.tableOrSubQueries.get(i);
                if(tableOrSubquery.tableName!=null){
                    output.append("\tpublic ArrayList<" + tableOrSubquery.tableName.name + "> list_"+ tableOrSubquery.tableName.name +" = new ArrayList<>();\n");
                    tos.add(tableOrSubquery.tableName.name);
                }/*else if(tableOrSubquery.selectStatment!=null){
                    String tableName = tableOrSubquery.type.name;
                    output.append("public ArrayList<" + tableName + "> list_"+ tableName +" = new ArrayList<>();\n");
                }*/
            }
////////////////////

            output.append("\t@Override\n"+
                    "\tpublic String toString(){\n");
            output.append("\tStringBuilder stringBuilder = new StringBuilder();\n");
            for(String s: fields)
            {
                output.append("\tstringBuilder.append("+s+"+\"  \");\n");
            }

            output.append("\tfor("+name+" var : list_"+ name +"){\n");
            output.append("\t\tstringBuilder.append(var+\"  \");\n\t}\n");
            for(String s: tos)
            {
                output.append("\tfor("+s+" var : list_"+ s +"){\n");
                output.append("\t\tstringBuilder.append(var+\"  \");\n\t}\n");
            }
            output.append("\treturn stringBuilder.toString();\n");
            output.append("}\n");

            output.append("private void fillData(){\n");

            for (int i=0;i<selectCore.tableOrSubQueries.size();i++){
                TableOrSubquery tableOrSubquery = (TableOrSubquery) selectCore.tableOrSubQueries.get(i);
                if(tableOrSubquery.tableName!=null)
                    output.append("\tlist_"+ tableOrSubquery.tableName.name +".addAll( new "+ tableOrSubquery.tableName.name +"().getData() );\n");
            }

            output.append("}\n"); // End of fillData


            OpenFromFile();

            fromOutput.append("package CodeGen.CreatedClasses;\n");

            fromOutput.append("import java.util.*;\n");

            fromOutput.append("public class From"+name+"{\n");

            for (String str : tos){
                fromOutput.append("\tpublic "+ str +" "+ str +";\n");
            }

            fromOutput.append("public static ArrayList<From"+ name +"> list_from"+ name +" = new ArrayList<>();\n");

            for(String field : fields){
                String[] data = field.split("\\$");
                SqlType sqlType = SymbolTableHolder.symbolTable.sqlTypes.get(data[0]);
                for(SqlTypeEntry entry : sqlType.entries){
                    if(entry.name.equals(data[1])){
                        if(entry.type.equals("Number")){
                            fromOutput.append("public double get"+data[0]+ data[1]+"(){\n");
                            fromOutput.append("\treturn "+data[0]+"."+data[1]+";\n");
                            fromOutput.append("}\n");
                        }
                    }
                }
            }

            fromOutput.append("}\n");

            fromOutput.close();

            output.append("public ArrayList<From"+ name +"> cartProduct(){\n");

            for (String str : tos){
                output.append("\tfor("+ str +" "+ str +" : list_"+ str +"){\n");
            }

            output.append("\t\tFrom"+ name+" from = new From"+name+"();\n");

            for (String str : tos){
                output.append("\t\tfrom."+str+" = "+str+";\n");
            }

            output.append("\t\tFrom"+name+".list_from"+name+".add(from);\n");

            for (String str : tos){
                output.append("}\n");
            }

            if(selectCore.whereExpression!=null){
                SqlExpression sqlExpression = selectCore.whereExpression;
                output.append(" ArrayList<From"+ name +"> copy = new ArrayList<>();\n");
                output.append("for(From"+name+" f : From"+name+".list_from"+name+") copy.add(f);\n");
                output.append("From"+name+".list_from"+name+" =(ArrayList<From"+ name +">) From"+name+".list_from"+name+".stream().filter(f->");
                visit(sqlExpression);
                output.append(").collect(Collectors.toList());\n");
            }

            if(selectCore.joinClause != null)
            {
                JoinClause joinClause = new JoinClause();
                String tableName="";
                boolean inner;
                for(int i=0 ; i <joinClause.tableOrSubQueries.size(); i++)
                {
                    TableOrSubquery tableOrSubquery = (TableOrSubquery) joinClause.tableOrSubQueries.get(i);
                     tableName = tableOrSubquery.tableName.name;
                }
                for(int i=0 ; i <joinClause.joinOperators.size(); i++)
                {
                    JoinOperator tempOp = (JoinOperator) joinClause.joinOperators.get(i);
                    if (tempOp.op.equalsIgnoreCase("inner"))
                    {
                        inner=true;
                    }
                }
                for(int i=0 ; i <joinClause.joinConstraints.size(); i++)
                {

                }
                output.append(" ArrayList<From"+ name +"> copy = new ArrayList<>();\n");
                output.append("for(From"+name+" f : From"+name+".list_from"+name+") copy.add(f);\n");
                output.append("From"+name+".list_from"+name+" =(ArrayList<From"+ name +">) From"+name+".list_from"+name+".stream().filter(f->");
                // visit(sqlExpression);
                output.append(").collect(Collectors.toList());\n");

            }
            output.append("return From"+name+".list_from"+name+";\n");

            output.append("}\n");


            output.append("public ArrayList<"+ name +"> getData(){\n" +
                    "fillData();\n");
            output.append("ArrayList<From"+ name +"> from = cartProduct();\n");


            output.append("for(From"+ name +" f : from){\n");

            output.append(name+" "+name+" = new "+name+"();\n");


            for (String str : fields){
                String[] data = str.split("\\$");
                output.append(name+"."+str+" = f."+data[0]+"."+data[1]+";\n");
            }

            output.append("list_"+name+".add("+name+");\n");

            output.append("}\n"); //End of for


            output.append("return list_"+ name +";\n");


            output.append("}\n"); //End Of getData

            ////////////

            output.append("}\n"); //End Of Class
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void visit(SqlExpressionCase2 sqlc2) throws IOException {
        String tn=null;
        String cn;
        if(sqlc2.tableName!=null){
            tn = sqlc2.tableName.name;
        }
        cn = sqlc2.columnName.name;
        output.append("f."+tn+"."+cn);
    }

    public void visit(SqlExpression sqlExpression) throws IOException {
        if(sqlExpression.expression instanceof SqlExpressionCase9){
            visit((SqlExpressionCase9) sqlExpression.expression);
        }else if(sqlExpression.expression instanceof SqlExpressionCase10){
            visit((SqlExpressionCase10)sqlExpression.expression);
        }else if(sqlExpression.expression instanceof SqlExpressionCase11){
            visit((SqlExpressionCase11)sqlExpression.expression);
        }else if(sqlExpression.expression instanceof SqlExpressionCase5){
            visit((SqlExpressionCase5)sqlExpression.expression);
        }else if(sqlExpression.expression instanceof SqlExpressionCase2){
            visit((SqlExpressionCase2)sqlExpression.expression);
        }else if(sqlExpression.expression instanceof SqlExpressionCase6){
            visit((SqlExpressionCase6)sqlExpression.expression);
        }else if(sqlExpression.expression instanceof SqlExpressionCase1){
            visit((SqlExpressionCase1)sqlExpression.expression);
        }else if(sqlExpression.expression instanceof SqlExpressionCase12){
            visit((SqlExpressionCase12)sqlExpression.expression);
        }
    }

    public void visit(SqlExpressionCase1 sqlExpressionCase1) throws IOException {
        if(sqlExpressionCase1.type.equals("String")){
            output.append("\""+ sqlExpressionCase1.literalValue +"\"");
        }else if(sqlExpressionCase1.type.equals("Number")){
            output.append(sqlExpressionCase1.literalValue);
        }else if(sqlExpressionCase1.type.equals("Boolean")){
            if(sqlExpressionCase1.bool)
                output.append("true");
            else
                output.append("false");
        }
    }

    public void visit(SqlExpressionCase10 sqlExpressionCase10) throws IOException {
        visit((SqlExpression)sqlExpressionCase10.SqlExpression1);
        output.append(" && ");
        visit((SqlExpression)sqlExpressionCase10.SqlExpression2);
    }

    public void visit(SqlExpressionCase11 sqlExpressionCase11) throws IOException {
        visit((SqlExpression)sqlExpressionCase11.SqlExpression1);
        output.append(" || ");
        visit((SqlExpression)sqlExpressionCase11.SqlExpression2);
    }

    public void visit(SqlExpressionCase5 sqlExpressionCase5) throws IOException {
        visit((SqlExpression)sqlExpressionCase5.SqlExpression1);
        output.append(sqlExpressionCase5.op);
        visit((SqlExpression)sqlExpressionCase5.SqlExpression2);
    }

    public void visit(SqlExpressionCase6 sqlExpressionCase6) throws IOException {
        visit((SqlExpression)sqlExpressionCase6.SqlExpression1);
        output.append(sqlExpressionCase6.op);
        visit((SqlExpression)sqlExpressionCase6.SqlExpression2);
    }

    public void visit(SqlExpressionCase12 sqlExpressionCase12) throws IOException{
        if(((SqlExpression)sqlExpressionCase12.expression).expression instanceof SqlExpressionCase2){
            SqlExpressionCase2 sqlc2 = (SqlExpressionCase2) ((SqlExpression)sqlExpressionCase12.expression).expression ;
            String tn = sqlc2.tableName.name;
            String cn = sqlc2.columnName.name;
            output.append(sqlExpressionCase12.functionName.name+".call( (ArrayList<Double>)copy.stream().map(From"+name+"::get"+tn+cn+").collect(Collectors.toList()) )");
        }
    }

    public void visit(SqlExpressionCase9 sqlExpressionCase9) throws IOException {
        SqlExpression sqlExpr1 = (SqlExpression)sqlExpressionCase9.SqlExpression1;
        if( sqlExpressionCase9.op.equals("!=") && sqlExpr1.type.equals("String"))
            output.append("!");
        visit(sqlExpr1);
        SqlExpression sqlExpr2 = (SqlExpression)sqlExpressionCase9.SqlExpression2;
        if(sqlExpr2.type.equals("String")) {
            if (sqlExpressionCase9.op.equals("!=") || sqlExpressionCase9.op.equals("==") || sqlExpressionCase9.op.equals("=")) {
                output.append(".equals(");
                visit(sqlExpr2);
                output.append(")");
            } else if (sqlExpressionCase9.op.equals("LIKE")) {
                output.append(".startsWith(");
                visit(sqlExpr2);
                output.append(")");
            }
        }else if(sqlExpr2.type.equals("Number")){
            if(sqlExpressionCase9.op.equals("==") || sqlExpressionCase9.op.equals("=")){
                output.append(" == ");
                visit(sqlExpr2);
            }else {
                output.append(sqlExpressionCase9.op);
                visit(sqlExpr2);
            }
        }else if(sqlExpr2.type.equals("Boolean")){
            if(sqlExpressionCase9.op.equals("==") || sqlExpressionCase9.op.equals("=")){
                visit(sqlExpr2);
            }
        }
    }


    public void OpenFile() {
        try {
            String name = "src\\CodeGen\\CreatedClasses\\"+ this.name +".java";
            output = new BufferedWriter(new FileWriter(name,true));
        } catch (IOException e) {
            System.out.println("IOException in OpenFile");
        }
    }

    public void OpenFromFile() {
        try {
            String name = "src\\CodeGen\\CreatedClasses\\From"+ this.name +".java";
            fromOutput = new BufferedWriter(new FileWriter(name,true));
        } catch (IOException e) {
            System.out.println("IOException in OpenFile");
        }
    }
}
