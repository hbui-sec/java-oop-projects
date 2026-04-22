import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // TODO A1: Ask the user for item name, price, and quantity
        System.out.println("Enter item name: ");
        // Example:
        String item = sc.nextLine();
        // Item: Milk
        System.out.println("Enter price: ");
        // Price: 3.49
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter quantity: ");
        // Quantity: 2
        int quantity = sc.nextInt();
        sc.nextLine();


        // TODO B1: Calculate the total cost (price * quantity)
        double totalCost = price * quantity;
        // TODO C1: Create a FileWriter for "receipt.txt"
        FileWriter receiptFile = new FileWriter("receipt.txt");
        // TODO C2: Write all purchase details to the file
        //System.out.println("Item: " + item + "\nPrice: " + price + "\nQuantity: " + quantity + "\nTotal: $" + totalCost);
        receiptFile.write("Item: " + item);
        receiptFile.write("\nPrice: " + price);
        receiptFile.write("\nQuantity: " + quantity);
        receiptFile.write("\nTotal: $" + totalCost);
        // TODO C3: Close the FileWriter and print "Receipt saved!"
        System.out.println("Receipt saved!");
        receiptFile.close();
    }
}