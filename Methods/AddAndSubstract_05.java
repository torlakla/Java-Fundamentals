package Exercise.Methods;

import java.util.Scanner;

public class AddAndSubstract_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=Integer.parseInt(scan.nextLine());
        int b=Integer.parseInt(scan.nextLine());
        int c=Integer.parseInt(scan.nextLine());
       // getSum(a,b);
       // getResult(getSum(a,b),c);
        System.out.println(getResult(getSum(a,b),c));
    }

    private static int getResult(int sum,int c) {
        return sum-c;
    }

    private static int getSum(int a,int b) {
        return a+b;
    }
}
