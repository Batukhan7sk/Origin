package oop;

public class zadanie9 {
    public static void main(String[] args) {
        int[] massiv = {4,5,9,25,78,44,56,99,87,28,27,45,85,99,77,73,81,51,46,65};
        boolean yesno = false;
        for(int i = 0; i < 20; i++){
            for(int a = i + 1; a < 20; a++){
                if(massiv[i] == massiv[a]) {
                    yesno = true;

                }
            }
        }
        System.out.println(yesno);

    }
}
