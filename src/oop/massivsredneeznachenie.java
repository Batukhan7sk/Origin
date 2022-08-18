package oop;

import java.util.Scanner;


public class massivsredneeznachenie {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int[] a = new int[5];
        int b = 0;
        for (int i = 0;i < 5; i++){
            a[i] = numbers.nextInt();
        }for (int num: a) {
            b = (b + num);
        }
        System.out.println(b / 5);
    }
}
