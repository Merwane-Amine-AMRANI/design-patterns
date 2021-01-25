package org.amrani.operation.type;

import org.amrani.operation.type.implement.OperationType;
import org.amrani.operation.type.implement.OperationTypeFactory;

public class Main {

	public static void main(String[] args) {
		
		OperationTypeFactory factory = new OperationTypeFactoryImpl() ;
		
		OperationType addition = factory.createAddition();
		OperationType mult = factory.createMult();
		OperationType div = factory.createDiv();
		OperationType sub = factory.createSub();
		
		int operation1 = addition.calculate(5, 2);
		int operation2 = sub.calculate(5, 2);
		int operation3 = div.calculate(10, 2);
		int operation4 = mult.calculate(5, 2);
		
		System.out.println("We have an operation of: "+addition.toString() +" the result of this operation is: "+operation1);
		System.out.println("We have an operation of: "+sub.toString() +" the result of this operation is: "+operation2);
		System.out.println("We have an operation of: "+div.toString() +" the result of this operation is: "+operation3);
		System.out.println("We have an operation of: "+mult.toString() +" the result of this operation is: "+operation4);
	}

}
