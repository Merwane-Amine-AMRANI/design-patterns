package org.amrani.operation.type;

import org.amrani.operation.type.implement.OperationType;

public class Add implements OperationType {
	
	private static Add INSTANCE = new Add();
	private Add(){} 
	
	public static Add getInstance()
    {
		return INSTANCE;
    }
	
	public int calculate(int leftOpearnde, int rightOperande) {
		return leftOpearnde + rightOperande;
	}
	
	public String toString() {
		return " + ";
	}
}
