package LAB.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] texts =scan.nextLine().split(" ");
        for (int i = 0; i < texts.length/2; i++) {
            String temp=texts[i];
            texts[i]=texts[texts.length-i-1];
            texts[texts.length-i-1]=temp;

        }
        System.out.println(String.join(" ",texts));
    }
}
