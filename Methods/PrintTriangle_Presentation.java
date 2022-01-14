package LAB.Methods;

import java.util.Scanner;

public class PrintTriangle_Presentation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        printTriangle(length);


    }

    private static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    static void printTriangle(int length) {
        for (int topLine = 1; topLine < length; topLine++) {
            printLine(1, topLine);
        }
        for (int bottomLine = length; bottomLine > 0; bottomLine--) {
            printLine(1,bottomLine);

        }


    }
}
