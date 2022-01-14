package LAB.Methods;

import java.util.Scanner;

public class PrintingTriangleSolo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=Integer.parseInt(scan.nextLine());
        printTriangle(size);

    }

    private static void printTriangle(int size) {
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        for (int i = size-1; i >=1; i--) {
            for (int j =1; j <=i; j++) {
                System.out.print(j+ " ");

            }
            System.out.println();

        }
    }
}
