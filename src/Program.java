public class Program {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.name = "Tom";
        tom.age = 26;
        tom.displayInfo();
    }
}
class Person{
    String name;
    int age;
    void displayInfo(){
        System.out.println(name + age);
    }

}