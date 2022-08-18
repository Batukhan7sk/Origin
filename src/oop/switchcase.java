package oop;

public class switchcase {
    public static void main(String[] args) {
        int month = 4;
        String month_weel;
        switch (month){
            case 1: month_weel = ("Yanvar");
                System.out.println("Yanvar");
                break;
            case 2: month_weel = ("Fevral");
                System.out.println("Fevral");
            break;
            case 3: month_weel = ("Mart");
                System.out.println("Mart");
            break;
            default:
                System.out.println("NO");
        }
    }
}
