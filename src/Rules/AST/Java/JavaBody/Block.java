package Rules.AST.Java.JavaBody;

import Rules.AST.Node;

import java.util.ArrayList;

public class Block extends Node {
    public ArrayList<JavaBody> javaBodies = new ArrayList<>();
    public ReturnStmt returnStmt;

}
