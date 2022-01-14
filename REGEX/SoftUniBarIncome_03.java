package Exercise.RegularExpressions_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Pattern validRegex = Pattern.compile("%(?<customer>[A-Z][a-z]+)%[^.$%|]*<(?<product>\\w+)>[^.$%|]*\\|[^.$%|0-9]*(?<count>\\d+)\\|[^.$%|0-9]*(?<price>\\d+\\.?\\d*)\\$");
        double totalPrice = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = validRegex.matcher(input);
            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price")) * 1.0;
                double currentPrice = price * (double) count;
                totalPrice += currentPrice;
                System.out.printf("%s: %s - %.2f%n", customer, product, currentPrice);


            }
                input = scan.nextLine();


        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}
