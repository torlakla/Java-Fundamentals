package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scan.nextLine());
        int[] field = new int[fieldSize];
        int[] initialIndexes = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int initialIndex = 0; initialIndex < initialIndexes.length; initialIndex++) {
            for (int bugIndexInField = 0; bugIndexInField < field.length; bugIndexInField++) {
                if (initialIndexes[initialIndex] == bugIndexInField) {
                    field[bugIndexInField] = 1;
                }
            }

        }

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            int startIndex = Integer.parseInt(command[0]);
            String direction = command[1];
            int flyLength = Integer.parseInt(command[2]);
            if (startIndex < 0 || startIndex > field.length - 1) {
                input=scan.nextLine();
                continue;
            }
            if (field[startIndex] == 0) {
                input = scan.nextLine();
                continue;
            }
            label1:
            if (direction.equals("right")) {
                for (int i = startIndex; i < field.length; i = i + flyLength) {
                    if (i + flyLength >= field.length) {
                        field[startIndex] = 0;
                        break label1;
                    } else if (field[i + flyLength] == 0) {
                        field[i + flyLength] = 1;
                        field[startIndex] = 0;
                        break label1;
                    }
                }
            } else if (direction.equals("left")) {

                for (int i = startIndex; i >= 0; i = i - flyLength) {
                    if (i - flyLength <= 0) {
                        field[startIndex] = 0;
                        break label1;
                    } else if (field[i - flyLength] == 0) {
                        field[i - flyLength] = 1;
                        field[startIndex] = 0;
                        break label1;
                    }
                }
            }


            input = scan.nextLine();
        }
        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");

        }


    }


}
