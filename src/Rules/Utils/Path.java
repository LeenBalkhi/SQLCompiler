package Rules.Utils;

import Rules.AST.Node;

public class Path extends Node {
   public String path="";
   public String filename="";

    public void append(String s)
    {
        path+=s;
    }
    public void setFilename(String filename)
    {
        this.filename = filename;
    }
}
