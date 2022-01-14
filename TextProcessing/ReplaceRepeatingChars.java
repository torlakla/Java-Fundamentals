package Exercise.TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        StringBuilder sb=new StringBuilder(input);
        for (int i = 0; i <sb.length()-1; i++) {
            char currentSymbol=sb.charAt(i);
            char compareSymbol=sb.charAt(i+1);
            if(currentSymbol==compareSymbol){
                sb.delete(i+1,i+2);
                i--;

            }

        }
        System.out.println(sb);
    }
}
