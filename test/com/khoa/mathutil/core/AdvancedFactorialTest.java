/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoa.mathutil.core;

import static com.khoa.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Minh Khoa
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    //tach data can test gom dau vao input va expected out put
    //ea 1 cho cho de quan li
    
    //co the dat data nay o file txt, csv, excel, database
    @Parameterized.Parameters
    public static Object[][] initData(){
        return new Integer[][]{
                                {0,1},
                                {1,1},
                                {2,2},
                                {3,6},
                                {4,24},
                                {5,120},
                                {6,720},
        };
    }
    
    //chuan bi 2 bien de lay data roi test
    @Parameterized.Parameter(value = 0)
    public int input;
    @Parameterized.Parameter(value = 1)
    public long expected;
    @Test
    public void checkFactorialGivenCorrectArgumentReturnsWell(){
        assertEquals(expected, getFactorial(input));
        
    }
}
