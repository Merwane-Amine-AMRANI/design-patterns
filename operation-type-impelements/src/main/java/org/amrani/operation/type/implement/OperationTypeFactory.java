package org.amrani.operation.type.implement;

public interface OperationTypeFactory {
	
	public OperationType createAddition();

	public OperationType createDiv();

	public OperationType createMult();

	public OperationType createSub();
	
}
