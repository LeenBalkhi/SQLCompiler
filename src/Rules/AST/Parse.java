package Rules.AST;

import Rules.AST.QueryStmt.Statement;
import Rules.AST.Visitor.ASTVisitor;
import Rules.AST.Java.FunctionDeclaration;
import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{
    private List<Statement> sqlStmts = new ArrayList<Statement>();
    private List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();
    
    public void addQuery(Statement query){
        this.sqlStmts.add(query);
    }

    public void setSqlStmts(List<Statement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public void setFunctions(List<FunctionDeclaration> functions) {
        this.functions = functions;
    }

    public List<Statement> getSqlStmts() {
        return sqlStmts;
    }

    public List<FunctionDeclaration> getFunctions() {
        return functions;
    }

    @Override
    public String toString(){
        return "sql stmts = "+ getSqlStmts().get(0).getName();
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
        for(int i = 0 ; i < this.sqlStmts.size() ; i++){
            this.sqlStmts.get(i).accept(astVisitor);
        }
    }
}
