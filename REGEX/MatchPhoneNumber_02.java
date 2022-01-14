package LAB.RegularExpressions_regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern regex = Pattern.compile("\\+359([ \\-])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher match = regex.matcher(input);
        List<String> matchedNames = new ArrayList<>();
        while (match.find()) {
            matchedNames.add(match.group());

        }
        System.out.println(String.join(", ", matchedNames));

    }
}
