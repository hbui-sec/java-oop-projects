import java.util.Scanner;

class Order {
    String drinkName;
    double basePrice;



    // TODO A1: Add a constructor that sets drinkName and basePrice.
    Order(String n, double b){
        drinkName = n;
        basePrice = b;

    }

    // TODO A2: Add a method printBill()
    //   - Ask: "Are you a café member (Y/N)?"
    //   - If the answer is "Y" or "y", apply a 10% discount.
    //   - Calculate finalPrice = basePrice - (basePrice * discount)
    //   - Print:
    //       Drink: <drinkName>
    //       Base Price: $<basePrice>
    //       Discount: <discount * 100> %
    //       Final Price: $<finalPrice>

    void printBill(){
        Scanner input = new Scanner(System.in);

        System.out.println("Are you a cafe member (Y/N)?");

        String answer = input.nextLine();
        double discount = 0.00;

        if (answer.equalsIgnoreCase("y")) {
            discount = 0.10;
        }
            double finalPrice = basePrice - (basePrice * discount);
            System.out.println("Drink: " + drinkName);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: " + discount * 100 + "%");
            System.out.println("Final Price: $" + finalPrice);



    }



}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // TODO B1: Display the coffee menu:
        //   1. Espresso ($3.50)
        //   2. Latte ($4.50)
        //   3. Cappuccino ($5.00)
        System.out.println("=== Coffee Menu ===");
        System.out.println("1. Espresso $3.50");
        System.out.println("2. Latte $4.50");
        System.out.println("3. Cappuccino ($5.00)");


        // TODO B2: Ask the user for their choice (1–3).

        {
            System.out.println("Enter your choice (1-3): ");
            int choice = input.nextInt();
            input.nextLine();

            // TODO B3: Use a switch statement to:
            //   - Create an Order object for the chosen drink
            //   - Each case should assign the correct drink name and price
            //   - Include a default case for invalid options


                switch (choice) {
                    case 1:
                        Order o1 = new Order("Expresso", 3.50);
                        o1.printBill();
                        break;
                    case 2:
                        Order o2 = new Order("Latte", 4.50);
                        o2.printBill();
                        break;
                    case 3:
                        Order o3 = new Order("Cappuccino", 5.00);
                        o3.printBill();
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            // TODO C1: Call printBill() to show the final amount.


            //if(choice <= 3){
              //Order tempOrder;
            //tempOrder.printBill();
            // }


        }
    }
}