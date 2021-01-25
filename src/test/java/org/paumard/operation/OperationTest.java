package org.paumard.operation;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class OperationTest {


    @Test 
    public void should_return_5_when_operation_is_2_add_3() {

        // Given
        String operation = "2 + 3";
        int expectedResult = 5;
        OperationSolver operationSolver = new OperationSolver();

        // When
        int result = operationSolver.solve(operation);

        // Then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

    @Test 
    public void should_return_2_when_operation_is_8_sub_2() {

        // Given
        String operation = "8 - 2";
        int expectedResult = 6;
        OperationSolver operationSolver = new OperationSolver();

        // When
        int result = operationSolver.solve(operation);

        // Then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    public void should_return_2_when_operation_is_6_mult_3() {

        // Given
        String operation = "6 * 3";
        int expectedResult = 18;
        OperationSolver operationSolver = new OperationSolver();

        // When
        int result = operationSolver.solve(operation);

        // Then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }

    @Test 
    public void should_return_2_when_operation_is_10_div_5() {

        // Given
        String operation = "10 / 5";
        int expectedResult = 2;
        OperationSolver operationSolver = new OperationSolver();

        // When
        int result = operationSolver.solve(operation);

        // Then
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
}
