package oop;

public class zadanie5 {
    public static void main(String[] args) {
        int[] massiv = {4,5,9,25,78,44,56,99,99,28,27,45,85,99,77,73,81,51,46,65};
        boolean orderly = true;
        for(int i = 0; i < 20; i++){
            if(massiv[i] > massiv[i+1]){
                orderly = false;
                break;
            }
        }
        System.out.println(orderly);

    }
}
