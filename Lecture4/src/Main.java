//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
System.out.println("How far will you need to travel to your destination?");
        // ===== Part C: Fare Calculation =====
        // Rates
        final double BASE = 2.50;
        final double PER_MILE = 1.75;
        final double PER_MIN = 0.25;
        // TODO C: Calculate fare using formula and print the result.

        // ===== Part D: Casting =====
        // TODO E: cast fare into an int (cashFare)
        // Print the value.

        /// ===== Part E: Final Receipt =====
        // TODO E: Print a neat receipt with:
        //  ---- Ride Receipt ----
        //  Name: <name>
        //  Miles: <distance>
        //  Minutes: <minutes>
        //  Exact Fare: $<fare>
        //  Cash Fare : $<cashFare>
        //  ----------------------
    }
}
