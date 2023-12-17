package com.mocruslan.days;


import com.mocruslan.shared.helper.StringHelper;

import java.util.ArrayList;
import java.util.List;

public class DayOne implements IDaySolver<Integer> {
    final protected String input;

    public DayOne(String input) {
        this.input = input;
    }

    @Override
    public Integer solve() {
        String data = this.normalize(this.input);

        List<Integer> numbers = new ArrayList<>();
        StringHelper.splitStringByLine(data).forEach(str -> {
                    if (str.isBlank()) return;

                    int[] digits = extractDigits(str);
                    numbers.add(Integer.parseInt(String.format("%d%d", digits[0], digits[digits.length - 1])));
                }
        );

        return numbers.stream().reduce(0, Integer::sum);
    }

    protected String normalize(String input) {
        input = input.toLowerCase();
        input = StringHelper.replaceFirstAndLastNumberWords(input);
        return input;
    }

    public static int[] extractDigits(String input) {
        return input.replaceAll("[^0-9]", "")
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
