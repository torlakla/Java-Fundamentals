package Exercise.Methods;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        printMatrix(n);
    }

    private static void printMatrix(int number) {
        for (int i = 0; i <number; i++) {
            printLine(number);
            System.out.println();
        }

    }

    private static void printLine(int n) {
        for (int i = 0; i <n; i++) {
            System.out.print(n+ " ");
        }
    }
}
