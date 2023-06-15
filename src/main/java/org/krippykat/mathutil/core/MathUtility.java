/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.krippykat.mathutil.core;

/**
 *
 * @author Admin
 */

//clone java.util.Math cua JDK
public class MathUtility {
    public final static double PI = 3.14;
    
    //hàm tính n! = 1.2...n
    //0! = 1! = 1
    //ko có giai thừa âm
    //21 giai thừa là vượt kiểu long, vượt 18 con số 0
    //mình ko chấp nhận là n > 20
    public static long getFactorial(int n){
        //TODO...
        
        long product = 1; //tích ban đầu = 1
        
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20, plz.");
        }
        if (n == 0 || n == 1) 
            return 1;
        for (int i = 2; i <= n; i++)
            product *=i;
        
        return product;
    }
    //return sớm để hàm ko báo lỗi
}
