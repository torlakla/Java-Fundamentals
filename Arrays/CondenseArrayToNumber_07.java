package LAB.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (numbers.length > 1) {
            int[] condensedArray = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length-1; i++) {
                condensedArray[i] = numbers[i] + numbers[i + 1];
                System.out.println(condensedArray[i]);

            }

            numbers = condensedArray;


        }
        System.out.println(numbers[0]);


    }
}
