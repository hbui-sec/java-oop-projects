public class Main{
    public static void main(String[] args) {
        // ===== Part A: Strings =====
        // TODO A: Create a String variable called kioskName (example: "Miramar Print Kiosk")
        //         and print a welcome message using that variable.

String kioskName = "Miramar Print Kiosk";
System.out.println("Welcome to " + kioskName);

        // ===== Part B: Variables & Constants =====
        // TODO B: Create variables for priceBlack = 0.10, priceColor = 0.25,
        //         qtyBlack = 0, qtyColor = 0, and a constant TAX = 0.07.

        double priceBlack = 0.10, priceColor = 0.25;
        int qtyBlack= 0 , qtyColor = 0;
        final double TAX = 0.07;

        // ===== Part C: Increment =====
        // TODO C: Simulate printing by increasing qtyBlack and qtyColor  with ++
        qtyBlack++;
        qtyBlack++;
        qtyBlack++;
        qtyBlack--;
        qtyColor++;
        qtyColor++;
        qtyColor++;
        // ===== Part D: Arithmetic =====
        // TODO D: Calculate subtotal = (qtyBlack * priceBlack) + (qtyColor * priceColor),
        //         then calculate total = subtotal + (subtotal * TAX).
        double subtotal = (qtyBlack * priceBlack) + (qtyColor * priceColor);
        double total = subtotal + TAX;
        // ===== Part E: Receipt =====
        // TODO F: Print a simple receipt showing all values (quantities, subtotal, tax, total).

        System.out.println("Today's \"Print Summary\"\nBlack pages: "+qtyBlack);
        System.out.println("Color pages: "+qtyColor);
        System.out.println("Subtotal: " + subtotal);
        System.out.print("Total: " + total);
    }
}