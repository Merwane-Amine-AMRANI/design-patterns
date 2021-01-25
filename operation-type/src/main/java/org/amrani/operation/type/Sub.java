package org.amrani.operation.type;

import org.amrani.operation.type.implement.OperationType;

public class Sub implements OperationType {

	private static Sub INSTANCE = new Sub();
	private Sub(){} 
	
	public static Sub getInstance()
    {
		return INSTANCE;
    }
	
	public int calculate(int leftOperand, int rightOperand) {
		
		return leftOperand - rightOperand;
	}
	
	public String toString() {
		return " - ";
	}

}
