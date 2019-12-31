package Rules.AST.Java;

import Rules.AST.Java.JavaBody.Block;
import Rules.AST.Node;

public class FunctionDeclaration extends JavaStatment {
    public String functionName;
    public ParameterList pl;
    public Block block;
}
