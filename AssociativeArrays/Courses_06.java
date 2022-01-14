package Exercise.AssociativeArrays;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input=scan.nextLine();

        while(!input.equals("end")){
            String course=input.split(" : ")[0];
            String studentName=input.split(" : ")[1];

            if(!courses.containsKey(course)){
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(studentName);

            input=scan.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1,e2)->Integer.compare(e2.getValue().size(),e1.getValue().size()))
                .forEach(entry->{
                    System.out.println(entry.getKey()+ ": "+ entry.getValue().size());
                    entry.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student-> System.out.println("-- "+ student));
                });
    }
}
