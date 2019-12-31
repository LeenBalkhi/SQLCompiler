package Rules.AST.Java;

import Rules.AST.Java.JavaBody.Block;

public class FunctionDeclaration extends Rules.AST.Java.JavaStatment {
    public String functionName;
    public ParameterList pl;
    public Block block;
}
