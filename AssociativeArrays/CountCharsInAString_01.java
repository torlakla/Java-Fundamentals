package Exercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input=scan.nextLine();
        Map<Character,Integer> charMap = new LinkedHashMap<>();
        for (int i = 0; i <input.length(); i++) {
            char currentSymbol=input.charAt(i);
            if(currentSymbol == ' '){
                continue;
            }
            if(!charMap.containsKey(currentSymbol)){
                charMap.put(currentSymbol,1);
            }else {
                int counter= charMap.get(currentSymbol);
                charMap.put(currentSymbol,counter+1);
            }

        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());

        }
    }
}
