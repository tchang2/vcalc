package SymTab;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
import java.util.*;
public class SymbolTable {
    public Scope globals;
    Map<String, Symbol> resnames = new HashMap<String, Symbol>();
    Map<String, BuiltInTypeSymbol> bitypes = new HashMap<String, BuiltInTypeSymbol>();
    public SymbolTable() { initTypeSystem(); }
    protected void initTypeSystem() {
    	this.globals = new GlobalScope();
        defineType(new BuiltInTypeSymbol("int"));
        defineType(new BuiltInTypeSymbol("vector"));
        resnames.put("if", new Symbol("if"));
        resnames.put("fi", new Symbol("fi"));
        resnames.put("loop", new Symbol("loop"));
        resnames.put("pool", new Symbol("pool"));
        resnames.put("int", new Symbol("int"));
        resnames.put("print", new Symbol("print"));
        resnames.put("vector", new Symbol("vector"));
        resnames.put("filter", new Symbol("filter"));
        resnames.put("in", new Symbol("in"));
        //define(new BuiltInTypeSymbol("float"));
    }
	
    // Satisfy Scope interface
    public String getScopeName() { return "global"; }
    public Scope getEnclosingScope() { return null; }
    public void define(Symbol sym) { globals.define(sym); }
    public void defineType(BuiltInTypeSymbol sym) {bitypes.put(sym.name, sym); }
    public Symbol resolve(String name) { return globals.resolve(name); }
    public BuiltInTypeSymbol resolveType(String name) {return bitypes.get(name); }
    public boolean definedName(String name) { 
    	if (resnames.containsKey(name) || globals.resolve(name) != null || bitypes.containsKey(name))
    		return true;
    	else
    		return false;
    }
    
    
}