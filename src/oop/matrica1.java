package oop;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;


public class matrica1 {
    public static void main(String[] args) {
        System.out.println("Input array: ");
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][4];
        int n = 3;
        int m = 4;
        int temp[] = new int[n * m];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = input.nextInt();
            }

        }
        System.out.println("OLD: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[k] = a[i][j];
                Arrays.sort(temp);
            }
        }
        System.out.println("SORT: ");
        System.out.println(Arrays.toString(temp));
        System.out.println("NEW: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = temp[k++];
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }

    }

}
