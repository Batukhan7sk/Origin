package oop;

import java.util.Scanner;


public class scanner {
    public static void main(String[] args) {
        System.out.println("Vvedite den nedeli: ");
        Scanner week_days = new Scanner(System.in);
        int days = week_days.nextInt();
        if (days == 1){
            System.out.println("Ponedelnik");
        } else if (days == 2) {
            System.out.println("Vtornik");
        } else if (days == 3) {
            System.out.println("Sreda");
        } else if (days == 4) {
            System.out.println("Chetverk");
        } else if (days == 5) {
            System.out.println("Pyatnica");
        } else if (days == 6) {
            System.out.println("Subbota");
        }else {
            System.out.println("Voskresene");
        }
    }
}
