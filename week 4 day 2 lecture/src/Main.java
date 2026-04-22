//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Phone{
    String brand;
    double price;

    Phone(String x, double y){
        brand = x;
        price = y;
    }

    void showPhone(){
        System.out.printf("Brand: " + brand + ", Price: $%.2f\n" , price);
        //System.out.println("Brand: " + brand + ", Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Phone motorolaversion1 = new Phone("Motorola", 999999);
        motorolaversion1.showPhone();
        Phone galaxyS9001Plus = new Phone("Samsung", 1.00);
        galaxyS9001Plus.showPhone();
        Phone chromePhoneVersionOver9000 = new Phone("Google", 2.01);
        chromePhoneVersionOver9000.showPhone();
        Phone iPhone99 = new Phone("Apple", .5);
        iPhone99.showPhone();

    }
}