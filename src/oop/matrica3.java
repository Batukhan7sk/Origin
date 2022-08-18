package oop;

import java.util.Scanner;


public class matrica3 {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        int[][] massiv = new int[5][6];
        int[] temp = new int[5];
        int k = 0;
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        int k4 = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                massiv[i][j] = input.nextInt();
                System.out.print(massiv[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (massiv[i][j] >= 0 & i == 0) {
                    temp[0] += massiv[0][j];
                    k++;
                }
                if (massiv[i][j] >= 0 & i == 1) {
                    temp[1] += massiv[1][j];
                    k1++;
                }
                if (massiv[i][j] >= 0 & i == 2) {
                    temp[2] += massiv[2][j];
                    k2++;
                }
                if (massiv[i][j] >= 0 & i == 3) {
                    temp[3] += massiv[3][j];
                    k3++;
                }
                if (massiv[i][j] >= 0 & i == 4) {
                    temp[4] += massiv[4][j];
                    k4++;
                }
            }

            temp[0] = temp[0] / k;
            temp[1] = temp[1] / k1;
            temp[2] = temp[2] / k2;
            temp[3] = temp[3] / k3;
            temp[4] = temp[4] / k4;
            System.out.println(massiv[0][0] + "Ariffmaticheskoe chislo = " + temp[0]);
            System.out.println(massiv[1][1] + "Ariffmaticheskoe chislo = " + temp[1]);
            System.out.println(massiv[2][2] + "Ariffmaticheskoe chislo = " + temp[2]);
            System.out.println(massiv[3][3] + "Ariffmaticheskoe chislo = " + temp[3]);
            System.out.println(massiv[4][4] + "Ariffmaticheskoe chislo = " + temp[4]);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (massiv[i][j] >= 0 & i == 0) {
                    temp[0] += massiv[0][j];
                    k++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (massiv[i][j] >= 0 & i == 0) {
                    temp[0] += massiv[0][j];
                    k++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (massiv[i][j] >= 0 & i == 0) {
                    temp[0] += massiv[0][j];
                    k++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (massiv[i][j] >= 0 & i == 0) {
                    temp[0] += massiv[0][j];
                    k++;
                }
            }
        }
    }
}
