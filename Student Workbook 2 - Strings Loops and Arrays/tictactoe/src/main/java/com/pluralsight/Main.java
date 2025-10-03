package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        char turn = 'X';

        for (int i = 0; i < 9; i++) {
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) System.out.print(board[r][c]+" ");
                System.out.println();
            }

            System.out.print("Player " + turn + " pick a spot: ");
            int spot = s.nextInt();

            for (int r = 0; r < 3; r++)
                for (int c = 0; c < 3; c++)
                    if (board[r][c] == ('0'+spot)) board[r][c] = turn;

            turn = (turn == 'X') ? 'O' : 'X';
        }

        System.out.println("Final board:");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) System.out.print(board[r][c]+" ");
            System.out.println();
        }

        System.out.println("Game over!");
        s.close();
    }
}
