package Rules.AST.Java.JavaBody;

import Rules.AST.Java.Logic.Conditional.ConditionalStmt;
import Rules.AST.Java.Logic.Loop.LoopStmt;
import Rules.AST.Java.Logic.Switch.SwitchCase;
import Rules.AST.Node;
import Rules.SymbolTableMu.Scope;

import javax.swing.*;
import java.util.ArrayList;

public class JavaBody extends Node {
    public Node command;
}
