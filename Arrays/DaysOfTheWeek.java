package LAB.Arrays;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] days={ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int day=Integer.parseInt(scan.nextLine());
        if (day<=7 && day>=1){
            System.out.println(days[day-1]);
        }else {
            System.out.println("Invalid day!");
        }


    }
}
