package org.ruber.examples.example1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CountCharactersTest {

    public static final String TEST = "test";
    public static final char CHAR_TO_COUNT = 't';
    public static final int TEST_COUNT = 4;
    public static final int COUNT_T = 2;

    @Test
    public void testCountDefinedWord() {
        assertEquals(CountCharacters.countChars(TEST), TEST_COUNT);
    }

    @Test
    public void testCountEmptyWord() {
        assertEquals(CountCharacters.countChars(""), 0);
    }

    @Test
    public void testCountDefinedChar() {
        assertEquals(CountCharacters.countDefinedChar(TEST, CHAR_TO_COUNT), COUNT_T);
    }
}