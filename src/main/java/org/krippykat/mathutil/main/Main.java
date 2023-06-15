/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.krippykat.mathutil.main;

import org.krippykat.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Test case #1: n = 0
        System.out.println("Check getF(0) 0! | expected: 1 | actual: " + MathUtility.getFactorial(0));
        
        //Test case #2: n = 1
        System.out.println("Check getF(1) 1! | expected: 1 | actual: " + MathUtility.getFactorial(1));
        
        //Test case #3: n = 2
        System.out.println("Check getF(2) 2! | expected: 2 | actual: " + MathUtility.getFactorial(2));
        
        //Test case #4: n = 3
        System.out.println("Check getF(3) 3! | expected: 3 | actual: " + MathUtility.getFactorial(3));
        
        //Test case #5: n = 5
        System.out.println("Check getF(5) 5! | expected: 120 | actual: " + MathUtility.getFactorial(5));
        
        //Test case #6: n = -1
        System.out.println("Check getF(-1) -1! | expected: Exception | actual: ");
        MathUtility.getFactorial(-1);   //vì ngoại lệ sẽ ngắt lệnh println()
                                        //in trước rồi chờ ngoại lệ xh
        
    }
    
    //THIẾT KẾ HÀM GIAI THỪA: ÂM GIAI THỪA VÀ > 20! THÌ KO TÍNH ĐC
    //HÀM SẼ NÉM RA NGOẠI LỆ
    
        //test case 2:check if getF() with n = 1;
        //Steps/Procedures (các bước tiến hành test)
        //              1. Given n = 1
        //              2. Execute getF(n = 1)
        //Expected:  (hàm hy vọng trả về mấy)
        //              getF(1) 1! must return 1
    
        //ta đã có hàm tính giai thừa, ta phải test hàm
        //test thông qua các test case, những tình huống xài hàm
        //chuẩn bị bộ dât và expected value
        //sau đó run các test case để coi đúng sai!!!
        
        //test case 1:(tên, mục đích của test case) check if getF() returns well with n = 0;
        //Steps/Procedures (các bước tiến hành test)
        //              1. Given n = 0
        //              2. Execute getF(n = 0)
        //Expected:  (hàm hy vọng trả về mấy)
        //              getF(0) 0! must return 1
    
    //TDD: Test Driven Development: viết code, làm app theo style
    //code và test song hành với nhau
    //code và test code là cặp vài trùng, code liên tục đc test
    //dù mới viết sơ sơ
    //phải nghĩ ngay luôn  các bộ test case khi bắt đầu viết code
    
    
}
