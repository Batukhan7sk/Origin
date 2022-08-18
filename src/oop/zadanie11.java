package oop;

import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {

        int[] a = new int[8];
        int[] b = new int[8];
        int[] c = new int[16];
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        for (int i = 0; i < 8; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("input b");
        for (int i = 0; i < 8; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) {
                c[i] = a[i / 2];
            } else {
                c[i] = b[i / 2];
            }
        }
        for (int value : c) {
            System.out.println(value);
        }
    }
}
