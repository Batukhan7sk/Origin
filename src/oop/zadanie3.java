package oop;

import java.util.Scanner;


public class zadanie3 {
    public static void main(String[] args) {
        System.out.println("Vvedite massivy: ");
        Scanner input = new Scanner(System.in);
        int[] massiv = new int[10];
        int maxsum = 0;
        for(int i = 0; i < 10; i++){
            massiv[i] = input.nextInt();
            System.out.println(massiv[i]);
            if(massiv[i] > maxsum){
                maxsum = massiv[i];
            }
        }
        System.out.println("Max sum: " + maxsum);
        }

    }
