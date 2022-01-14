package Exercise.TextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        double totalSum=0;
        for (String eachInput : input) {
            double currentSum=0;
            char firstSymbol=eachInput.charAt(0);
            char lastSymbol=eachInput.charAt(eachInput.length()-1);
            double firstSymbolPosition= Character.toLowerCase(firstSymbol) -96.0;
            double lastSymbolPosition=Character.toLowerCase(lastSymbol)-96.0;
            double number=Double.parseDouble(eachInput.substring(1,eachInput.length()-1));
            if(Character.isUpperCase(firstSymbol)){
                currentSum= currentSum + (number/firstSymbolPosition);
            }else {
                currentSum= currentSum + (number*firstSymbolPosition);
            }
            if(Character.isUpperCase(lastSymbol)){
                currentSum= currentSum-lastSymbolPosition;
            }else {
                currentSum= currentSum+lastSymbolPosition;
            }
            totalSum+=currentSum;


        }
        System.out.printf("%.2f",totalSum);
    }
}

