import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ------------------------------
        // Part A — Game Logic
        // ------------------------------

        // TODO A1: Display a menu with the following options:
        //   1. Easy
        //   2. Medium
        //   3. Hard
System.out.println("=== Choose Game Level ===");
System.out.println("1. Easy");
System.out.println("2. Medium");
System.out.println("3. Hard");

        // TODO A2: Ask the user to enter their choice (1–3)
        //   Example: "Enter your choice (1–3): "
System.out.println("Enter your choice (1-3): ");
int choice = input.nextInt();
        // TODO A3: Declare an integer variable named points and set it to 0.
int points = 0;

        // TODO A4: Use a switch statement to set points:
        //   - If choice is 1 → set points = 10 and print "You selected Easy level."
        //   - If choice is 2 → set points = 20 and print "You selected Medium level."
        //   - If choice is 3 → set points = 30 and print "You selected Hard level."
        //   - Otherwise → print "Invalid choice!"
        switch (choice)
        {
            case 1:
                points = 10;
                System.out.println("You selected Easy level.");
                break;
            case 2:
                points = 20;
                System.out.println("You selected Medium level.");
                break;
            case 3:
                points = 30;
                System.out.println("You selected Hard level.");
                break;
            default:
                System.out.println("Invalid choice!");
        }


        // ------------------------------
        // Part B — Conditional Operator
        // ------------------------------

        // TODO B1: Use a conditional operator to decide the result message:
        //   If points >= 20 → message = "You won a prize!"
        //   Otherwise → message = "Try again next time."
String msg = (points >= 20) ? "You won a prize!":"Try again next time.";

        // ------------------------------
        // Part C — Output
        // ------------------------------

        // TODO C1: Print the points and the result message.
        //   Example:
        //   "Points earned: 20"
        //   "You won a prize!"
        if (choice <= 3) {
            System.out.println("Points earned: " + points);
            System.out.println(msg);
        }
    }
}

