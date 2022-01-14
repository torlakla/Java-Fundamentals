package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int amount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i==j){
                    continue;
                }
                if (array[i] + array[j] == amount) {
                    System.out.println(array[i] + " " + array[j]);
                }

            }
        }


    }
}
