//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Laptop {
    // ===== Part A: Class Definition =====
    // TODO A: Create two properties
    String brand;
    int ramGB;


    // ===== Part B: Method =====
    // TODO B: Add a method displayInfo() in Laptop class that prints:
    //  "Laptop: [brand], RAM: [ramGB] GB"
void displayInfo(){
    System.out.println("Laptop: " + brand + ", RAM: " + ramGB);
}
}

public class Main {
    public static void main(String[] args) {
Laptop lenovo = new Laptop();
lenovo.brand = "Lenovo";
lenovo.ramGB = 8;

Laptop hp = new Laptop();
hp.brand = "HP";
hp.ramGB = 16;
lenovo.displayInfo();
hp.displayInfo();


        // ===== Part C: Object Creation =====
        // TODO C: In main(), create two Laptop objects.
        //  Assign values to brand and ramGB directly using dot notation.



        // ===== Part D: Method Calls =====
        // TODO D: Call displayInfo() for both Laptop objects.
    }
}