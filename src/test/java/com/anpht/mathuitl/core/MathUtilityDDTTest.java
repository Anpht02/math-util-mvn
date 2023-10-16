/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anpht.mathuitl.core;

import com.anpht.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DELL
 */
public class MathUtilityDDTTest {
    
    //ta tách bộ data kiểm thử ra khỏi câu lệnh ss
    //kỹ thuật này gọi là DDT(Data-driven Testing) - kiểm thử app tách riêng bộ data ra 1 chỗ để dêx kiểm thử
    //data test để riêng ra 1 chỗ(1 file excel)
    //1! = 1
    //2! = 2
    //3! = 6
    //4! = 24
    //5! = 120
    //mùi mảng 2 chiều
    public static Object[][] initData(){
        //int a[] = //viết phần tử mảng cách nhau bằng dấu ","
    
        Object[][] testData = {{0,1}, 
                               {1,1}, 
                               {2,2}, 
                               {4,24}, 
                               {5,120}
                               //n expected
                               };
    return testData;
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void VerifyFactorialGivenRightArguementReturnsOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
