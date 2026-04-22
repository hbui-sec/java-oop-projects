import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//class checkAge{

    //void check(int age){
      //  if (age>18)
        //    System.out.println("you are eligible to vote");
        //else
          //  System.out.println("u can't vote, sorryyy");
        //System.out.println("thanks for participating");

//    }
//}




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number, 0 to stop:");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            sum = sum + num;
            System.out.println("Please enter number, 0 to stop:");
            num = sc.nextInt();



        }
        System.out.println("sum: " + sum);
    }
}

    //    System.out.println("please enter you age:");
      //  int age = sc.nextInt();

    //if (age >= 18)
      //      System.out.println("you are eligible to vote");
        //else
          //      System.out.println("u can't vote, sorryyy");
        //System.out.println("thanks for participating");
    //public static void main(String[] args) {
    //checkAge v1 = new checkAge();
    //v1.check(19);


