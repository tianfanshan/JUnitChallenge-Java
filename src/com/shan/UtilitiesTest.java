package com.shan;

import static org.junit.Assert.*;

public class UtilitiesTest {

    // Challenge 9
    private Utilities util;

    @org.junit.Before
    public void beforeAll() {
        util = new Utilities();
        System.out.println("Before all");
    }

    @org.junit.Test
    public void everyNthChar() {
        // Challenge 4
        char[] output = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},2);
        assertArrayEquals(new char[] {'e', 'l'},output);
        // Challenge 5
        char[] output2 = util.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'},output2);
    }

    @org.junit.Test
    public void removePairs() {
        // Challenge 2 3
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @org.junit.Test
    public void converter() throws Exception {
        // Challenge 7
        assertEquals(300, util.converter(10,5));
    }

    // Challenge 8
    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception {
        util.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        // Challenge 6
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}