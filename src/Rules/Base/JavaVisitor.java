package Rules.Base;

import Rules.AST.Java.Comment;
import Rules.AST.Java.FunctionCall;
import Rules.AST.Java.FunctionDeclaration;
import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Java.JavaBody.JavaBody;
import Rules.AST.Java.Logic.Conditional.ConditionalStmt;
import Rules.AST.Java.Logic.Loop.LoopStmt;
import Rules.AST.Java.Logic.VariableAssignment;
import Rules.AST.Java.Logic.VariableDeclaration;
import Rules.AST.Java.ParameterList;
import Rules.AST.Java.Utils.Break;
import Rules.AST.Java.Utils.Continue;
import Rules.AST.Java.Utils.Increment;
import Rules.AST.Node;
import Rules.generated.SqlParser;

public class JavaVisitor extends ParseVisitor {

    @Override
    public FunctionDeclaration visitJava_function_declaration(SqlParser.Java_function_declarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        functionDeclaration.functionName=ctx.method_ID().getText();
        functionDeclaration.pl=visitParameter_list(ctx.parameter_list());
        return functionDeclaration;
    }
    @Override
    public ParameterList visitParameter_list(SqlParser.Parameter_listContext ctx) {
        ParameterList pln =new ParameterList();
        for(int i=0;i<ctx.any_name().size();i++)
        {
            pln.list.add(ctx.any_name(i).getText());
        }
        return pln;
    }
    @Override
    public Block visitBlock(SqlParser.BlockContext ctx) {
        Block block=new Block();
        if(ctx.java_body().size()!=0)
            for (int i=0;i<ctx.java_body().size();i++)
            {
                block.javaBodies.add(visitJava_body(ctx.java_body(i)));
            }
//        if(ctx.return_stmt()!=null)
//            block.returnStmt=visitReturn_stmt(ctx.return_stmt());
        return block;
    }

    @Override
    public JavaBody visitJava_body(SqlParser.Java_bodyContext ctx) {
        Node temp = (Node)visit(ctx);
        if(temp instanceof ConditionalStmt)
            return (ConditionalStmt)temp;
        if(temp instanceof Comment)
            return (Comment)temp;
        if(temp instanceof FunctionCall)
            return (FunctionCall)temp;
        if(temp instanceof LoopStmt)
            return (LoopStmt)temp;
        if(temp instanceof Increment)
            return (Increment)temp;
        if(temp instanceof VariableDeclaration)
            return (VariableDeclaration)temp;
        if(temp instanceof VariableAssignment)
            return (VariableAssignment)temp;
        if(temp instanceof Break)
            return (Break)temp;
        if(temp instanceof Continue)
            return (Continue)temp;
        else
            return (JavaBody) temp;
    }
}
