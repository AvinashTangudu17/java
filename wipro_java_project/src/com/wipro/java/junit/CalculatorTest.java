/**
 * 
 */
package com.wipro.java.junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 */
public class CalculatorTest {
	
	private final Calculator calculator = new Calculator();
	
	
	@Test

    public void testAdd() {

        int result = calculator.add(3, 2);

        assertEquals(5, result);

    }
	
	@Test

    public void testSub() {

        int result = calculator.sub(3, 2);

        assertEquals(1, result);
        
    }
	@Test

    public void testAddawithNegativeNumbers() {

        int result = calculator.add(-7, -2);

        assertEquals(-9, result);
        
    }
	@Test

    public void testSubWithNegativeNumbers() {

        int result = calculator.sub(-3, -2);

        assertEquals(-1, result);
        
    }

}
