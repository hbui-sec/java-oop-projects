class MovieTicket {

// ===== Part A: Class Definition =====
// TODO A: Create two properties:
// - movieName (String)
// - pricePerTicket (double)
String movieName;
double pricePerTicket;

// ===== Part B: Constructor (With Parameters) =====
// TODO B: Add a constructor that accepts:
// - movieName
// - pricePerTicket
//
// The constructor must:
// 1. Receive these values from main()
// 2. Assign them to the instance variables
MovieTicket (String m, double p){
    movieName = m;
    pricePerTicket = p;
}
// ===== Part C: Method (With Parameter & Return) =====
// TODO C: Add a method calculateTotalCost(int numberOfTickets)
// This method should:
// 1. Calculate pricePerTicket * numberOfTickets
// 2. Return the result
    double calculateTotalCost(int numberOfTickets){
    return pricePerTicket * numberOfTickets;
    }
}

public class Main {
    public static void main(String[] args) {

// ===== Part D: Object Creation & Method Calls =====
// TODO D1: Create one MovieTicket object.
// Example: "Avatar", 12.5
    MovieTicket m1 = new MovieTicket("Avatar", 12.5);


// TODO D2: Call calculateTotalCost(3)
// Store the returned value in a variable.
double totalPriceOfTicket = m1.calculateTotalCost(3);
// TODO D3: Print:
// "Total Cost: $[value]"
        System.out.println("Total Cost: $" + totalPriceOfTicket);
    }
}