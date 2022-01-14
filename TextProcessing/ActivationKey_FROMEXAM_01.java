package LAB.TextProcessing;

import java.util.Scanner;

public class ActivationKey_FROMEXAM_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder key = new StringBuilder(scan.nextLine());
        String command = scan.nextLine();
        while (!command.equals("Generate")) {
            String[] commandArray = command.split(">>>");
            String commandName = commandArray[0];
            switch (commandName) {
                case "Contains":
                    String wordToSearchFor = commandArray[1];
                    if (key.indexOf(wordToSearchFor) != -1) {
                        System.out.printf("%s contains %s%n", key, wordToSearchFor);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String flipCase = commandArray[1];
                    int flipBeginIndex = Integer.parseInt(commandArray[2]);
                    int flipEndIndex = Integer.parseInt(commandArray[3]);
                    for (int i = flipBeginIndex; i < flipEndIndex; i++) {
                        char currentSymbol = key.charAt(i);
                        if (flipCase.equals("Lower")) {
                            key.setCharAt(i, Character.toLowerCase(currentSymbol));
                        } else {
                            key.setCharAt(i, Character.toUpperCase(currentSymbol));

                        }

                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    int sliceBeginIndex = Integer.parseInt(commandArray[1]);
                    int sliceEndIndex = Integer.parseInt(commandArray[2]);
                    // both do same thing below
                    key.replace(sliceBeginIndex, sliceEndIndex, "");
                    //  key.delete(sliceBeginIndex,sliceEndIndex);
                    System.out.println(key);
                    break;
            }


            command = scan.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}
