package org.example;

public class ReverseString {
    public static void main(String[] args) {
        char[] chars = {'c', 'a', 'b'};
        StringBuilder builder = new StringBuilder(String.valueOf(chars));
        System.out.println(builder.toString());
    }
}
