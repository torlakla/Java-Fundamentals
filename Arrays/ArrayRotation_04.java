package Exercise.Arrays;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(scan.nextLine());
        for (int j = 0; j < rotations; j++) {
                String holder = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];

            }
                array[array.length - 1] = holder;
        }
        System.out.println(String.join(" ", array));

    }
}
