package LAB.Lists;

import java.util.*;

public class ListOfProducts__06_Solo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> products= new ArrayList<>();

        int n=Integer.parseInt(scan.nextLine());
        for (int i = 0; i <n; i++) {
            String input=scan.nextLine();
            products.add(input);

        }
        Collections.sort(products);
        for (int i = 0; i <products.size(); i++) {
            System.out.printf("%d.%s%n",i+1,products.get(i));

        }
    }
}
