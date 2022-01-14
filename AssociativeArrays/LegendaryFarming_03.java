package Exercise.AssociativeArrays;

import java.util.*;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> inventory = new TreeMap<>();

        while (true) {
            String[] input = scan.nextLine().toLowerCase().split(" ");
            String material = "";
            int quantity = 0;
            for (int i = 0; i < input.length; i+=2) {
                    quantity = Integer.parseInt(input[i]);
                    material = input[i+1];
                if (!inventory.containsKey(material)) {
                    inventory.put(material, quantity);
                } else {
                    inventory.put(material, inventory.get(material) + quantity);
                }
            }
            if (inventory.containsKey("shards")) {
                if (inventory.get("shards") >= 250) {
                    inventory.put("shards", inventory.get("shards") - 250);
                    System.out.println("Shadowmourne obtained!");
                    break;
                }
            }
            if (inventory.containsKey("fragments")) {
                if (inventory.get("fragments") >= 250) {
                    inventory.put("fragments", inventory.get("fragments") - 250);
                    System.out.println("Valanyr obtained!");
                    break;
                }
            }
            if (inventory.containsKey("motes")) {
                if (inventory.get("motes") >= 250) {
                    inventory.put("motes", inventory.get("motes") - 250);
                    System.out.println("Dragonwrath obtained!");
                    break;
                }
            }
        }

        inventory.entrySet().stream()
                .filter(e -> (e.getKey().equals("shards")) || (e.getKey().equals("motes") ) || (e.getKey().equals("fragments")))
                .sorted((a, b) -> {
                    if (a.getValue().compareTo(b.getValue()) == 0) {
                        return a.getKey().compareTo(b.getKey());
                    }
                    return b.getValue().compareTo(a.getValue());
                }).forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));


        inventory.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(e -> !(e.getKey().equals("shards")) && !(e.getKey().equals("motes") ) && !(e.getKey().equals("fragments")))
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));



    }
}
