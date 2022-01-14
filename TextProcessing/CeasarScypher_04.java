package Exercise.TextProcessing;

import java.util.Scanner;

public class CeasarScypher_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <input.length(); i++) {
            char currentSymbol=input.charAt(i);

            sb.append((char)(currentSymbol+3));



        }
        System.out.println(sb);
    }
}
