package LAB.Methods;

import java.util.Scanner;

public class Calculations_04Solo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operation=scan.nextLine();
        int number1=Integer.parseInt(scan.nextLine());
        int number2=Integer.parseInt(scan.nextLine());
        switch (operation){
            case"add":
                add(number1,number2);
                break;
            case "multiply":
                multiply(number1,number2);
                break;
            case "subtract":
                subtract(number1, number2);
                break;
            case"divide":
                divide(number1,number2);
                break;
        }


    }

    private static void add(int a,int b) {
        int result= a+b;
        System.out.println(result);

    }
    private static void multiply(int a,int b) {
        int result= a*b;
        System.out.println(result);
    }

    private static void subtract(int a, int b) {
        System.out.println(a-b);
    }


    private static void divide(int a, int b) {
        System.out.println(a/b);
    }
}
