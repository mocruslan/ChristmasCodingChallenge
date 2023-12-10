package com.mocruslan;

import com.mocruslan.days.DayOne;

import java.util.Scanner;

public class ChallengeRunner {
    public void run() {
        String input = getMultiLineConsoleInput();

        DayOne dayOne = new DayOne(input);
        System.out.println("Result: " + dayOne.solve());
    }

    protected String getMultiLineConsoleInput() {
        System.out.println("Enter multiple lines (enter an empty line to finish):");
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputLines = new StringBuilder();

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputLines.append(line).append("\n");
        }

        System.out.println("You entered:");
        System.out.println(inputLines);

        scanner.close();
        return inputLines.toString();
    }
}
