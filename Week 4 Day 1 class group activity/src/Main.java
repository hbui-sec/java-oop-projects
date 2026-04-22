//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car{
    String make;
    String color;
    int year;

    Car(){
        make ="Honda";
        color="white";
    }
    void start(){
        System.out.println("The "+ color + " car is starting.");
    }

    void drive(){
        System.out.println("The "+ color + " car is driving.");
    }

    void stop(){
        System.out.println("The " + year + " " + color + " car is stopping.");
    }

}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        //c1.make ="Honda";
        //c1.color = "white";
        c1.year = 2005;

        //Call methods for c1
        c1.start();
        c1.drive();
        c1.stop();

        Car c2 = new Car();
        c2.start();
        c2.drive();
        c2.stop();
    }
}