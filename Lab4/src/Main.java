
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ===== Part A: Greeting & Name =====
        // TODO A: Ask for the rider's full name (String) and print a welcome message.
        System.out.println("What is your full name?");
        String fullName = in.nextLine();
        System.out.println("Welcome, " + fullName + ".");
        // ===== Part B: Trip Inputs =====
        // TODO B: Ask for distance (double) and time (int), then print them.
        System.out.println("How many miles will you need to travel to your destination?");
        double distance = in.nextDouble();
        System.out.println("Okay, you will travel " + distance + " miles to your destination." +
                "\nHow many minutes will it take to reach your destination?");
        int time = in.nextInt();
        System.out.println("Great, we will reach your destination in " + time + " minutes.");
        // ===== Part C: Fare Calculation =====
        // Rates
        final double BASE = 2.50;
        final double PER_MILE = 1.75;
        final double PER_MIN = 0.25;
        // TODO C: Calculate fare using formula and print the result.
        double totalFare = BASE + (PER_MILE * distance) + (PER_MIN * time);
        System.out.printf("It's going to cost you $%.2f to get to the destination.", totalFare);
        // ===== Part D: Casting =====
        // TODO E: cast fare into an int (cashFare)
        int whole = (int)totalFare;
        System.out.println("\nIf you are paying cash, it will be only " + whole + " dollars.");
        // Print the value.

        // ===== Part E: Final Receipt =====
        // TODO E: Print a neat receipt with:
        //  ---- Ride Receipt ----
        //  Name: <name>
        //  Miles: <distance>
        //  Minutes: <minutes>
        //  Exact Fare: $<fare>
        //  Cash Fare : $<cashFare>
        //  ----------------------
        System.out.println("\nHere is your receipt!\nName: " + fullName + "\nMiles: " + distance);
        System.out.printf("Minutes: " + time + "\nExact Fare: $%.2f", totalFare);
        System.out.println("\nCash fare: $" + whole);
    }
}
