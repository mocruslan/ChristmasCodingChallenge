package com.mocruslan.days;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DayOneTest {

    @Test
    void testSolve() {
        String input = """
                1abc2
                pqr3stu8vwx
                a1b2c3d4e5f
                treb7uchet
                """;
        DayOne dayOne = new DayOne(input);

        assertEquals(dayOne.solve(), 142);
    }
}