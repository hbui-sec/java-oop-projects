import java.util.Scanner;

class Student {
    // ===== Part A: Class Definition =====

    // TODO A0:
    // Declare a String variable for student name
    String name;

    // TODO A0:
    // Declare an array of size 3 to store:
    // assignment, midterm, final scores
    int[] scoreTypes = new int[3];

    // TODO A1:
    // Write a constructor that:
    // - takes the student name as a parameter
    // - stores it in the variable
    Student (String n){
        name = n;
    }

    // TODO A2:
    // Write a method printInfo() that prints:
    // <name> scores:
    // Assignment: <value>
    // Midterm: <value>
    // Final: <value>
    void printInfo()
    {
        System.out.println(name + " scores: ");
        System.out.println("Assignment: " + scoreTypes[0]);
        System.out.println("Midterm: " + scoreTypes[1]);
        System.out.println("Final: " + scoreTypes[2]);

    }

    // TODO A3:
    // Write a method checkPass() that:
    // - calculates the average inside the method
    // - if average >= 60 → print "<name> passed."
    // - otherwise → print "<name> failed."
    void checkPass(){

        double sum = scoreTypes[0]+scoreTypes[1]+scoreTypes[2];
        double scoreAverage = sum / scoreTypes.length;
        if (scoreAverage >= 60)
            System.out.println(name + " passed.");
        else
            System.out.println(name + " failed.");

    }
}

public class Main {
    public static void main(String[] args) {

        // ===== Part B: Input Loop =====

        // TODO B0:
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // TODO B1:
        // Ask the user: "How many students?"
        System.out.println("How many students?");
        int amountOfStudent = sc.nextInt();
        sc.nextLine();

        // TODO B2:
        // Use a while loop that runs that many times
        // Inside the loop:
        //   - Ask for student name
        //   - Create a Student object
        //   - Ask for:
        //       assignment score
        //       midterm score
        //       final score
        //   - Store them in the array
        //   - Call printInfo()
        //   - Call checkPass()
        int i = 1;
        while (i<=amountOfStudent)
        {
        System.out.println("Enter name for student " + i + ": ");
        String tempName = sc.nextLine();
        Student s = new Student(tempName);
        System.out.println("Enter assignment score: ");
        s.scoreTypes[0]= sc.nextInt();
        System.out.println("Enter midterm score: ");
        s.scoreTypes[1] = sc.nextInt();
        System.out.println("Enter final score: ");
        s.scoreTypes[2] = sc.nextInt();
        sc.nextLine();
        s.printInfo();
        s.checkPass();
        i++;

        }

    }
}