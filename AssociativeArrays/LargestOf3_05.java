package LAB.AssociativeArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LargestOf3_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers =Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((number1,number2)-> number2.compareTo(number1))
                .limit(3)
                .collect(Collectors.toList());

        for( int number:numbers){
            System.out.print(number + " ");
        }

    }
}
