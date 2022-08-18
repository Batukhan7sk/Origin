package oop;

import java.util.Scanner;

public class matrica2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] massiv = new int[7][7];
        System.out.print("Tablica:");
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                massiv[i][j] = input.nextInt();

                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
        int k = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if(massiv[i][j] < 0){
                    k += massiv[i][j];


                }
            }

        }
        System.out.println("Modul:" + Math.abs(k));
    }
}