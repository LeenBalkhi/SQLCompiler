package Nodes.Java_Function_Nodes;

import Nodes.Java_Function_Nodes.Block_Nodes.Block_Node;
import Nodes.Java_Function_Nodes.Block_Nodes.Generic_Block_Node;
import Nodes.Node;
import java.util.ArrayList;

public class Function_Node extends Node {
    public String functionName;
    public Parameter_List_Node pln;
    public ArrayList<Generic_Block_Node> block= new ArrayList<>();
}
