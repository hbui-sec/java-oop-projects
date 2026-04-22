//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car{
    String color;
    int year;

    void drive()
    {
        System.out.println("The " + year + " " + color+ " car is driving");
    }

}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.year = 2020;
        car1.drive();

        Car car2 = new Car();
        car2.color = "black";
        car2.year = 2010;
        car2.drive();
    }
}