/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.kripptkat.mathutil.core.test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.krippykat.mathutil.core.MathUtility.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
        //assertThrows(expectedType, executable);
        //       ngoai le can bat|   doan code day ra ngoai le
        //                          dua 1 object chua doan code gay E
        //                          lambda expression dua vao
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
    @Test
    public void testFactorialGivenRightArguementReturnsWell(){
        
        
        assertEquals(1, getFactorial(0));
        assertEquals(1, getFactorial(1));
        assertEquals(2, getFactorial(2));
        assertEquals(6, getFactorial(3));
        assertEquals(24, getFactorial(4));
        assertEquals(120, getFactorial(5));
        
    }
}
