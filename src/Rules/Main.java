package Rules;

import Rules.AST.Node;
import Rules.AST.Parse;
import Rules.AST.Visitor.BaseASTVisitor;
import Rules.Base.*;
import Rules.generated.SqlLexer;
import Rules.generated.SqlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args){
        try {
            String source = "sample//sam.txt";
            CharStream cs = fromFileName(source);
            SqlLexer lexer = new SqlLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            SqlParser parser = new SqlParser(token);
            ParseTree tree = parser.parse();
            Node n =  new JavaVisitor().visit(tree);
            n.accept(new BaseASTVisitor());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
