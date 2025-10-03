package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int shipR = 1, shipC = 2, tries = 3;

        while (tries-- > 0) {
            System.out.print("Row 0-2: ");
            int r = s.nextInt();
            System.out.print("Col 0-2: ");
            int c = s.nextInt();

            if (r == shipR && c == shipC) { System.out.println("Boom!"); break; }
            else System.out.println("Miss!");
        }

        s.close();
    }
}
