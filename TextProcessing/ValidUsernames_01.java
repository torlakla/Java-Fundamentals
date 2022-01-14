package Exercise.TextProcessing;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] usernames = scan.nextLine().split(", ");

        for (String username : usernames) {
            if (username.length() >= 3 && username.length() <= 16) {
                boolean isValid = true;
                for (int j = 0; j < username.length(); j++) {
                    char currentSymbol = username.charAt(j);
                    if (!Character.isAlphabetic(currentSymbol) && !Character.isDigit(currentSymbol)
                            && currentSymbol != '-' && currentSymbol != '_') {
                        isValid = false;
                    }

                }
                if (isValid) {
                    System.out.println(username);
                }


            }


        }

    }
}

