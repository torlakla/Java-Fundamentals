package Exercise.Methods;

import java.util.Scanner;

public class VolvelsCount_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine().toLowerCase();
        printVowelsCount(input);



    }
    static void printVowelsCount (String text){
        int count=0;
        for (int index = 0; index <=text.length()-1; index++) {
            char currentSymbol = text.charAt(index);
            switch (currentSymbol){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }

        }
        System.out.println(count);
    }
}
