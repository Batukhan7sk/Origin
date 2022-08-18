package oop;

import java.util.Scanner;

public class massiv4 {
    public static void main(String[] args) {
        System.out.println("Vvedite chislo: ");
        Scanner number = new Scanner(System.in);
        int[] x = new int[10];
        int n = 0;
        for (int i = 0; i < 10; i++) {
            x[i] = number.nextInt();
        }
        for (int s : x) {
            if (s == 0) {
                s++;
                System.out.println(s);
            }
        }
    }
}
