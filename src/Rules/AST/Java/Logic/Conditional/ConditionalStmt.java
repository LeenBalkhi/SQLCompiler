package Rules.AST.Java.Logic.Conditional;

import Rules.AST.Java.JavaBody.JavaBody;

import java.util.ArrayList;

public class ConditionalStmt extends JavaBody {
    public ArrayList<IfStmt> ifs = new ArrayList<>();
    public ArrayList<ElseIfStmt> elseifs = new ArrayList<>();
    public ElseStmt elseStmt;
}
