package Exercise.ExamExcersize;

import java.util.Scanner;

public class PasswordReset_01_04042020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        String inputCommand= scan.nextLine();
        StringBuilder password=new StringBuilder();
        while (!inputCommand.equals("Done")){
            String[] command= inputCommand.split(" ");
            switch (command[0]){
                case "TakeOdd":
                    for (int i = 0; i <input.length(); i++) {
                        if(i%2!=0){
                            char currentSymbol=input.charAt(i);
                            password.append(currentSymbol);
                        }
                    }
                    input=password.toString();
                    System.out.println(input);
                    break;
                case "Cut":
                    int index=Integer.parseInt(command[1]);
                    int length=Integer.parseInt(command[2]);
                    String substringForRemove = input.substring(index, index + length);
                    input = input.replaceFirst(substringForRemove, "");

                    System.out.println(input);
                    break;
                case "Substitute":
                    String substring=command[1];
                    String substitute=command[2];
                    if(input.contains(substring)){
                        input=input.replaceAll(substring,substitute);
                        System.out.println(input);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }



            inputCommand=scan.nextLine();
        }
        System.out.printf("Your password is: %s",input);
    }
}
