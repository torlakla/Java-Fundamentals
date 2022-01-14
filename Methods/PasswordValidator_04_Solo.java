package Exercise.Methods;

import java.util.Scanner;

public class PasswordValidator_04_Solo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        if (!passLenght(input)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!passContent(input)){
            System.out.println("Password must consist only of letters and digits");
        }if(!passDigitChecker(input)){
            System.out.println("Password must have at least 2 digits");
        }
        if (passLenght(input) && passContent(input) && passDigitChecker(input)){
            System.out.println("Password is valid");
        }
    }

    private static boolean passDigitChecker(String password) {
        int digitCounter=0;
        for (int i = 0; i <password.length(); i++) {
            char symbol=password.charAt(i);
            if (symbol>='0' && symbol<='9'){
                digitCounter++;
            }

        }
        if (digitCounter>=2){
            return true;
        }else {
            return false;
        }


    }

    private static boolean passContent(String password) {
            String temppass=password.toLowerCase();
            boolean isContentCorrect= false;
        for (int i = 0; i <temppass.length() ; i++) {
            char symbol=temppass.charAt(i);
            if ((symbol>='a' && symbol<='z') || (symbol>='0' && symbol<='9')){
                isContentCorrect=true;
            }else {
                isContentCorrect=false;
                break;
            }

        }
        if (isContentCorrect){
            return true;
        }else {
            return false;
        }

    }


    private static boolean passLenght(String password) {
        if (password.length()>5 && password.length()<11) {
            return true;

        }else {
            return false;
        }
    }
}
