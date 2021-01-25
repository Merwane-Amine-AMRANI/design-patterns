package org.amrani.calculator;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculatorTest {

	
    @Test	
	public void should_return_5_when_expression_is_3_add_2() {
		//Given 
		String expression = "3 + 2";
		int excepetedResult = 5;
		Calculator calculator = new Calculator();
		
		//when 
		int result = calculator.calculate(expression);
		
		//Then 
		
		Assertions.assertThat(result).isEqualTo(excepetedResult);
	}
    
    @Test	
 	public void should_return_6_when_expression_is_4_add_2() {
 		//Given 
 		String expression = "4 + 2";
 		int excepetedResult = 6;
 		Calculator calculator = new Calculator();
 		
 		//when 
 		int result = calculator.calculate(expression);
 		
 		//Then 
 		
 		Assertions.assertThat(result).isEqualTo(excepetedResult);
 	}
    
    @Test	
 	public void should_return_5_when_expression_is_8_sub_3() {
 		//Given 
 		String expression = "8 - 3";
 		int excepetedResult = 5;
 		Calculator calculator = new Calculator();
 		
 		//when 
 		int result = calculator.calculate(expression);
 		
 		//Then 
 		
 		Assertions.assertThat(result).isEqualTo(excepetedResult);
 	}
    
    @Test	
 	public void should_return_24_when_expression_is_8_mult_3() {
 		//Given 
 		String expression = "8 * 3";
 		int excepetedResult = 24;
 		Calculator calculator = new Calculator();
 		
 		//when 
 		int result = calculator.calculate(expression);
 		
 		//Then 
 		
 		Assertions.assertThat(result).isEqualTo(excepetedResult);
 	}
    
    @Test	
  	public void should_return_5_when_expression_is_10_div_2() {
  		//Given 
  		String expression = "10 / 2";
  		int excepetedResult = 5;
  		Calculator calculator = new Calculator();
  		
  		//when 
  		int result = calculator.calculate(expression);
  		
  		//Then 
  		
  		Assertions.assertThat(result).isEqualTo(excepetedResult);
  	}
    
    @Test	
  	public void should_return_3_when_expression_is_sqrt_9() {
  		//Given 
  		String expression = "9 SQRT";
  		int excepetedResult = 3;
  		Calculator calculator = new Calculator();
  		
  		//when 
  		int result = calculator.calculate(expression);
  		
  		//Then 
  		
  		Assertions.assertThat(result).isEqualTo(excepetedResult);
  	}
	
}
