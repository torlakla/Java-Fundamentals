package LAB.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubstraction_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers= Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int sumOdd=0;
        int sumEven=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                sumEven+=numbers[i];
            }else {
                sumOdd+=numbers[i];
            }


        }
        int result=sumEven-sumOdd;
        System.out.println(result);
    }
}
