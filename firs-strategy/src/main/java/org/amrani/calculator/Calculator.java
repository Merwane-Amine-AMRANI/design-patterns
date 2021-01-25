package org.amrani.calculator;

import org.amrani.operationv2.OperationType;

public class Calculator {

	public int calculate(String expression) {

		
		String operation = extractedOperation(expression);

// 		AbstarctOperationType operationType =
// 			OperationTypeFatory.of(operation);
		
		OperationType operationType =
				OperationType.of(operation);
		
		int result = operationType.calculate(expression);

		return result;
	}

	@SuppressWarnings("unused")
	private int extractedLeftOperand(String expression) {
		String[] elements = expression.split(" ");
		String leftOperand = elements[0];
		return Integer.parseInt(leftOperand);
	}

	@SuppressWarnings("unused")
	private int extractedRightOperand(String expression) {
		String[] elements = expression.split(" ");
		String rightOperand = elements[2];
		return Integer.parseInt(rightOperand);
	}

	private String extractedOperation(String expression) {
		String[] elements = expression.split(" ");
		return elements[1];
	}
}
