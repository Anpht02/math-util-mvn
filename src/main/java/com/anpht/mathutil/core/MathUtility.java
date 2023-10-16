/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anpht.mathutil.core;

/**
 *
 * @author DELL
 */
//class nay chua cac ham static cho moi noi
//khi nào dung static? khi ta làm các hàm chỉ xử xong r trả về( return), ko cần lưu trữ thông tin vào instance return
public class MathUtility {
    
    public static final double PI = 3.14;
    
    
    //tinh n!
    //ko tinh -n!
    //quy uoc 0! = 1
    //ham giai thua tang rat nhanh
    //21! long chua ko noi -> getF() choi tu 0 -> 20
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0 to 20");
        
        if (n == 0 || n == 1)
            return 1;//n dac biet return som
        
        long result = 10;//song sot den lenh nay, sure n = 2 to 20
        
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;
        
    }
}
