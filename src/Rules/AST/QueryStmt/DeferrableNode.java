package Rules.AST.QueryStmt;

import Rules.AST.Node;

public class DeferrableNode extends Node {
    public boolean not;
    public boolean innitiallyDeferred;
    public boolean innitiallyImmediate;
    public boolean enable;
}
