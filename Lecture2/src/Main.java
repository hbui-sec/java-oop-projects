//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final double TAX_RATE = 3.07; // constant
        int price = 5; // variable
// Calculate and print total
        double total = price + (price * TAX_RATE);
        System.out.println("Coffee: $" + price + " Total: $" + total);
    }
}