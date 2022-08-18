package oop;

public class zadanie8 {
    public static void main(String[] args) {
        System.out.println("Chetnie chisla: ");
        int[] massiv = {1,5,8,7,45,69,14,12,98,57,50,45,77,88,97};
        int maxsum = 0;
        for(int i = 0; i < 15; i++){
            if(massiv[i] % 2 == 0){
                System.out.println(massiv[i]);
                if (massiv[i] > maxsum){
                    maxsum = massiv[i];

                }
            }
        }
        System.out.println("Max sum = " + maxsum);
    }
}
