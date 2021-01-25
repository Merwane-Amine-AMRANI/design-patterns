package org.amrani.operation.type;

import org.amrani.operation.type.implement.OperationType;
import org.amrani.operation.type.implement.OperationTypeFactory;

public class OperationTypeFactoryImpl implements OperationTypeFactory {

		public OperationType createAddition() {
			return Add.getInstance();
			}
		public OperationType createSub() {
			return Sub.getInstance();
			}
		public OperationType createDiv() {
			return Div.getInstance();
			}
		public OperationType createMult() {
			return Mult.getInstance();
			}
		
}
