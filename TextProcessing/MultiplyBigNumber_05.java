package Exercise.TextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger firstNumber = new BigInteger(scan.nextLine());
        BigInteger secondNumber = new BigInteger(scan.nextLine());
        // System.out.println(firstNumber.add(secondNumber));
        //System.out.println(firstNumber.subtract(secondNumber));
        //System.out.println(firstNumber.divide(secondNumber));
        System.out.println(firstNumber.multiply(secondNumber));
    }
}
