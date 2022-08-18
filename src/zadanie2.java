public class zadanie2 {
    public static void main(String[] args) {
        mobile phone = new mobile();
        mobile1 phone1 = new mobile1();
        mobile2 phone2 = new mobile2();

        phone.mobile = "samsung";
        phone1.mobile1 = "Iphone";
        phone2.mobile2 = "Oppo";
        phone.print();
        phone1.print();
        phone2.print();

    }
}
class mobile {
    String mobile;
    void print(){
        System.out.println(mobile);
    }
}
class mobile1 {
    String mobile1;
    void print(){
        System.out.println(mobile1);
    }
}
class mobile2 {
    String mobile2;
    void print(){
        System.out.println(mobile2);
    }
}