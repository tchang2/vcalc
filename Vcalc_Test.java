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
		CharStream input = new ANTLRFileStream(arg[0]);
		
		//run lexer and parser
		VcalcLPLexer lexer = new VcalcLPLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		VcalcLPParser parser = new VcalcLPParser(tokens);
		SymbolTable symtab = new SymbolTable(); //init symbol table
		VcalcLPParser.program_return result = parser.program(symtab);
		Tree t = (Tree)result.getTree();
		
		DOTTreeGenerator gen = new DOTTreeGenerator();
		StringTemplate st = gen.toDOT(t);
		//System.out.println(st);
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		
		//walk the tree to populate symbol table and perform compile time error checking
		PopulateST pop = new PopulateST(nodes, symtab);
		pop.program();
		nodes.reset();
		
		if (args[1].equals("int")) {
			Interpretor interpreter = new Interpretor(nodes, symtab);
			interpreter.program();
		} else {
		CharStream beinput = new ANTLRFileStream(arg[0]);
		BackEndLexer belexer = new BackEndLexer(beinput);
		CommonTokenStream betokens = new CommonTokenStream(belexer);
		BackEndParser beparser = new BackEndParser(betokens);
		BackEndParser.prog_return beresult = beparser.prog();
		Tree bet = (Tree)beresult.getTree();
		DOTTreeGenerator begen = new DOTTreeGenerator();
		StringTemplate best = begen.toDOT(bet);
		//System.out.println(best);
		
		CommonTreeNodeStream benodes = new CommonTreeNodeStream(bet);
		benodes.setTokenStream(betokens);
		
		FileReader groupFileR = new FileReader("llvm.stg" );
		StringTemplateGroup templates = new StringTemplateGroup(groupFileR);
		groupFileR.close();
	    BackEndTemplate templater = new BackEndTemplate(benodes);
	    templater.setTemplateLib(templates);
	    benodes.reset();
	    //System.out.println(templater.declara().getTemplate().toString());
	    
	  
	    //benodes.reset();
	    //BackEndTemplate.walk_ret;
	    System.out.println(templater.walk().getTemplate().toString());
	    
	    
	    //System.out.println(templater.declara().getTemplate().toString());
		}
	}

}
