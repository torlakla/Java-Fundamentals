package LAB.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list1= Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> list2=Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result= new ArrayList<>();
        int size=Math.min(list1.size(),list2.size());

        for (int i = 0; i <size; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));

        }

        for (Integer res : result) {
            System.out.print(res+ " ");

        }
        for (int i = size; i <list1.size(); i++) {
            System.out.print(list1.get(i)+ " ");
        }
        for (int i = size; i <list2.size(); i++) {
            System.out.print(list2.get(i)+ " ");

        }

    }
}
