package LAB.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] actions = input.split(" ");
            switch (actions[0]) {
                case "Contains":
                    int containsNumber = Integer.parseInt(actions[1]);
                    if (numbersList.contains(containsNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = actions[1];
                    if (evenOrOdd.equals("even")) {
                        for (Integer number : numbersList) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    } else if (evenOrOdd.equals("odd")) {
                        for (Integer number : numbersList) {
                            if (number % 2 != 0) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer number : numbersList) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = actions[1];
                    int compareNumber = Integer.parseInt(actions[2]);
                    switch (condition) {
                        case "<":
                            for (Integer number : numbersList) {
                                if (number < compareNumber) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (Integer number : numbersList) {
                                if (number > compareNumber) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (Integer number : numbersList) {
                                if (number <= compareNumber) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (Integer number : numbersList) {
                                if (number >= compareNumber) {
                                    System.out.print(number + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }

            }


            input = scan.nextLine();
        }

    }
}
