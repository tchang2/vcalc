package VcalcValue;
import java.util.ArrayList;

import SymTab.*;

public class Value {
	BuiltInTypeSymbol type;
	protected ArrayList<Integer> data;
	
	public Value(Integer data) {
		this.type = new BuiltInTypeSymbol("int");
		this.data = new ArrayList<Integer>();
		this.data.add(data);
	}
	public Value(BuiltInTypeSymbol type, ArrayList<Integer> data) {
		this.type = type;
		this.data = new ArrayList<Integer>();
		this.data = data;
	}
	public Value(Integer lower, Integer upper) {
		this.type = new BuiltInTypeSymbol("vector");;
		this.data = new ArrayList<Integer>();
		for (int i=lower; i<=upper; i++)
			this.data.add(i);
	}
	public Value(Value lower, Value upper) {
		this(lower.getInt(), upper.getInt());
	}
	
	public Value add(Value value) {
		if (this.data.size() == value.data.size()) {
			return this.addVec(value);
		} 
		if (this.data.size() < value.data.size()) {
			Value op1 = null;
			if (this.getTypeName().equals("int"))
				op1 = this.extend(value, this.getInt());
			else 
				op1 = this.extend(value, 0);
			return op1.addVec(value);
		}
		if (this.data.size() > value.data.size()) {
			Value op1 = null;
			if (value.getTypeName().equals("int"))
				op1 = value.extend(this, value.getInt());
			else 
				op1 = value.extend(this, 0);
			return op1.addVec(this);
		}
		
		//should never return
		return null;
	}
	private Value addVec(Value value) {
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int i=0; i<value.data.size(); i++) {
			out.add(this.data.get(i) + value.data.get(i));
		}
		
		if (this.getTypeName().equals("vector") || value.getTypeName().equals("vector"))
			return new Value(new BuiltInTypeSymbol("vector"), out);
		else
			return new Value(new BuiltInTypeSymbol("int"), out);
	}
	public Value sub(Value value) {
		if (this.data.size() == value.data.size()) {
			return this.subVec(value);
		} 
		if (this.data.size() < value.data.size()) {
			Value op1 = null;
			if (this.getTypeName().equals("int"))
				op1 = this.extend(value, this.getInt());
			else 
				op1 = this.extend(value, 0);
			return op1.subVec(value);
		}
		if (this.data.size() > value.data.size()) {
			Value op1 = null;
			if (value.getTypeName().equals("int"))
				op1 = value.extend(this, value.getInt());
			else 
				op1 = value.extend(this, 0);
			return this.subVec(op1);
		}
		
		//should never return
		return null;
	}
	private Value subVec(Value value) {
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int i=0; i<value.data.size(); i++) {
			out.add(this.data.get(i) - value.data.get(i));
		}
		
		if (this.getTypeName().equals("vector") || value.getTypeName().equals("vector"))
			return new Value(new BuiltInTypeSymbol("vector"), out);
		else
			return new Value(new BuiltInTypeSymbol("int"), out);
	}
	public Value mult(Value value) {
		if (this.data.size() == value.data.size()) {
			return this.multVec(value);
		} 
		if (this.data.size() < value.data.size()) {
			Value op1 = null;
			if (this.getTypeName().equals("int"))
				op1 = this.extend(value, this.getInt());
			else 
				op1 = this.extend(value, 0);
			return op1.multVec(value);
		}
		if (this.data.size() > value.data.size()) {
			Value op1 = null;
			if (value.getTypeName().equals("int"))
				op1 = value.extend(this, value.getInt());
			else 
				op1 = value.extend(this, 0);
			return this.multVec(op1);
		}
		
		//should never return
		return null;
	}
	private Value multVec(Value value) {
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int i=0; i<value.data.size(); i++) {
			out.add(this.data.get(i) * value.data.get(i));
		}
		
		if (this.getTypeName().equals("vector") || value.getTypeName().equals("vector"))
			return new Value(new BuiltInTypeSymbol("vector"), out);
		else
			return new Value(new BuiltInTypeSymbol("int"), out);
	}
	public Value div(Value value) {
		if (this.data.size() == value.data.size()) {
			return this.divVec(value);
		} 
		if (this.data.size() < value.data.size()) {
			Value op1 = null;
			if (this.getTypeName().equals("int"))
				op1 = this.extend(value, this.getInt());
			else 
				op1 = this.extend(value, 1);
			return op1.divVec(value);
		}
		if (this.data.size() > value.data.size()) {
			Value op1 = null;
			if (value.getTypeName().equals("int"))
				op1 = value.extend(this, value.getInt());
			else 
				op1 = value.extend(this, 0);
			return this.divVec(op1);
		}
		
		//should never return
		return null;
	}
	private Value divVec(Value value) {
		ArrayList<Integer> out = new ArrayList<Integer>();
		for (int i=0; i<value.data.size(); i++) {
			out.add(this.data.get(i) / value.data.get(i));
		}
		
		if (this.getTypeName().equals("vector") || value.getTypeName().equals("vector"))
			return new Value(new BuiltInTypeSymbol("vector"), out);
		else
			return new Value(new BuiltInTypeSymbol("int"), out);
	}
	
	public Integer getInt() {return data.get(0);}
	public BuiltInTypeSymbol getType() {return type;}
	public String getTypeName() {return type.getName();}
	
	private Value extend(Value value, Integer ext) {
		ArrayList<Integer> ret = new ArrayList<Integer>(this.data);
		while (ret.size() < value.data.size()) 
			ret.add(ext);
		return new Value(new BuiltInTypeSymbol("vector"), ret);
	}
	
	public void print() {
		String out = "[ ";
		if (type.getName().equals("int")) {
			out = data.get(0).toString();
		} else {
			for (int i=0; i<data.size(); i++) 
				out = out + data.get(i) + " ";
			out = out + "]";
		}
		System.out.println(out);
	}
	public String toString() {
		String out = type.getName();
		out = out + " <";
		for (int i=0; i<data.size(); i++)
			out = out + " " + data.get(i);
		
		return out + ">";
	}
	
	public Value clone() {
		return new Value(this.type, this.data);
	}
}
