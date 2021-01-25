package org.amrani.operationv2;

import java.util.List;
import java.util.function.Function;

public class OperationType {

	//@SuppressWarnings("unused")
	private final String name;
	private final Function<String, Integer> calculate;

	public OperationType(String name, Function<String, Integer> calculate) {
		this.name = name;
		this.calculate = calculate;
	}

	public int calculate(String expression) {
		return this.calculate.apply(expression);
	}

	private static final OperationType ADD = new OperationType("+",
			expression -> {
		int lefttOperand = extractLeftOperand(expression);
		int rightOperand = extractRightOperand(expression);
	
		return lefttOperand + rightOperand;
	});

	private static final OperationType MULT = new OperationType("*",
			expression -> {
		int lefttOperand = extractLeftOperand(expression);
		int rightOperand = extractRightOperand(expression);
		return lefttOperand * rightOperand;
	});
	
	private static final OperationType SUB = new OperationType("-",
			expression -> {
		int lefttOperand = extractLeftOperand(expression);
		int rightOperand = extractRightOperand(expression);
		return lefttOperand - rightOperand;
	});

	private static final OperationType DIV = new OperationType("/",
			expression -> {
		int lefttOperand = extractLeftOperand(expression);
		int rightOperand = extractRightOperand(expression);
		return lefttOperand / rightOperand;
	});
	
	private static final OperationType SQRT = new OperationType("SQRT",
			expression -> {
		int operand = extractLeftOperand(expression);
		return (int)Math.sqrt(operand);
	});

	private static int extractLeftOperand(String expression) {
		return Integer.parseInt(expression.split(" ")[0]);
	}

	private static int extractRightOperand(String expression) {
		return Integer.parseInt(expression.split(" ")[2]);
	}

	 private static final List<OperationType> operations =
			 List.of(ADD, MULT, SUB,DIV,SQRT);

	public static OperationType of(String operation) {
		return operations.stream()
		.filter(operationType -> operationType.name.equals(operation)).findAny().orElseThrow();
		
	}

}
