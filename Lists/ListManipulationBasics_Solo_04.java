package LAB.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_Solo_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            int number= Integer.parseInt(commands[1]);
            switch (commands[0]) {
                case "Add":
                    numbersList.add(number);
                    break;
                case "Remove":
                    numbersList.remove(Integer.valueOf(number)) ;
                    break;
                case "RemoveAt":
                    numbersList.remove(number) ;
                    break;
                case "Insert":
                    int index=Integer.parseInt(commands[2]);
                    numbersList.add(index,number);
                    break;
            }
            input=scan.nextLine();


        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
