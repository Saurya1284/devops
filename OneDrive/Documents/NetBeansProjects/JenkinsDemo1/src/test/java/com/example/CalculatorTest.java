package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition")
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-10, calculator.add(-3, -7));
    }

    @Test
    @DisplayName("Test subtraction")
    void testSubtract() {
        assertEquals(1, calculator.subtract(5, 4));
        assertEquals(-1, calculator.subtract(4, 5));
        assertEquals(0, calculator.subtract(7, 7));
    }

    @Test
    @DisplayName("Test multiplication")
    void testMultiply() {
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(0, calculator.multiply(0, 100));
        assertEquals(-15, calculator.multiply(-3, 5));
    }

    @Test
    @DisplayName("Test division")
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(3, calculator.divide(9, 3));
    }

    @Test
    @DisplayName("Test division by zero throws exception")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }

    @Test
    @DisplayName("Test isEven")
    void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertTrue(calculator.isEven(0));
        assertFalse(calculator.isEven(7));
        assertFalse(calculator.isEven(-3));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 100, 200})
    @DisplayName("Parameterized test for even numbers")
    void testIsEvenParameterized(int number) {
        assertTrue(calculator.isEven(number));
    }
}
