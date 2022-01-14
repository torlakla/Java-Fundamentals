package Exercise.Methods;

import java.util.Scanner;

public class CalculateFactorial_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=Integer.parseInt(scan.nextLine());
        int b=Integer.parseInt(scan.nextLine());
        double fact1=calculateFactorial(a);
        double fact2=calculateFactorial(b);
        double result=fact1*1.0 /fact2;
        System.out.printf("%.2f",result);
    }

    private static double calculateFactorial(int number) {
        double fact=1;
        for (int i = 1; i <=number; i++) {
            fact= fact*i;

        }
        return fact;
    }
}
