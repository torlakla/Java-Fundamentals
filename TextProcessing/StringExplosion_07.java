package Exercise.TextProcessing;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder(input);
        int explosionStrength = 0;
        for (int i = 0; i < sb.length(); i++) {
            char currentSymbol = sb.charAt(i);
            if (currentSymbol == '>') {
                char explosionSt = sb.charAt(i + 1);
                explosionStrength += Character.getNumericValue(explosionSt);
                for (int j = explosionStrength; j > 0; j--) {

                    sb.deleteCharAt(i + 1);
                    explosionStrength--;
                    if (sb.length() <= i + 1) {
                        break;
                    }
                    if (sb.charAt(i + 1) == '>') {
                        break;
                    }

                }
            }


        }
        System.out.println(sb);
    }
}
