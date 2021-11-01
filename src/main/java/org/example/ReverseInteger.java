package org.example;

import java.math.BigInteger;

/**
 * Hello world!
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;

        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }





















    // the best
    public static int reverse1(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
    // mine
    public int reverse2(int x) {
        String signStr = x < 0 ? "-" : "";
        String numberStr = String.valueOf(x).replaceFirst("-", "");
        if (numberStr.length() == 1) {
            return x;
        }
        String reversedNumberStr = signStr + new StringBuilder(numberStr).reverse();
        BigInteger reversedNumber = new BigInteger(reversedNumberStr);
        if (reversedNumber.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0
            || reversedNumber.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return 0;
        }
        return reversedNumber.intValue();
    }
}
