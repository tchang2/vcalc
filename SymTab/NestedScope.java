package SymTab;

import java.util.HashMap;
import java.util.Map;

public class NestedScope implements Scope{
	String name;
	Map<String, Symbol> symbols = new HashMap<String, Symbol>();
	Scope enclosingscope;
	
	public NestedScope(String name, Scope enclosingscope) {
		this.enclosingscope = enclosingscope;
		this.name = name;
	}
	
	public String getScopeName() { return this.name; }
    public Scope getEnclosingScope() { return enclosingscope; }
    public void define(Symbol sym) { symbols.put(sym.name, sym); }
    public Symbol resolve(String name) { return symbols.get(name); }
}
