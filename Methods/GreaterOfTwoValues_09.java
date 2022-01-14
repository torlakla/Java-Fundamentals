package LAB.Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        switch (input){
            case "int":
                int number1=Integer.parseInt(scan.nextLine());
                int number2=Integer.parseInt(scan.nextLine());
                System.out.println(getMax(number1,number2));
                break;
            case "char":
                char char1=scan.nextLine().charAt(0);
                char char2=scan.nextLine().charAt(0);
                System.out.println(getMax(char1,char2));
                break;
            case "string":
                String string1=scan.nextLine();
                String string2=scan.nextLine();
                System.out.println(getMax(string1,string2));
                break;
        }


    }
    public static String getMax(String string1, String string2){
        if (string1.compareTo(string2)>=0){
            return string1;
        }
        return string2;

    }
    public static char getMax(char char1,char char2){
        if (char1>=char2){
            return char1;
        }
        return char2;


    }

    private static int getMax(int number1,int number2) {
        if (number1>=number2){
            return number1;
        }
        return number2;
    }

}
