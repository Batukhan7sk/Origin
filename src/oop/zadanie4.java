package oop;

import java.util.Scanner;


public class zadanie4 {
    public static void main(String[] args) {
        int[] massiv = {1, 5, 9, 3};
        int obr = 0;
        for(int i : massiv){
            obr++;
        }
        for(int x = obr - 1; x >= 0; x--){
            System.out.println(massiv[x]);
        }
    }
}
