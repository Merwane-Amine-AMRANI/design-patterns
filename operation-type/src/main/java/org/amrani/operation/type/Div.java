package org.amrani.operation.type;

import org.amrani.operation.type.implement.OperationType;

public class Div implements OperationType {
	
	private static Div INSTANCE = new Div();
	private Div(){} 
	
	public static Div getInstance()
    {
		return INSTANCE;
    }

	public int calculate(int leftOperand, int rightOperand) {
		return leftOperand / rightOperand;
		}
		
		public String toString() {
			return " / ";
		}

}
