package edu.jsu.mcis;

import java.util.*;
import java.lang.*;
import java.io.*;

	
public class Argument{
	public enum Type {BOOLEAN, FLOAT, INTEGER, STRING};
	private Object value;
	private String description;
	private Type type;
	private String name;
	

	public Argument(){
		value = "";
		description = "";
		type = Type.STRING;
		name = "";
	}

	public void setArgumentValue (Object value){
		this.value = value;
	}

	public <T> T getArgumentValue(){
		if (type == Type.INTEGER) return (T)(Integer.valueOf((String)value));		
		else if (type == Type.BOOLEAN) return (T)(Boolean.valueOf((String)value));
		else if (type == Type.FLOAT) return (T)(Float.valueOf((String)value));
		else if (type == Type.STRING) return (T)(String.valueOf((String)value));
		return (T)(String)value;
	}

	public void setArgumentType(Type type){
		this.type = type;
	}

	public Type getArgumentType(){
		return type;
	}

	public void setArgumentDescription(String description){
		this.description = description;
	}

	public String getArgumentDescription(){
		return description;
	}
	
	public void setArgumentName (String name){
		this.name = name;
	}
	public String getArgumentName(){
		return name;
	}

}
