package oop;

import java.util.Scanner;


public class zadanie6 {
    public static void main(String[] args) {
        System.out.println("Chetnie chisla: ");
        int[] massiv = {101, 123, 145, 187, 199, 164, 154, 188, 183, 123, 147, 144, 166, 158, 114, 154, 169, 167, 154, 200};
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (massiv[i] % 2 == 0) {
                System.out.println(massiv[i]);
                sum = sum + massiv[i];

                }
            }
        System.out.println("obwaya summa chetnix chisel: "+ sum);


        }
    }
