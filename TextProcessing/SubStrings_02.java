package LAB.TextProcessing;

import java.util.Scanner;

public class SubStrings_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String wordToRemove = scan.nextLine();
        String longWord = scan.nextLine();
        while (longWord.contains(wordToRemove)) {

            longWord = removeOccurence(longWord, wordToRemove);
        }
        System.out.println(longWord);


    }

    private static String removeOccurence(String longWord, String wordToRemove) {
        int behindIndex=longWord.indexOf(wordToRemove);
        int endIndex=behindIndex+ wordToRemove.length();
        String result= longWord.substring(0,behindIndex)+ longWord.substring(endIndex);
        return result;
    }
}
