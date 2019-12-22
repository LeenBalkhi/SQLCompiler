package Nodes.Java_Function_Nodes.Block_Nodes;

import Nodes.Generic_Java_Nodes.Break_Point_Java_Statments_Nodes.Break_Point_Java_Statement_Node;
import Nodes.Generic_Java_Nodes.Java_Statement_Node.Java_Statement_Node;
import Nodes.Node;

import java.util.ArrayList;

public class Conditional_Stmt_Block_Within_Loop_Node extends Generic_Block_Node {
    public ArrayList<Java_Statement_Node> statments= new ArrayList<>();
    public boolean breakbool=false;
    public boolean continuebool=false;
    public Break_Point_Java_Statement_Node break_point_java_statement_node;
}
