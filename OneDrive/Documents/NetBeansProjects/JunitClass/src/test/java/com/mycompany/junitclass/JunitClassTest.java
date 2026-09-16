package com.mycompany.junitclass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JunitClassTest {

    @Test
    public void testAdd() {
        JunitClass obj = new JunitClass();
        assertEquals(7, obj.add(3, 4));
        assertEquals(-1, obj.add(2, -3));
    }

    @Test
    public void testMax() {
        JunitClass obj = new JunitClass();
        assertEquals(10, obj.max(10, 3));
        assertEquals(5, obj.max(5, 5));
        assertEquals(9, obj.max(2, 9));
    }

    @Test
    public void testIsEmpty() {
        JunitClass obj = new JunitClass();
        assertTrue(obj.isEmpty(""));
        assertTrue(obj.isEmpty("   "));
        assertTrue(obj.isEmpty(null));
        assertFalse(obj.isEmpty("Hello"));
    }
}
