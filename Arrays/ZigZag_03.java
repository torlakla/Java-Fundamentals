package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZag_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            if (i % 2 == 0) {
                array1[i] = input[0];
                array2[i] = input[1];
            } else {
                array1[i] = input[1];
                array2[i] = input[0];
            }
        }
        for (int arr1 : array1)
            System.out.print(arr1 + " ");
        System.out.println();
        for (int arr2:array2)
            System.out.print(arr2+ " ");



    }
}

