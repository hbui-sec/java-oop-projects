//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //double[] prices = {20, 30.5, 80.99};
        double[] prices = new double[3];
        Scanner in = new Scanner(System.in);

        prices[0] = 40.5;
        prices[1] = in.nextDouble();
        System.out.println(prices[0]);
        System.out.println(prices[1]);
    }
}