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
    
    //5! =1*2*3*4*5
    //5! = 5*4!
    //4! = 1*2*3*4
    //4! = 4*3!
    //3! = 3*2!
    //2! = 2*1!
    // n! = n * n-1! -> công thức đệ quy xuất hiện
    //Đệ quy: gọi lại chính mình với quy mô nhỏ hơn
    
     public static long getFactorial(int n){ //n!
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0 to 20");
        
        if (n == 0 || n == 1)
            return 1;//n dac biet return som
        
        return n * getFactorial(n-1);
        
        //tối ưu code thay ruột hàm, code chạy nhanh hơn, đẹp hơn
        //dù sửa code vì lý do j thì phải đc test lại để đảm bảo rằng nó vẫn xanh
        //viết code đi kèm test script thì việc test lại cực nhanh, ko cần dùng mắt dò từng dòng lệnh đúng sai
        //nhìn xanh đỏ là đủ
        //test lại những j cần test: regression test( kiểm thử hổi quy)
        //cực nhanh vì GitHub Actions lo giùm, nhận mail chửi nếu code đỏ
                
    }
    
    // public static long getFactorial(int n){
    //    if(n < 0 || n > 20)
    //        throw new IllegalArgumentException("Invalid n. n must be 0 to 20");
        
    //    if (n == 0 || n == 1)
    //        return 1;//n dac biet return som
        
    //    long result = 1;//song sot den lenh nay, sure n = 2 to 20
        
    //    for (int i = 2; i <= n; i++) 
    //        result *= i;
        
    //    return result;
        
    //}
}
