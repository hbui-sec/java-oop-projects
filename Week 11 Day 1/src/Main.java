//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try {

        System.out.println("please enter you age: ");
        int age = in.nextInt();


        } catch (Exception e)   {
        System.out.println("invalid input");
    }
        System.out.println("the rest of the code...");
    }
}