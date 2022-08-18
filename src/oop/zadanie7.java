package oop;

public class zadanie7 {
    public static void main(String[] args) {
        int[] massiv = {10, 13, 14, 20, 33, 41, 21, 35, 49, 45, 48, 33, 28, 27, 47};
        for (int i = 0; i < 15; i++) {
            if((massiv[i] % 7 == 0) && (massiv[i] != 0)){
                System.out.println(massiv[i]);
            }
        }

    }
}