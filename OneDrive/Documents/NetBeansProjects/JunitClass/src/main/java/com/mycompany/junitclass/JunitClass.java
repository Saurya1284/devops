/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.junitclass;

public class JunitClass {

    public int add(int a, int b) {
        return a + b;
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}

