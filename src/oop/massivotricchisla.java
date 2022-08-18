package oop;

import java.util.Scanner;


public class massivotricchisla {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0;i < 10; i++){
            int x = numbers.nextInt();
            if (x < 0){
                System.out.print(x);
            }
            else{
                System.out.println("Net otricatelnix chisel");
            }
        }
    }
}
