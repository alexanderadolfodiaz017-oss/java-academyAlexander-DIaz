package com.pluralsight;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);

        System.out.println(Arrays.equals(w1, w2));

        scanner.close();
    }
}
