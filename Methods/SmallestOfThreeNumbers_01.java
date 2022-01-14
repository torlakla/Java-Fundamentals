package Exercise.Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scan.nextLine());
        int secondNumber=Integer.parseInt(scan.nextLine());
        int thirdNumber=Integer.parseInt(scan.nextLine());
         printSmallestNUmber(firstNumber, secondNumber,thirdNumber);
    }

    private static void printSmallestNUmber(int number1, int number2, int number3) {
        if (number1<=number2 && number1 <=number3){
            System.out.println(number1);
        }else if (number2<=number1 && number2<=number3){
            System.out.println(number2);
        }else {
            System.out.println(number3);
        }
    }
}
