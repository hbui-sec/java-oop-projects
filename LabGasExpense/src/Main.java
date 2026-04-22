import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO A1: Ask the user how many trips they made
        System.out.println("How many trips did you make?");
        int amountOfTrip = input.nextInt();
        input.nextLine();
        // TODO A2: Create a double array with that size
        double[] trip = new double[amountOfTrip];

        // TODO B1: Use a for loop to enter the gas cost for each trip
        // Example: "Enter gas cost for trip 1:"
        for (int i=0; i<trip.length; i++){
            System.out.println("Enter gas cost for trip 1:");
            trip[i] = input.nextDouble();
            input.nextLine();
        }

        // TODO B2: Use another for loop to display each trip’s cost
        System.out.println("--- Gas Expensive Summary ---");
        for (int i=0; i<trip.length; i++){

            System.out.printf("Trip " + (i+1) + ": %.2f\n", trip[i]);
        }

        // TODO C1: Calculate and print the total and average gas cost
        double sum = 0;
        for (int i=0; i<trip.length; i++){
        sum = sum + trip[i];

        }
        System.out.printf("Total spent on gas: %.2f", sum);
        double average = sum / trip.length;
        System.out.printf("\nAverage per trip: %.2f", average);

    }
}