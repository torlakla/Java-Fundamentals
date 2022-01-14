package Exercise.Methods;

import java.util.Scanner;

public class MiddleCharacter_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {
        int stringLength=input.length();
        if (stringLength %2==0){
            System.out.print(""+input.charAt((stringLength/2)-1)+input.charAt(stringLength/2));

        }else {
            System.out.print(""+ input.charAt(stringLength/2));

        }
    }
}
