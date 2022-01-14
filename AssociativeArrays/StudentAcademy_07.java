package Exercise.AssociativeArrays;

import java.sql.SQLOutput;
import java.util.*;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> grades = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            if (!grades.containsKey(name)) {
                grades.put(name, new ArrayList<>());
            }
            grades.get(name).add(grade);
        }
//    namirane na sredna aritmetichna otsenka v list ot double, filtrirane ako sa >=4,50 i sortirane i printirane po sredna otsenka.
//        grades.entrySet().stream().filter((v) -> v.getValue().stream().mapToDouble(value -> value).sum() / v.getValue().size() >=4.5)
//                //.sorted((a, b) -> a.getValue().stream().mapToDouble(value -> value).sum() / a.getValue().size()
//                .sorted((a, b) -> {
//                    double firstAverage = a.getValue().stream().mapToDouble(val -> val).sum() / a.getValue().size();
//                    double secondAverage = b.getValue().stream().mapToDouble(val -> val).sum() / b.getValue().size();
//                    if (firstAverage<secondAverage) return 1;
//                    else if (firstAverage==secondAverage) return 0;
//                    else return -1;
//                }).forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(),e.getValue().stream().mapToDouble(value -> value).sum() / e.getValue().size()));


        Map<String, Double> averageGradeOfEachStudent = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : grades.entrySet()) {
            double averageGrade = entry.getValue().stream().mapToDouble(number -> number).average().getAsDouble();
            if (averageGrade >= 4.50) {
                averageGradeOfEachStudent.put(entry.getKey(), averageGrade);
            }

        }
        averageGradeOfEachStudent.entrySet().stream()
                .sorted((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));

    }
}
