package Rules.AST.Java;

import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Node;

import java.util.ArrayList;

public class HigherOrderFunction extends Node {
    public ArgumentList argumentList;
    public ArrayList<Block> blocks = new ArrayList<>();
}
