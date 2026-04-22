import java.util.Scanner;
import java.util.Scanner;

class Student {
    String name;
    int[] grades = new int[3];

    Student(String n)
    {
        name = n;
    }

    void printInfo()
    {
        System.out.println("name: "+ name);
        for (int i=0; i<3; i++)
        System.out.println("Grades " + (i+1) + ": " + grades[i]);

    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many students: ");
        int num = sc.nextInt();
        sc.nextLine();



        for (int i=1; i<=num; i++) {
            System.out.println("Enter name for student " + i + ": ");
            String temp = sc.nextLine();

            Student s = new Student(temp);

            for (int j=1; j<=3; j++) {
                System.out.println("Enter grade " + j + ": ");
                s.grades[j - 1] = sc.nextInt();

            }
            sc.nextLine();
            s.printInfo();
        }

    }
}