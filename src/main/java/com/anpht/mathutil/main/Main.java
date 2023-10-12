/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.anpht.mathutil.main;

import com.anpht.mathutil.core.MathUtility;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //test case 1 - xem mo ta o duoi (case: n = 0)
        int n = 0; // tinh huong kiem tra 0!
        long expected = 1;//0! hy vong = 1
        long actual = MathUtility.getFactorial(n); //0! thuc te la may, goi ham va run la biet
        
        //so sanh expected va actual
        System.out.println("0! -> expected = " + expected + 
                                   " | actual = " + actual);
        //cach 1: kiem thu bang suc nguoi 
        
        //test case 2 - nhu duoi
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("1! -> expected = " + expected + 
                                   " | actual = " + actual);
        
        //test case 3 - nhu duoi
        System.out.println("6! -> expected = 720" + 
                                   " | actual = " + MathUtility.getFactorial(6));

    }
}
  //dev test code cua minh
        //C1: in ket qua xu li ra man hinh
        
        //nhắc lại công việc QC: 
        //Thiết kế test case -> run test case -> ghi lại bug(nếu có, log bug)
        //Test cáe nói ra: QC test app như thế nào
        //Đưa data vào, giá trị expected, cách dùng app, bộ data đó như thế nào
        //Lát chạy thử như thế nào
        //-> TEST RUN
        
        //ĐỀ thi PE; Thiết kế test case
        //ta thiết kế test case để tính hàm giai thừa ta vừa viết\
        //test code: Unit test, test case để test code -> "Unit test" test case
        
        //Test case 1: check getF() with n = 0
        //STEPS; PROCEDURES
        // 1. Given n = 0
        // 2. Call GetF()
        
        // EXpected result: the method returns 1 stands for 0! = 1
        //STATUS :Passed or Failded? -> lucs chayj hamf
                                    // test run, cos theer test nhieeu laanf
        
        //test case 2: checkF() with n = 1
        //STEPS; PROCEDURES
        // 1. Given n = 1
        // 2. Call/Invoke GetF( n = 1)
        
        // Expected result: the method returns 1 stands for 1! = 1
        // STATUS :Passed or Failded? -> to be updated later after finish test run
                                    // test run, cos theer test nhieeu laanf
        //test case 3: checkF() with n = 6
        //STEPS; PROCEDURES
        // 1. Given n = 6
        // 2. Call/Invoke GetF(n = 6)
        
        // Expected result: the method returns 720 stands for 6! = 720
        // STATUS :Passed or Failded? -> to be updated later after finish test run
                                    // test run, cos theer test nhieeu laanf
