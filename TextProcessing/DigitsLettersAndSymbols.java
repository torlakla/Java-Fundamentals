package LAB.TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        StringBuilder digits=new StringBuilder();
        StringBuilder letters=new StringBuilder();
        StringBuilder symbols=new StringBuilder();
        for (int i = 0; i <input.length(); i++) {
            char currentSymbol=input.charAt(i);
            if(Character.isDigit(currentSymbol)){
                digits.append(currentSymbol);
            }else if (Character.isAlphabetic(currentSymbol)){
                letters.append(currentSymbol);

            }else {
                symbols.append(currentSymbol);
            }


        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
