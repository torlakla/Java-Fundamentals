package Exercise.RegularExpressions_Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        List<String> furniture = new ArrayList<>();
        double totalPrice=0.0;
        Pattern regex=Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>[1-9][0-9]*[.]*\\d+)!(?<quantity>[1-9][0-9]*)");
        while(!input.equals("Purchase")){
            Matcher matchValidInput= regex.matcher(input);
            if(matchValidInput.find()){
                String type=matchValidInput.group("name");
                double price=Double.parseDouble(matchValidInput.group("price"))*1.0;
                double quantity=Double.parseDouble(matchValidInput.group("quantity"))*1.0;
                furniture.add(type);
                double currentPrice= price*quantity;
                totalPrice+=currentPrice;

            }
            input=scan.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}
