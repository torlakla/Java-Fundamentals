package Exercise.AssociativeArrays;

import java.sql.SQLOutput;
import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> companyUsers = new TreeMap<>();
        String inputData = scan.nextLine();
        while (!inputData.equals("End")) {
            String[] splitInput = inputData.split(" -> ");
            String company = splitInput[0];
            String id = splitInput[1];
            if (!companyUsers.containsKey(company)) {
                companyUsers.put(company, new ArrayList<>());
                companyUsers.get(company).add(id);

            } else {
                if (!companyUsers.get(company).contains(id)) {
                    companyUsers.get(company).add(id);
                }
            }

            inputData = scan.nextLine();
        }
        companyUsers.entrySet().stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    for (String eachID : entry.getValue()) {
                        System.out.println("-- " + eachID);

                    }

                });
    }
}

