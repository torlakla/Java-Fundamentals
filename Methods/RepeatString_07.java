package LAB.Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        int repeater=Integer.parseInt(scan.nextLine());
        System.out.println(repeatedString(input,repeater));

    }

    private static String repeatedString(String input,int repetitions) {
        StringBuilder result= new StringBuilder("");
        for (int i = 1; i <=repetitions; i++) {
            result.append(input);
        }

        return result.toString();
    }
}
