package oop;

public class zadanie10 {
    public static void main(String[] args) {
        String[] tovar = {"apple","banana","arbuz","grusha","apple"};
        for(int i = 0; i < tovar.length; i++){
            for(int j = 1 ;j < tovar.length; j++){
                if (tovar[i].equals(tovar[j]) == true){
                    System.out.println("Pervy tovar povtoryaetsya = " + tovar[i=0]);
                    System.out.println("Udalyaem povtoryayuwiesya pervy element: ");
                    for (int s = 1; s < tovar.length; s++)
                    System.out.println(tovar[s]);
                    break;

                }
            }
            break;
        }
    }
}
