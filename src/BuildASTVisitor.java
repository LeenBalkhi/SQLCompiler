import Nodes.Generic_Java_Nodes.Break_Point_Java_Statments_Nodes.Return_Node;
import Nodes.Generic_Java_Nodes.If_Else_Nodes.*;
import Nodes.Generic_Java_Nodes.Java_Statement_Node.Conditional_Stmt_Nodes.Conditional_Stmt_Node;
import Nodes.Generic_Java_Nodes.Java_Statement_Node.Conditional_Stmt_Nodes.Conditional_Stmt_Within_Loop;
import Nodes.Generic_Java_Nodes.Java_Statement_Node.Increment_Node;
import Nodes.Generic_Java_Nodes.Java_Statement_Node.Java_Statement_Node;
import Nodes.Generic_Java_Nodes.Java_Statement_Node.Loop_Nodes.For_Node;
import Nodes.Generic_Java_Nodes.Java_Statement_Node.Loop_Nodes.Loop_Node;
import Nodes.Generic_Java_Nodes.Logical_Expression_Nodes.*;
import Nodes.Java_Function_Nodes.Block_Nodes.*;
import Nodes.Java_Function_Nodes.Function_Node;
import Nodes.Node;
import Nodes.Java_Function_Nodes.Parameter_List_Node;

public class BuildASTVisitor extends SqlBaseVisitor<Node>{
    //Visitors responsible for Generic Java Nodes
    //1-Block_Nodes
        //A-Block_Node
        @Override
        public Block_Node visitBlock(SqlParser.BlockContext ctx) {
            System.out.println("Checking Block");
            Block_Node block_node=new Block_Node();
            for (int i=0;i<ctx.java_stmt().size();i++)
            {
                block_node.javaStatements.add(visitJava_stmt(ctx.java_stmt(i)));
            }
            return block_node;
        }
        //B-One Line Block Node
        @Override
        public One_Line_Block_Node visitOne_line_block(SqlParser.One_line_blockContext ctx) {
            One_Line_Block_Node one_line_block_node = new One_Line_Block_Node();
            if(ctx.java_stmt()!=null)
                one_line_block_node.java_statement_node = visitJava_stmt(ctx.java_stmt());
            else if(ctx.return_stmt()!=null)
                one_line_block_node.break_point_java_statement_node = visitReturn_stmt(ctx.return_stmt());
            return one_line_block_node;
        }
        //C-Loop Block Node
        @Override
        public Loop_Block_Node visitLoop_block(SqlParser.Loop_blockContext ctx){
            System.out.println("Checking Block");
            Loop_Block_Node loop_block_node=new Loop_Block_Node();
            for (int i=0;i<ctx.java_stmt_within_loop().size();i++)
            {
                loop_block_node.statements.add(visitJava_stmt_within_loop(ctx.java_stmt_within_loop(i)));
            }
            return loop_block_node;
        }
        //D-Conditional Stmt Block Within Loop
        @Override
        public Conditional_Stmt_Block_Within_Loop_Node visitConditional_stmt_block_within_loop(SqlParser.Conditional_stmt_block_within_loopContext ctx) {
            Conditional_Stmt_Block_Within_Loop_Node conditional_stmt_block_within_loop_node = new Conditional_Stmt_Block_Within_Loop_Node();
            for(int i=0;i<ctx.java_stmt_within_loop().size();i++)
                conditional_stmt_block_within_loop_node.statments.add(visitJava_stmt_within_loop(ctx.java_stmt_within_loop(i)));
            if(ctx.br!=null)
                conditional_stmt_block_within_loop_node.breakbool=true;
            else if(ctx.con!=null)
                conditional_stmt_block_within_loop_node.continuebool=true;
            else if(ctx.ret!=null)
                conditional_stmt_block_within_loop_node.break_point_java_statement_node=visitReturn_stmt(ctx.ret);
            return conditional_stmt_block_within_loop_node;
        }
        //E-Conditional Stmt One Line Block Within Loop
    @Override
    public Conditiol_Stmt_One_Line_Block_Within_Loop_Node visitConditional_stmt_one_line_block_within_loop(SqlParser.Conditional_stmt_one_line_block_within_loopContext ctx) {
        Conditiol_Stmt_One_Line_Block_Within_Loop_Node conditiol_stmt_one_line_block_within_loop_node= new Conditiol_Stmt_One_Line_Block_Within_Loop_Node();
        if(ctx.java_stmt_within_loop()!=null)
            conditiol_stmt_one_line_block_within_loop_node.statment=visitJava_stmt_within_loop(ctx.java_stmt_within_loop());
        else
            conditiol_stmt_one_line_block_within_loop_node.break_point_java_statement_node=visitReturn_stmt(ctx.return_stmt());
        return conditiol_stmt_one_line_block_within_loop_node;
    }

    //2-Logical Expression Nodes
         //Custom_Visitor
         public Logical_Expression_Node customLogicalExpressionVisit(SqlParser.Logical_expressionContext ctx)
         {
             Node temp=visit(ctx);
             if(temp instanceof Logical_Expression_Node_Case1)
                 return (Logical_Expression_Node_Case1)temp;
             else if(temp instanceof Logical_Expression_Node_Case2)
                 return (Logical_Expression_Node_Case2)temp;
             else if(temp instanceof Logical_Expression_Node_Case3)
                 return (Logical_Expression_Node_Case3)temp;
             else if(temp instanceof Logical_Expression_Node_Case4)
                 return (Logical_Expression_Node_Case4)temp;
             else
                 return (Logical_Expression_Node_Case5)temp;
         }
         //C-Logical_Expression_Node_Case3
         @Override
         public Logical_Expression_Node_Case3 visitLogical_expression_case3(SqlParser.Logical_expression_case3Context ctx) {
             System.out.println("Checking Logical Expression case 3");
             Logical_Expression_Node_Case3 logical_expression_node = new Logical_Expression_Node_Case3();
             logical_expression_node.val=ctx.booleanval.getText();
             return logical_expression_node;
         }
    //3-Break_Point_Java_Statements_Nodes
        @Override
        public Return_Node visitReturn_stmt(SqlParser.Return_stmtContext ctx) {
            System.out.println("In Return");
            return new Return_Node();
        }
    //4- If_Else_Nodes
        //A-If_Stmt_Node
        @Override
        public If_Stmt_Node visitIf_stmt(SqlParser.If_stmtContext ctx) {
            System.out.println("If operator detected");
            If_Stmt_Node if_stmt_node= new If_Stmt_Node();
            if_stmt_node.logical_expression_node=customLogicalExpressionVisit(ctx.if1);
            if(ctx.block()!=null)
                if_stmt_node.generic_block_node=visitBlock(ctx.block());
            else
                if_stmt_node.generic_block_node=visitOne_line_block(ctx.one_line_block());
            return if_stmt_node;
        }
        //B-Else_Stmt_Node
        @Override
        public Else_Stmt_Node visitElse_stmt(SqlParser.Else_stmtContext ctx) {
            System.out.println("Else operator detected");
            Else_Stmt_Node else_stmt_node = new Else_Stmt_Node();
            if(ctx.block()!=null)
                else_stmt_node.generic_block_node=visitBlock(ctx.block());
            else if(ctx.one_line_block()!=null)
                else_stmt_node.generic_block_node = visitOne_line_block(ctx.one_line_block());
            return else_stmt_node;
        }
        //C-Else_If Stmt
        @Override
        public Else_If_Stmt_Node visitElse_if_stmt(SqlParser.Else_if_stmtContext ctx) {
            Else_If_Stmt_Node else_if_stmt_node = new Else_If_Stmt_Node();
            else_if_stmt_node.logical_expression_node=customLogicalExpressionVisit(ctx.logical_expression());
            if(ctx.block()!=null)
                else_if_stmt_node.generic_block_node=visitBlock(ctx.block());
            else
                else_if_stmt_node.generic_block_node=visitOne_line_block(ctx.one_line_block());
            return else_if_stmt_node;
        }
        //D-If_Stmt_Within_Loop
        @Override
        public If_Stmt_Within_Loop_Node visitIf_stmt_within_loop(SqlParser.If_stmt_within_loopContext ctx) {
            If_Stmt_Within_Loop_Node if_stmt_within_loop_node = new If_Stmt_Within_Loop_Node();
            if_stmt_within_loop_node.logical_expression_node=customLogicalExpressionVisit(ctx.logical_expression());
            if(ctx.conditional_stmt_block_within_loop()!=null)
                if_stmt_within_loop_node.generic_block_node = visitConditional_stmt_block_within_loop(ctx.conditional_stmt_block_within_loop());
            else
                if_stmt_within_loop_node.generic_block_node = visitConditional_stmt_one_line_block_within_loop(ctx.conditional_stmt_one_line_block_within_loop());
            return  if_stmt_within_loop_node;
        }
        //E-Else Stmt Within Loop
        @Override
        public Else_Stmt_Within_Loop_Node  visitElse_stmt_within_loop(SqlParser.Else_stmt_within_loopContext ctx) {
            Else_Stmt_Within_Loop_Node else_stmt_within_loop_node = new Else_Stmt_Within_Loop_Node();
            if(ctx.conditional_stmt_block_within_loop()!=null)
                else_stmt_within_loop_node.generic_block_node=visitConditional_stmt_block_within_loop(ctx.conditional_stmt_block_within_loop());
            else
                else_stmt_within_loop_node.generic_block_node=visitConditional_stmt_one_line_block_within_loop(ctx.conditional_stmt_one_line_block_within_loop());
            return else_stmt_within_loop_node;
        }
        //F-Else_If Stmt Within Loop
        @Override
        public Else_If_Stmt_Within_Loop_Node visitElse_if_stmt_within_loop(SqlParser.Else_if_stmt_within_loopContext ctx) {
            Else_If_Stmt_Within_Loop_Node else_if_stmt_within_loop_node = new Else_If_Stmt_Within_Loop_Node();
            else_if_stmt_within_loop_node.logical_expression_node = customLogicalExpressionVisit(ctx.logical_expression());
            if(ctx.conditional_stmt_block_within_loop()!=null)
                else_if_stmt_within_loop_node.generic_block_node=visitConditional_stmt_block_within_loop(ctx.conditional_stmt_block_within_loop());
            else
                else_if_stmt_within_loop_node.generic_block_node=visitConditional_stmt_one_line_block_within_loop(ctx.conditional_stmt_one_line_block_within_loop());
            return else_if_stmt_within_loop_node;
        }
    //5- Java Statments
        @Override
        public Java_Statement_Node visitJava_stmt(SqlParser.Java_stmtContext ctx) {
            System.out.println("java statement detected");
            return (Java_Statement_Node) visitChildren(ctx);
        }
        @Override
        public Java_Statement_Node visitJava_stmt_within_loop(SqlParser.Java_stmt_within_loopContext ctx) {
            System.out.println("java statement witihn loop detected");
            return  (Java_Statement_Node) visitChildren(ctx);
        }
        //A-Conditional Statements
        //Conditional Statement Not Within A Loop
        @Override
        public Conditional_Stmt_Node visitConditional_stmt(SqlParser.Conditional_stmtContext ctx) {
            System.out.println("its a conditional stmt");
            Conditional_Stmt_Node conditional_stmt_node = new Conditional_Stmt_Node();
            for(int i=0;i<ctx.children.size();i++)
            {
                conditional_stmt_node.if_else_nodes.add((If_Stmt_Node) visit(ctx.getChild(i)));
            }
            return conditional_stmt_node;
        }
        //Conditional Statement Within A Loop
        @Override
        public Conditional_Stmt_Within_Loop visitConditional_stmt_within_loop(SqlParser.Conditional_stmt_within_loopContext ctx) {
            System.out.println("its a conditional stmt within some loop");
            Conditional_Stmt_Within_Loop conditional_stmt_within_loop = new Conditional_Stmt_Within_Loop();
            for(int i=0;i<ctx.if_stmt_within_loop().size();i++)
                conditional_stmt_within_loop.if_else_nodes.add((If_Stmt_Within_Loop_Node) visit(ctx.if_stmt_within_loop(i)));
            for(int j=0;j<ctx.else_if_stmt_within_loop().size();j++)
                conditional_stmt_within_loop.if_else_nodes.add((Else_If_Stmt_Within_Loop_Node) visit(ctx.else_if_stmt_within_loop(j)));
            if(ctx.else_stmt_within_loop()!=null)
                conditional_stmt_within_loop.if_else_nodes.add((Else_Stmt_Within_Loop_Node) visit(ctx.else_stmt_within_loop()));
            return conditional_stmt_within_loop;
        }
        //B-Loop Statemment
        @Override
        public Loop_Node visitLoop_stmt(SqlParser.Loop_stmtContext ctx) {
            return (Loop_Node)visitChildren(ctx);
        }
        //For Loop
   //     @Override
//        public For_Node visitFor_loop(SqlParser.For_loopContext ctx) {
//
//        }

    //----------------------------------------------------
    //Visitor responsible for tree root
    public  Node visitParse(SqlParser.ParseContext ctx)
    {
        return visitChildren(ctx);
    }
    //-----------------------------------------------------
    //Visitors responsible for Java function declaration
    @Override
    public Node visitJava_function(SqlParser.Java_functionContext ctx) {
        Function_Node fn=new Function_Node();
        fn.functionName=ctx.funcName.getText();
        fn.pln=(Parameter_List_Node) visitParameter_list(ctx.parameterList);
        return fn;
    }
    @Override
    public Node visitParameter_list(SqlParser.Parameter_listContext ctx) {
        Parameter_List_Node pln =new Parameter_List_Node();
        for(int i=0;i<ctx.any_name().size();i++)
        {
            pln.list.add(ctx.any_name(i).getText());
        }
        return pln;
    }
    @Override
    public Increment_Node visitIncrement(SqlParser.IncrementContext ctx) {
        System.out.println("i am in increment");
        return (Increment_Node) visitChildren(ctx);
    }
}
