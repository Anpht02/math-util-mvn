/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anpht.mathuitl.core;

import com.anpht.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class MathUtilityTest {

    //testcase 1 struceture:
    //ID | Description | Steps | expected/actual | status
    //Testcase 1: Verify getF() function with n = 0
    //Steps:
    // 1. Given n = 0
    // 2. call getF(int n)
    //Expected result
    // the method getF(n =0) must returns 1 as the result 0! = 1
    // status passed/ failed khi chạy
    @Test // dính đến thuật ngữ framework
    public void verifyFactorialGivenRightArguement0ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    //Testcase 2: Verify getF() function with n = 1
    //Steps:
    // 1. Given n = 1
    // 2. call getF(int n)
    //Expected result
    // the method getF(n =1) must returns 1 as the result 1! = 1
    // status passed/ failed khi chạy

    @Test // dính đến thuật ngữ framework
    public void verifyFactorialGivenRightArguement1ReturnsOk() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    //Testcase 3: Verify getF() function with n = 6
    //Steps:
    // 1. Given n = 6
    // 2. call getF(int n)
    //Expected result
    // the method getF(n =6) must returns 720 as the result 6! = 720
    // status passed/ failed khi chạy

    @Test // dính đến thuật ngữ framework
    public void verifyFactorialGivenRightArguement6ReturnsOk() {
        assertEquals(720, MathUtility.getFactorial(6));
    }

}
