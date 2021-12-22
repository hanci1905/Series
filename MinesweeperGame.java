package MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static boolean isValid(int k, int l, int row, int col) {
        // Returns true if row number and column number
        // is in range
        return (k >= 0) && (k < row) &&
                (l >= 0) && (l < col);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter column num : ");
        int col = input.nextInt();
        System.out.print("Enter row num : ");
        int row = input.nextInt();

        char[][] table = new char[row][col];
        char[] mines = new char[row * col];
        char[][] table2 = new char[row][col];


        for (int i = 0; i < ((row * col)); i++) {

            mines[i] = '-';
        }
        for (int i = 0; i < ((row * col) / 4); ) {
            int number = (int) (Math.random() * (row * col));
            if (mines[number] != 'X') {
                mines[number] = 'X';
                i++;
            }
        }
        int z = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                table[i][j] = mines[z];
                z++;


            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println(" ");
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                table2[i][j] = '-';
            }
        }
        int count = 0;
        System.out.println("Welcome to mineswepeer Game!!! ");
        char flag = '0';
        int count2 = 0;
        while (flag != '1') {
            System.out.println("sutun giriniz ");
            int l = input.nextInt();
            System.out.println("satir giriniz ");
            int k = input.nextInt();
            if (isValid(k - 1, l - 1, row, col) == true) {

                if (table[k - 1][l - 1] == 'X')
                    count++;
            }
            if (isValid(k - 1, l, row, col) == true) {

                if (table[k - 1][l] == 'X')
                    count++;
            }

            if (isValid(k - 1, l + 1, row, col) == true) {

                if (table[k - 1][l + 1] == 'X')
                    count++;
            }

            if (isValid(k, l - 1, row, col) == true) {

                if (table[k][l - 1] == 'X')
                    count++;
            }
            if (isValid(k, l + 1, row, col) == true) {

                if (table[k][l + 1] == 'X')
                    count++;
            }
            if (isValid(k + 1, l - 1, row, col) == true) {

                if (table[k + 1][l - 1] == 'X' && l - 1 < col && k + 1 < row && 0 <= l - 1 && 0 <= k + 1)
                    count++;
            }
            if (isValid(k + 1, l, row, col) == true) {

                if (table[k + 1][l] == 'X' && l < col && k + 1 < row && 0 <= l && 0 <= k + 1)
                    count++;
            }
            if (isValid(k + 1, l + 1, row, col) == true) {

                if (table[k + 1][l + 1] == 'X' && l + 1 < col && k + 1 < row && 0 <= l + 1 && 0 <= k + 1)
                    count++;
            }


            count2++;
            if (count2 - 1 >= ((row * col) / 4)) {
                flag = '1';
                System.out.println("GAME Won ");
            }
            table2[k][l] = (char) (count + '0');
            if (table[k][l] == 'X') {
                System.out.println("GAME LOST ");
                flag = '1';
                table2[k][l] = 'X';
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(table2[i][j]);
                }
                System.out.println(" ");
            }
            count = 0;

        }
    }
}




