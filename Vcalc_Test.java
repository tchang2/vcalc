import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import SymTab.SymbolTable;


public class Vcalc_Test {

	public static void main(String[] args) throws RecognitionException, IOException {
		// TODO Auto-generated method stub
		//FileReader groupFileR = new FileReader("x86.stg" );
		//StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
		//groupFileR.close();
		// create the lexer attached to stdin
		//CharStream input = new ANTLRStringStream("%entry, %test\n");
		CharStream input = new ANTLRFileStream("vectest.vcalc");
		VcalcLPLexer lexer = new VcalcLPLexer(input);
		// create the buffer of tokens between the lexer and parser
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create the parser attached to the token buffer
		VcalcLPParser parser = new VcalcLPParser(tokens);
		// launch the parser starting at rule r, get return object
		SymbolTable symtab = new SymbolTable();
		VcalcLPParser.program_return result = parser.program();
		// pull out the tree and cast it
		Tree t = (Tree)result.getTree();
		
		//System.out.println(t.toStringTree()); // print out the tree
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(t);
		System.out.println(st);
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		PopulateST pop = new PopulateST(nodes, symtab);
		pop.program();
		//Interpreter interpreter = new Interpreter(nodes);
	    //interpreter.program(symtab);
	    //nodes.reset();
	    //Templater templater = new Templater(nodes);
	    //templater.setTemplateLib(templates);
	    //System.out.println(templater.program().getTemplate().toString());
	}

}
