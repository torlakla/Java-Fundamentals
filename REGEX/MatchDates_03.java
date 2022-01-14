package LAB.RegularExpressions_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        Pattern regex=Pattern.compile("(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})");
        Matcher match= regex.matcher(input);
        while (match.find()){
            System.out.printf("Day: %s, Month: %s, Year: %s%n",match.group("day"),match.group("month"),match.group("year"));
        }
    }
}
