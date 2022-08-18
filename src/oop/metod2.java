package oop;

public class metod2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int x = a;
        newmetod(a, b, x);
        System.out.println(x);
    }

    public static int newmetod(int a,int b,int x){
        if (x < b && b > x && a < b && b > a){
            return x;
        }else {
            return a;
        }
    }
}
