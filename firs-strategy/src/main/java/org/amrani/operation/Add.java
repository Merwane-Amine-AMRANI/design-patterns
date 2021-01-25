package org.amrani.operation;

public class Add extends AbstarctOperationType {

	@Override
	public int calculate(int leftOperand, int rightOperand) {

		return leftOperand + rightOperand;
	}

}
