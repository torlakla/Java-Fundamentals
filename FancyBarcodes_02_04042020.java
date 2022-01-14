package Exercise.ExamExcersize;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02_04042020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Pattern barCodeRegex = Pattern.compile("^@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+$");
        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            Matcher matchBarcode = barCodeRegex.matcher(input);
            if (matchBarcode.find()) {
                Pattern digitRegex = Pattern.compile("[0-9]");
                Matcher matchDigit = digitRegex.matcher(input);
                StringBuilder digits = new StringBuilder();
                boolean isDigitFound = false;
                while (matchDigit.find()) {
                    digits.append(matchDigit.group());
                    isDigitFound = true;

                }
                if (isDigitFound) {
                    System.out.printf("Product group: %s%n", digits.toString());
                } else {
                    System.out.println("Product group: 00");
                }
            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
