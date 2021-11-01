package org.example;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        char[] numbers = String.valueOf(x).toCharArray();
        if (numbers.length == 0 || numbers[0] == '-') return false;
        int positiveIterator = 0;
        int negativeIterator = numbers.length - 1;
        int middleOfNumber = numbers.length / 2;
        while (middleOfNumber != positiveIterator) {
            if (numbers[positiveIterator] != numbers[negativeIterator]) return false;
            positiveIterator++;
            negativeIterator--;
        }
        return true;
    }
}
