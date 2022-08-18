public class Phone {
    static int count;
    String model = "none";

    public Phone(String model){
        this.model = model;
        count++;
        System.out.println(model);
    }

}
