class City {
    // ===== Part A: Class Definition =====
    // TODO A: Create two properties
    // - name (String)
    // - population (int)
String name;
int population;
    // ===== Part B: Method =====
    // TODO B: Add a method displayInfo() in City class that prints:
    // "City: [name], Population: [population]"
void displayInfo(){
    System.out.println("City: " + name + ", Population: " + population);
}
    // ===== Part C: Constructor =====
    // TODO C: Add a constructor that accepts two parameters (n, p)
    // and sets name and population
    City(String n, int p){
    name = n;
    population = p;
    }
}

public class Main {
    public static void main(String[] args) {
        // ===== Part D: Object Creation & Method Calls =====
        // TODO D: Create two City objects using the constructor
        // Example: new City("San Diego", 1400000);
        // Call displayInfo() for both objects
        City sanDiego = new City("San Diego", 1400000);
        sanDiego.displayInfo();
        City vancouver = new City("Vancounver", 675000);
        vancouver.displayInfo();
        City javaCity = new City("Java Diego Angeles", 0);
        javaCity.population = 1;
        javaCity.population = javaCity.population + 1;
        javaCity.displayInfo();
    }
}