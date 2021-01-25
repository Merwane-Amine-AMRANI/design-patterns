package org.paumard.operation;

//import org.amrani.operation.type.OperationTypeFactoryImpl;
//import org.amrani.operation.type.implement.OperationTypeFactory;


public class Operation {

	public static void main(String[] args) {
		
		

		
		@SuppressWarnings("unused")
	//	OperationTypeFactory operationTypeFactory = new OperationTypeFactoryImpl();
		OperationSolver  operationSolver = new OperationSolver();

		String op1 = "2 + 3"; 
		String op2 = "3 - 1"; 
		String op3 = "3 * 2";
		String op4 = "10 / 5";
		
		
		
		System.out.println("Result of this operation is: "+operationSolver.solve(op1));
		System.out.println("Result of this operation is: "+operationSolver.solve(op2));
		System.out.println("Result of this operation is: "+operationSolver.solve(op3));
		System.out.println("Result of this operation is: "+operationSolver.solve(op4));

		

	}

}
