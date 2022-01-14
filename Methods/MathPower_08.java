package LAB.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number=Double.parseDouble(scan.nextLine());
        double power=Double.parseDouble(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculatePower(number,power)));


    }

    private static double calculatePower(double number, double power) {
        double result=1;
        for (int i = 1; i <=power; i++) {
            result=result*number;

        }
        //new DecimalFormat("0.####").format(result);


        return result;
    }
}
