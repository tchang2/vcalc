package SymTab;
import VcalcValue.*;

public class VariableSymbol extends Symbol {
	Value value;
	public VariableSymbol(String name, Type type) { 
		super(name, type); 
	}
	public VariableSymbol(String name, Type type, Value value) {
		super(name, type);
		this.value = value;
	}
	public Value getValue() {return value;}
	public void setValue(Value value) {
		this.value = value;
	}
	
	public String toString() {return super.getName() + " " + super.getType() + " " + value;}
}
