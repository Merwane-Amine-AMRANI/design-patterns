package org.amrani.operation;

import java.util.Objects;

public class OperationTypeFatory {

	public static AbstarctOperationType of(String operation) {
		if (Objects.equals(operation, "+")) {
			return new Add();
		} else if (Objects.equals(operation, "-")) {
			return new Sub();
		} else if (Objects.equals(operation, "*")) {
			return new Mult();
		} else if (Objects.equals(operation, "/")) {
			return new Div();
		}
		return null;
	}

}
