package LAB.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] firstArray= Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int[] secondArray=Arrays.stream(scan.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int sum=0;
        boolean isIdentical=true;
        for (int i = 0; i <firstArray.length; i++) {
            if( firstArray[i]==secondArray[i]){
            sum+=firstArray[i];
            }
            else if(firstArray[i]!=secondArray[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                isIdentical=false;
                break;
            }
        }
        if(isIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }

    }
}
