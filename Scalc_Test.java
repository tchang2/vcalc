import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;


public class Scalc_Test {

   public static void main(String[] args) throws IOException, RecognitionException {
              
        ANTLRFileStream input = new ANTLRFileStream("test.txt");
        
        BackEndLexer lex = new BackEndLexer(input); // create lexer
        CommonTokenStream tokens = new CommonTokenStream(lex);
        BackEndParser p = new BackEndParser(tokens); // create parser
        CommonTree tree = (CommonTree) p.prog().getTree();
        //SymbolTable symtab = new SymbolTable(); // create symbol table
        p.prog(); // launch parser
        //System.out.println("made it to the end");
        
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        BackEndTemplate walker = new BackEndTemplate(nodes);
        StringTemplateGroup stringTemp = new StringTemplateGroup();
        walker.setTemplateLib(stringTemp);
        
        BackEndTemplate.declara_return walkReturn = walker.declara();
        StringTemplate out = (StringTemplate) walkReturn.getTemplate();
        System.out.println(out.toString());
        
        nodes.reset();
        walker.reset();
        
        BackEndTemplate.walk_return walkReturn1 = walker.walk();
        out = (StringTemplate) walkReturn1.getTemplate();

        System.out.println(out.toString());
//               }
    }

}

//PrintWriter writer = new PrintWriter("testResult.txt");
//writer.flush();
//writer.print(out.toString());
//writer.close();