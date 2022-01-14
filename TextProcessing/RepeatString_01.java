package LAB.TextProcessing;

import java.util.Scanner;

public class RepeatString_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        for (String word : words) {
            String repeatedWord= repeatWord(word, word.length());
            System.out.print(repeatedWord);

        }


    }

    private static String repeatWord(String word, int numberOfRepetitions) {
        StringBuilder result= new StringBuilder();
        for (int i = 0; i <numberOfRepetitions; i++) {
            result.append(word);
        }
        return result.toString();
    }
}
