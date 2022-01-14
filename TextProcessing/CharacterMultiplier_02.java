package Exercise.TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        String one = input[0];
        String two = input[1];

        System.out.println(characterMultiplier(one, two));

    }

    private static String characterMultiplier(String one, String two) {
        int sum = 0;
        if (one.length() > two.length()) {
            for (int i = 0; i < two.length(); i++) {
                char currentSymbolOne = one.charAt(i);
                char currentSymbolTwo = two.charAt(i);
                sum = sum + (currentSymbolOne * currentSymbolTwo);
            }
            for (int j = two.length(); j < one.length(); j++) {
                char currentSymbol = one.charAt(j);
                sum += currentSymbol;

            }
        } else if (two.length() > one.length()) {
            for (int i = 0; i < one.length(); i++) {
                char currentSymbolOne = one.charAt(i);
                char currentSymbolTwo = two.charAt(i);
                sum = sum + (currentSymbolOne * currentSymbolTwo);
            }
            for (int j = one.length(); j < two.length(); j++) {
                char currentSymbol = two.charAt(j);
                sum += currentSymbol;

            }

        } else {
            for (int i = 0; i < one.length(); i++) {
                char currentSymbolOne = one.charAt(i);
                char currentSymbolTwo = two.charAt(i);
                sum = sum + (currentSymbolOne * currentSymbolTwo);

            }
        }


        return String.valueOf(sum);
    }
}
