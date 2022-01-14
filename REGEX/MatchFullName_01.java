package LAB.RegularExpressions_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        String reg="\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern regex= Pattern.compile(reg);
        Matcher match= regex.matcher(input);
        while (match.find()){
            System.out.print(match.group()+ " ");
        }
    }
}
