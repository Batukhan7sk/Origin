package oop;

import java.util.Scanner;


public class zadanie13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[11];
        int max = 0;
        int maxind = 0;
        max = array[0];
        for(int i = 0; i < 10; i++){
            if(max < array[i]){
                max = array[i];
                maxind = i;
            }
            for (int j = 11-1; j > maxind; j--){
                array[j] = array[j-1];
            }
            array[maxind+1] = maxind;
        }
    }
}
