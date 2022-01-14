package Exercise.Methods;

import java.util.Scanner;

public class CharacterInRange_03_solo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char startSymbol = scan.nextLine().charAt(0);
        char endSymbol = scan.nextLine().charAt(0);
        printAllSymbols(startSymbol, endSymbol);
    }

    private static void printAllSymbols(char a, char b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print((char) i + " ");

            }
        } else {
            for (int i = b + 1; i <= a; i++) {
                System.out.print((char) i + " ");
            }

        }
    }
}
