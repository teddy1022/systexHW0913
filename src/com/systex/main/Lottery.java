package com.systex.main;

import java.util.HashSet;
import java.util.Set;

public class Lottery {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <loop_count> <exclude_numbers>");
            System.out.println("Example: java Lottery 2 \"5 25 30 33 42\"");
            return;
        }

        int loopCount = Integer.parseInt(args[0]);

        Set<Integer> excludeNumbers = parseExcludedNumbers(args[1]);

        generateRandomSets(loopCount, excludeNumbers);
    }
    
    public static Set<Integer> parseExcludedNumbers(String excludeNumbersStr) {
        Set<Integer> excludeNumbers = new HashSet<>();
        String[] numbers = excludeNumbersStr.split(" ");
        for (String number : numbers) {
            excludeNumbers.add(Integer.parseInt(number.trim()));
        }
        return excludeNumbers;
    }

    public static void generateRandomSets(int loops, Set<Integer> excludeNumbers) {
        for (int i = 0; i < loops; i++) {
            Set<Integer> numbers = new HashSet<>();
            while (numbers.size() < 6) {
                int randomNumber = (int)(Math.random() * 49) + 1;
                if (!excludeNumbers.contains(randomNumber)) {
                    numbers.add(randomNumber);
                }
            }
            System.out.println("Random set " + (i + 1) + ": " + numbers);
        }
    }
}
