class UberRide {

// ===== Part A: Class Definition =====
// TODO A: Create two properties:
// - riderName (String)
// - totalCost (double)
String riderName;
double totalCost;
// ===== Part B: Constructor =====
// TODO B: Add a constructor that accepts riderName.
// Set riderName.
// Set totalCost to 0.
UberRide(String r){
    riderName = r;
}
// ===== Part C: Method (With Parameter) =====
// TODO C: Add a method addRide(double cost)
// This method should:
// 1. Add cost to totalCost
// 2. Print: "[riderName] added a ride of $[cost]"

    void addRide (double cost){
    totalCost = totalCost + cost;
    System.out.printf(riderName + " added a ride of $%.2f\n", cost);
    }
// ===== Part D: Method (No Parameter) =====
// TODO D: Add a method printTotal()
// This method should print:
// "[riderName]'s total cost: $[totalCost]"
    void printTotal(){
    System.out.printf(riderName + "'s total cost: $%.2f", totalCost);
    }
}

public class Main {
    public static void main(String[] args) {

// ===== Part E: Object Creation & Method Calls =====
// TODO E1: Create one UberRide object.
// Example: "Alex"
UberRide u1 = new UberRide("Alex");
// TODO E2: Call addRide(15)
        u1.addRide(15);
// TODO E3: Call addRide(20)
        u1.addRide(20);
// TODO E4: Call printTotal()
        u1.printTotal();
    }
}