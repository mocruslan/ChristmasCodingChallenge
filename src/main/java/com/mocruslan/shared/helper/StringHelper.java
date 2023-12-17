package com.mocruslan.shared.helper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static String replaceFirstAndLastNumberWords(String input) {
        Map<String, String> numberWordToNumber = createNumberWordToNumberMap();

        String regex = "(" + String.join("|", numberWordToNumber.keySet()) + ")";
        Matcher matcher = Pattern.compile(regex).matcher(input);

        StringBuilder result = new StringBuilder();
        int lastMatchEnd = 0;

        while (matcher.find()) {
            if (matcher.start() != lastMatchEnd) {
                result.append(input, lastMatchEnd, matcher.start());
            }

            result.append(numberWordToNumber.get(matcher.group()));
            lastMatchEnd = matcher.end();
        }

        if (lastMatchEnd < input.length()) {
            result.append(input.substring(lastMatchEnd));
        }

        return result.toString();
    }

    public static List<String> splitStringByLine(String str) {
        return Arrays.asList(str.split("\n"));
    }

    private static Map<String, String> createNumberWordToNumberMap() {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        return map;
    }
}
