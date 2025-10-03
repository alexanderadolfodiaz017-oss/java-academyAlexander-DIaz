package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String pigLatin = word.substring(1) + word.charAt(0) + "ay";
        System.out.println(pigLatin);

        scanner.close();
    }
}
