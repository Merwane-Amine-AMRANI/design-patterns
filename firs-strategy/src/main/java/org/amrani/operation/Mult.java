package org.amrani.operation;

public class Mult extends AbstarctOperationType {

	@Override
	public int calculate(int leftOperand, int rightOperand) {

		return leftOperand * rightOperand;
	}

}
