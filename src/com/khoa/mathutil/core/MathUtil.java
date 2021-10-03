/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoa.mathutil.core;

/**
 *
 * @author Minh Khoa
 */
public class MathUtil {
    public static long getFactorial(int n){
        if (n<0||n>20)
            throw new IllegalArgumentException("n from 0 to 20");
        
        if (n==0||n==1)
            return 1;
        
        return n*getFactorial(n-1);
    }
}
