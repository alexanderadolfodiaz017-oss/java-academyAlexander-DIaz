package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = (c == 'z') ? 'a' : (c == 'Z') ? 'A' : (char)(c + 1);
            result += c;
        }

        System.out.println(result);
        scanner.close();
    }
}
