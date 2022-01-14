package LAB.Methods;

import java.util.Scanner;

public class RectangleArea_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double  width=Double.parseDouble(scan.nextLine());
        double length=Double.parseDouble(scan.nextLine());
        double area= calculateRectangleArea(width,length);
        System.out.printf("%.0f",area);

    }

    private static double calculateRectangleArea(double width,double length) {
        return width*length;

    }
}
