package com.mocruslan.days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOneTest {

    @Test
    void testSolve_NumbersFound() {
        String input = """
                two1nine
                eightwothree
                abcone2threexyz
                xtwone3four
                4nineeightseven2
                zoneight234
                7pqrstsixteen
                """;

        assertEquals(281, new DayOne(input).solve());
    }

    @Test
    void testSolve_StringNumberUppercase() {
        String input = """
                Two1Nine
                eightwothree
                abcone2THREExyz
                xtwone3FOUR
                4nineeightseven2
                zoneight234
                7pqrstsixteen
                """;

        assertEquals(281, new DayOne(input).solve());
    }
}