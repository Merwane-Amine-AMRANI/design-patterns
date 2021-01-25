package org.amrani.operation.type;

import org.amrani.operation.type.implement.OperationType;

public class Mult implements OperationType {
	
	private static Mult INSTANCE = new Mult();
	private Mult(){} 
	
	public static Mult getInstance()
    {
		return INSTANCE;
    }

	public int calculate(int leftOperand, int rightOperand) {

		return leftOperand * rightOperand;
	}
	
	public String toString() {
		return " * ";
	}

}
