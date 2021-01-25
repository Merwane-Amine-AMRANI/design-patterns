package org.amrani.operation.type.implement;

public interface OperationType {

	/**
	 * return <code>int</code> the operation between two arguments of <code>int</code>.
	 * 
	 * @param lefOperand
	 * @param RightOperand
	 * @return result of an integer 
	 * 
	 * */
	public int calculate(int lefOperand, int RightOperand);
	/**
	 * return the string of the operation type
	 * 
	 * @return
	 */
	String toString();
	
	
}
