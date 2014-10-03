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
		
		//get input file. Hardcoded for now
		CharStream input = new ANTLRFileStream("vectest.vcalc");
		
		//run lexer and parser
		VcalcLPLexer lexer = new VcalcLPLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		VcalcLPParser parser = new VcalcLPParser(tokens);
		SymbolTable symtab = new SymbolTable(); //init symbol table
		VcalcLPParser.program_return result = parser.program();
		Tree t = (Tree)result.getTree();
		
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(t);
		System.out.println(st);
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		
		//walk the tree to populate symbol table and perform compile time error checking
		PopulateST pop = new PopulateST(nodes, symtab);
		pop.program();
		nodes.reset();
		
		
		//Interpreter interpreter = new Interpreter(nodes);
	    //interpreter.program(symtab);
	    //nodes.reset();
		//FileReader groupFileR = new FileReader("x86.stg" );
		//StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
		//groupFileR.close();
	    //Templater templater = new Templater(nodes);
	    //templater.setTemplateLib(templates);
	    //System.out.println(templater.program().getTemplate().toString());
	}

}
