package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String formatted = formatName("Bob", "Smith");
        System.out.println(formatted);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
