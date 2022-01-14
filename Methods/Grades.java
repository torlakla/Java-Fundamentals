package LAB.Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade=Double.parseDouble(scan.nextLine());
        printGrade(grade);

    }

    private static void printGrade(double grade) {
        if (grade<3) {
            System.out.println("Fail");
        }else if (grade <3.50){
            System.out.println("Poor");
        }else if (grade<4.50){
            System.out.println("Good");
        }else if(grade<5.50){
            System.out.println("Very good");
        }else {
            System.out.println("Excellent");
        }

    }
}
