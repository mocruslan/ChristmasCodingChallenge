package com.mocruslan.shared.helper;

import org.junit.jupiter.api.Test;

import static com.mocruslan.shared.helper.StringHelper.*;
import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    @Test
    void testReplaceNumberWordsWithNumbers() {
        assertEquals("1", replaceFirstAndLastNumberWords("one"));
        assertEquals("2", replaceFirstAndLastNumberWords("two"));
        assertEquals("219", replaceFirstAndLastNumberWords("two1nine"));
        assertEquals("   5   ", replaceFirstAndLastNumberWords("   five   "));
        assertEquals("   5   2", replaceFirstAndLastNumberWords("   five   two"));
        assertEquals("42565", replaceFirstAndLastNumberWords("fourtwofivesix5"));
    }

    @Test
    void testIsNumeric() {
        assertTrue(isNumeric("22"));
        assertTrue(isNumeric("5.05"));
        assertTrue(isNumeric("-200"));
        assertTrue(isNumeric("10.0d"));
        assertTrue(isNumeric("   22   "));

        assertFalse(isNumeric(null));
        assertFalse(isNumeric(""));
        assertFalse(isNumeric("abc"));
    }
}