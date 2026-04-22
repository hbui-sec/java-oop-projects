import java.util.Scanner;
class Book {
    String title;
    double[] details = new double[3];  // pages, year, price



    // TODO A1: Add a constructor that sets the book title
    Book (String t){
        title = t;
    }
    // TODO A2: Add a method printInfo() that prints:
    //   <title> details:
    //   Pages: <value>
    //   Year: <value>
    //   Price: <value>
    void printInfo(){
        System.out.println(title + " details:");
        System.out.println("Pages: " + details[0]);
        System.out.println("Year: " + details[1]);
        System.out.println("Price: " + details[2]);
    }

    // TODO A3: Add a method checkPrice() that prints:
    //   "This book is expensive." if price > 50
    //   "This book is affordable." otherwise
    void checkPrice(){
        if (details[2] > 50)
            System.out.println("This book is expensive.");
        else
            System.out.println("This book is affordable.");
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO B1: Ask "How many books?"
        System.out.println("How many books?");
        int bookAmount = input.nextInt();
        input.nextLine();


        // TODO B2: Use a while loop that many times:

        //   - Ask for book title
        //   - Create a Book object
        //   - Ask separately for Pages, Year, Price (store in the array)
        //   - Call printInfo() right away
        //   - Call checkPrice() right after
        for (int i = 1; i<=bookAmount; i++)
        {
        System.out.println("Enter title for book " + i);

        String tempName = input.nextLine();
        Book b = new Book(tempName);
        System.out.println("Enter number of pages: ");
        b.details[0] = input.nextInt();
        System.out.println("Enter year of publication: ");
        b.details[1] = input.nextInt();
        System.out.println("Enter price: ");
        b.details[2] = input.nextDouble();

        input.nextLine();
        b.printInfo();
        b.checkPrice();
        }


    }
}