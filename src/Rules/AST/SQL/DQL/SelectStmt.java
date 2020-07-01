package Rules.AST.SQL.DQL;

import Rules.AST.Node;
import Rules.AST.SQL.SqlStatment;
import Rules.AST.SQL.Statement;
import Rules.AST.Visitor.ASTVisitor;
import Rules.SymbolTableMu.SqlType;
import Rules.SymbolTableMu.TableOrSubQueryTypeEntry;

import java.util.ArrayList;

public class SelectStmt extends SqlStatment {
   public Node selectorval;
   public ArrayList<Node> expressions= new ArrayList<>();
   public ArrayList<Node> ordering = new ArrayList<>();
   public boolean limit = false;
   public Node expr1;
   public boolean offset = false;
   public Node expr2;
   public ArrayList<TableOrSubQueryTypeEntry> types;

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
