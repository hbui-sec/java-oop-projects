import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Do you agree? (yes/no): ");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("You agreed!");
        } else {
            System.out.println("You did not agree.");
        }
    }
    }
