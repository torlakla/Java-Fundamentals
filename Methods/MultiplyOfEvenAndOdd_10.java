package LAB.Methods;

import java.util.Scanner;

public class MultiplyOfEvenAndOdd_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input=Math.abs(Integer.parseInt(scan.nextLine()));
        System.out.println(getMultipliedNumber(input));
    }
    public static int getMultipliedNumber(int number){
        int even= getEvenNumber(number);
        int odd=getOddNumber(number);
        return even* odd;
    }
    private static int getEvenNumber(int number) {
        int sumEven=0;
        while (number>0){
            int digit=number%10;
            if(digit%2==0){
                sumEven+=digit;
            }
            number=number/10;
        }
        return sumEven;

    }

    private static int getOddNumber(int number) {
        int sumOdd=0;
        while (number>0){
            int digit=number%10;
            if(digit%2!=0){
                sumOdd+=digit;
            }
            number/=10;
        }
        return sumOdd;

    }

}
