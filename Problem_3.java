package Exam_FINAL_Fund;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> likes = new TreeMap<>();
        Map<String, Integer> comments = new TreeMap<>();

        String input = scan.nextLine();
        while (!input.equals("Log out")) {
            String[] commandArray = input.split(": ");
            String command = commandArray[0];
            String name = commandArray[1];
            switch (command) {
                case "New follower":
                    if (!likes.containsKey(name)) {
                        likes.put(name, 0);
                        comments.put(name, 0);
                    }
                    break;
                case "Like":
                    int likeCount = Integer.parseInt(commandArray[2]);
                    if (!likes.containsKey(name)) {
                        likes.put(name, likeCount);
                        comments.put(name, 0);

                    } else {
                        likes.put(name, likes.get(name) + likeCount);
                    }

                    break;
                case "Comment":

                    if (!comments.containsKey(name)) {
                        comments.put(name, 1);
                        likes.put(name, 0);

                    } else {
                        comments.put(name, comments.get(name) + 1);
                    }
                    break;
                case "Blocked":
                    if (!likes.containsKey(name)) {
                        System.out.println(name + " doesn't exist.");
                    } else {
                        likes.remove(name);
                        comments.remove(name);
                    }
                    break;
            }


            input = scan.nextLine();
        }
        Map<String, Integer> sortedMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : likes.entrySet()) {
            sortedMap.put(entry.getKey(), entry.getValue() + comments.get(entry.getKey()));

        }
        System.out.println(sortedMap.size()+ " followers");
        sortedMap.entrySet().stream()
                .sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
        .forEach(entry-> System.out.println(entry.getKey()+ ": "+ entry.getValue()));
        sortedMap.clear();

    }

}




