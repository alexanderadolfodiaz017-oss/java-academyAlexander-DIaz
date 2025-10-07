package com.pluralsight;

import java.util.Scanner;

public class famous_quotes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            String[] quotes = new String[]{
                    "1.You miss 100% of the shots you don't take.",
                    "2.Whats the point of hitting hard?If you can't land ",
                    "3.Keep your friends close ,but keep your enemies closer.",
                    "4.Show me your friends ,and I will show you your future.",
                    "5.Don't fix something that ain't broken.",
                    "6.Theres a difference between being in-shape and being in fighter-shape.",
                    "7.Never give up!",
                    "8.Just do it.",
                    "9.Styles make fights.",
                    "10.MMA math doesn't always work"

            };


            System.out.print("Pick a quote (select #1 - #10): ");
            int index = scanner.nextInt();
            index--;
            System.out.println(quotes[index]);


             } catch (Exception e) {
            System.out.println("Invalid Input");
            e.printStackTrace();


             }
             scanner.close();
    }
}