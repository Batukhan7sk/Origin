package oop;

public class sortpovozr {
    public static void main(String[] args) {
        int[] massiv = {5,-1,9,8,2,3,4,7,6,0};
        for (int i = 0; i < 10; i++){
            int maxindex = i;
            for (int j = i + 1; j < 10; j++){
                if(massiv[maxindex] > massiv[j]){
                    maxindex = j;
                }
            }
            int buf = massiv[i];
            massiv[i] = massiv[maxindex];
            massiv[maxindex] = buf;

        }
        for (int value: massiv){
            System.out.println(value);
        }
    }
}
