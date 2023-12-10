package com.mocruslan.days;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayOne implements IDaySolver<Integer> {
    final protected String input;

    public DayOne(String input) {
        this.input = input;
    }

    public Integer solve() {
        ArrayList<Integer> numbers = new ArrayList<>();
        this.getInputAsList().forEach(str -> {
                    Integer firstDigit = this.getFirstDigitFromString(str);
                    Integer lastDigit = this.getLastDigitFromString(str);

                    numbers.add(Integer.parseInt(String.format("%d%d", firstDigit, lastDigit)));
                }
        );

        return numbers.stream().reduce(0, Integer::sum);
    }

    protected List<String> getInputAsList() {
        return Arrays.asList(input.split("\n"));
    }

    protected Integer getFirstDigitFromString(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", "").substring(0, 1));
    }

    protected Integer getLastDigitFromString(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", "").substring(
                str.replaceAll("[^0-9]", "").length() - 1)
        );
    }
}
