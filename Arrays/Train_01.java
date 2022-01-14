package Exercise.Arrays;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wagonCount=Integer.parseInt(scan.nextLine());
        int sum=0;
        int [] train= new int[wagonCount];
        for (int i = 0; i <train.length; i++) {
            train[i]=Integer.parseInt(scan.nextLine());
            sum+=train[i];
        }
        for (int i = 0; i < train.length; i++) {
            System.out.print(train[i]+ " ");

        }
        System.out.println();

        System.out.println(sum  );

    }
}
