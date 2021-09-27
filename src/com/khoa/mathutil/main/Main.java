/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khoa.mathutil.main;

import com.khoa.mathutil.core.MathUtil;

/**
 *
 * @author Minh Khoa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("0!: 1? "+ MathUtil.getFactorial(0));
        System.out.println("1!: 1? "+ MathUtil.getFactorial(1));
        System.out.println("2!: 2? "+ MathUtil.getFactorial(2));
        System.out.println("5!: 120? "+ MathUtil.getFactorial(5));
        
        //muốn thấy ngoại lệ hay ko phải gọi để xem app bị giết
    }
    
}
