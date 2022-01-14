package Exercise.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch(command) {
                case "Add":
                    //"Add 10" -> ["Add", "10"]
                    int numberToAdd = Integer.parseInt(tokens[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    //"Insert 3 0" -> ["Insert", "3", "0"]
                    int addNumber = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    //validate index
                    if(isValidIndex(index, numbers.size())) {
                        numbers.add(index, addNumber);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    //"Remove 2" -> ["Remove", "2"]
                    int indexRemove = Integer.parseInt(tokens[1]);
                    //validate index
                    if(isValidIndex(indexRemove, numbers.size())) {
                        numbers.remove(indexRemove);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "Shift":
                    //"Shift right 5" -> ["Shift", "right", "5"]
                    //"Shift left 5" -> ["Shift", "left", "5"]
                    String direction = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if(direction.equals("right")) {
                        for (int i = 1; i <= count ; i++) {
                            //последния става първи
                            //1. последния
                            //1 23 29 18 43 21
                            int lastNumber = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastNumber);
                        }

                    } else if (direction.equals("left")) {
                        for (int i = 1; i <= count ; i++) {
                            int firstNumber = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstNumber);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        printList(numbers);


    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index <= length - 1;

    }


    private static void printList(List<Integer> wagons) {
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
