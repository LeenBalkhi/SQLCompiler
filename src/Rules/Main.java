package Rules;

import CodeGen.GenerateCodeFromNodes.MainNodeGen;
import CodeGen.GenerateCodeFromNodes.SymbolTableHolder;
import Rules.AST.Node;
import Rules.AST.Parse;
import Rules.AST.Visitor.BaseASTVisitor;

import Rules.Base.MainVisitor;
import Rules.SymbolTableMu.TableSymbol;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import Rules.generated.*;

import java.io.File;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args){
        try {

            File folder = new File("src\\CodeGen\\CreatedClasses");
            File[] files = folder.listFiles();
            for (File file : files)
            {
                file.delete();
            }
            String source = "sample//sam.txt";
            CharStream cs = fromFileName(source);
            SqlLexer lexer = new SqlLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            SqlParser parser = new SqlParser(token);
            ParseTree tree = parser.parse();
            MainVisitor m = new MainVisitor();
            Node n =  m.visit(tree);
            if(m.errors.size()!=0){
                for(int i=0;i<m.errors.size();i++){
                    m.errors.get(i).printError();
                }
            }
            if(m.errors.size()==0)
                if(false)
                    new BaseASTVisitor(m.symbolTable).visit((Parse) n);
            SymbolTableHolder.symbolTable = m.symbolTable;
            MainNodeGen mainNodeGen = new MainNodeGen(n);
            mainNodeGen.geClasses();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
