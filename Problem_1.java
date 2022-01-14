package Exam_FINAL_Fund;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String inputCommand = scan.nextLine();
        while (!inputCommand.equals("Finish")) {
            String[] command = inputCommand.split("\\s+");
            String action = command[0];
            switch (action) {
                case "Replace":
                    String currentChar = command[1];
                    String newChar = command[2];
                    input = input.replaceAll(currentChar, newChar);
                    System.out.println(input);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    if ((startIndex >= 0 && startIndex < input.length() && (endIndex >= 0 && endIndex < input.length()))) {
                        String toReplace= input.substring(startIndex,endIndex+1);
                        input= input.replace(toReplace,"");
                        System.out.println(input);

                    }else{
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String actionToMake=command[1];
                    if(actionToMake.equals("Upper")){
                        input= input.toUpperCase();
                    }else if(actionToMake.equals("Lower")){
                        input=input.toLowerCase();
                    }
                    System.out.println(input);

                    break;
                case "Check":
                    String toCheck=command[1];
                    if(input.contains(toCheck)){
                        System.out.println("Message contains "+ toCheck);
                    }else {
                        System.out.println("Message doesn't contain "+toCheck);
                    }
                    break;
                case "Sum":
                    startIndex = Integer.parseInt(command[1]);
                    endIndex = Integer.parseInt(command[2]);
                    if ((startIndex >= 0 && startIndex < input.length() && (endIndex >= 0 && endIndex < input.length()))) {
                        String substring=input.substring(startIndex,endIndex+1);
                        int sum=0;
                        for (int i = 0; i <substring.length(); i++) {
                            char currentSymbol=substring.charAt(i);
                            sum+=currentSymbol;
                        }
                            System.out.println(sum);

                    }else{
                        System.out.println("Invalid indices!");
                    }

                    break;

            }


            inputCommand = scan.nextLine();
        }


    }
}
