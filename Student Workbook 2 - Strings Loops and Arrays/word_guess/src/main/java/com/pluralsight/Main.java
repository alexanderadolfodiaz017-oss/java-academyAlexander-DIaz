package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = "java";
        char[] g = {'_', '_', '_', '_'};
        int a = 5;

        while (a > 0) {
            System.out.println(g);
            char c = s.next().charAt(0);
            boolean ok = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) { g[i] = c; ok = true; }
            }
            if (!ok) a--;
            if (new String(g).equals(word)) { System.out.println("You guessed it!"); break; }
        }

        if (!new String(g).equals(word)) System.out.println("Word was: " + word);
        s.close();
    }
}
