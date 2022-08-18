package oop;

import javax.swing.*;

public class massiveee {
    public static void main(String[] args) {
        int tablica[] = {1,4,6,7,10,11,55};
        for(int a = 0; a < tablica.length; a++){
            System.out.println(a);
        }
        double sum = 0;
        for (int a = 0; a < tablica.length; a++){
            sum += tablica[a];
        }
        System.out.println("Summa chsel " + sum);
        double max = 0;
        for (int a = 0; a < tablica.length; a++){
            if (tablica[a] > max) max = tablica[a];
        }
        System.out.println("Max: " + max);
    }
}
