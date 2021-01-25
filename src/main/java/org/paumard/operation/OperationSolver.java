package org.paumard.operation;

import java.util.Objects;



public class OperationSolver implements OperationSolverService  {
	
//	public OperationSolver(OperationTypeFactory operationTypeFactory) {
//		// TODO Auto-generated constructor stub
//	}
	
	
	
	public OperationSolver() {
		
	}


	public int solve(String operation) {

		String operand = extractedOperation(operation);
		int rightOperand = extractedRightOperand(operation);
		int leftOperand = extractedLeftOperand(operation);

		if (Objects.equals(operand, "+")) {
			return leftOperand + rightOperand;
		} else if (Objects.equals(operand, "-")) {
			return leftOperand - rightOperand;
		} else if (Objects.equals(operand, "*")) {
			return leftOperand * rightOperand;
		} else if (Objects.equals(operand, "/")) {
			return leftOperand / rightOperand;
		}
		else return 0;
		

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

	@SuppressWarnings("unused")
	private String extractedOperation(String expression) {
		String[] elements = expression.split(" ");
		return elements[1];
	}
}
