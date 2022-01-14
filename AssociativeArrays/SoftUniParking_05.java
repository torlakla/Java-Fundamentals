package Exercise.AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> database = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            String username = input[1];
            if (input.length == 3) {
                String plate = input[2];
                if (!database.containsKey(username)) {
                    database.put(username, plate);
                    System.out.printf("%s registered %s successfully%n", username, plate);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", database.get(username));
                }
            } else {
                if (!database.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    database.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }

        }
        database.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));

    }
}
