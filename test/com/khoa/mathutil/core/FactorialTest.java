/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoa.mathutil.core;

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Minh Khoa
 */
public class FactorialTest {
    
    @Test //viet code dung de test code chinh MathUtil
    // ten ham phair noi len muc dich cua viec test
    public void checkFactorialGivenCorrectArgumentReturnsWell(){
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        Assert.assertEquals(1, MathUtil.getFactorial(1));
    }
    
    @Test(expected = IllegalArgumentException.class) 
    // bien ham nay thanh public static void main()
    // day la cu phap, quy tac cua bo thu vien junit
    public void checkFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
        MathUtil.getFactorial(21);
    }
}
