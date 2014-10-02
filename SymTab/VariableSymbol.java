package SymTab;

public class VariableSymbol extends Symbol {
	String value;
	public VariableSymbol(String name, Type type) { 
		super(name, type); 
	}
	public VariableSymbol(String name, Type type, String value) {
		super(name, type);
		this.value = value;
	}
	public String getValue() {return value;}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString() {return super.getName() + " " + super.getType() + " " + value;}
}
