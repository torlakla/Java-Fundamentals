package Exercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> ressourceCollection = new LinkedHashMap<>();
        String key = scan.nextLine();
        while (!key.equals("stop")) {
            int value = Integer.parseInt(scan.nextLine());
            if (!ressourceCollection.containsKey(key)) {
                ressourceCollection.put(key, value);
            } else {
                ressourceCollection.put(key, ressourceCollection.get(key) + value);
            }
            key = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : ressourceCollection.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
       // Alternative way for printing result.
        // ressourceCollection.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
