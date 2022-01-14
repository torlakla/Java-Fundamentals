package Exercise.RegularExpressions_Regex;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Pattern starRegex = Pattern.compile("[starSTAR]");
            Matcher starMatcher = starRegex.matcher(input);
            int decryptionKey = 0;
            while (starMatcher.find()) {
                decryptionKey++;
            }
            StringBuilder messageSB = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char currentSymbol = input.charAt(j);
                char newSymbol = (char) (currentSymbol - decryptionKey);
                messageSB.append(newSymbol);
            }
            String message = messageSB.toString();
            Pattern encryptionRegex = Pattern.compile("@(?<planet>[a-zA-Z]+)[^@!:>-]*:(?<population>\\d+)[^@!:>-]*!(?<type>[AD])![^@!:>-]*->(?<soldiers>\\d+)");

            Matcher encryptionMatcher = encryptionRegex.matcher(message);
            if (encryptionMatcher.find()) {
                String planet = encryptionMatcher.group("planet");
                String attack = encryptionMatcher.group("type");
                if (attack.equals("A")) {
                    attackedPlanets.add(planet);
                } else {
                    destroyedPlanets.add(planet);
                }

            }
        }
        attackedPlanets.sort(String::compareTo);
        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        for (String attackedPlanet : attackedPlanets) {
            System.out.println("-> "+attackedPlanet);
        }
        destroyedPlanets.sort(String::compareTo);
        System.out.printf("Destroyed planets: %d%n",destroyedPlanets.size());
        for (String destroyedPlanet : destroyedPlanets) {
            System.out.println("-> "+destroyedPlanet);

        }
    }
}
