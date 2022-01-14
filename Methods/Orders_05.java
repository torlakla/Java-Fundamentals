package LAB.Methods;

import java.lang.invoke.LambdaMetafactory;
import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product=scan.nextLine();
        int amount= Integer.parseInt(scan.nextLine());
        receiptPrice(product,amount);
    }

    private static void receiptPrice( String product,int amount) {
        switch (product){
            case "coffee":

                System.out.printf("%.2f",1.50*amount);
                break;
            case "water":
                System.out.printf("%.2f",1.00*amount);
                break;
            case "coke":
                System.out.printf("%.2f",1.40*amount);
                break;
            case"snacks":
                System.out.printf("%.2f",2.00*amount);
                break;

        }
    }
}
