package Exercise.RegularExpressions_Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,Integer> participants = new LinkedHashMap<>();
        List<String> racerList=Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        racerList.forEach(racer->participants.put(racer,0));

        Pattern regexLetter= Pattern.compile("[A-Za-z]+");
        Pattern regexNumber=Pattern.compile("[0-9]");
        String input=scan.nextLine();
        while (!input.equals("end of race")){
            Matcher matchLetter= regexLetter.matcher(input);
            Matcher matchNumber=regexNumber.matcher(input);
            StringBuilder nameSB= new StringBuilder();
            while (matchLetter.find()){
                nameSB.append(matchLetter.group());
            }
            String name=nameSB.toString();
            int number=0;
            while(matchNumber.find()){
                number+=Integer.parseInt(matchNumber.group());
            }
            if(participants.containsKey(name)){
                participants.put(name,participants.get(name)+number);
            }




            input=scan.nextLine();
        }
        List<String> winners=new ArrayList<>();
        participants.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).limit(3)
                .forEach(e->winners.add(e.getKey()));
        // other method.
        // List<String> winners = participants.entrySet().stream()
        //                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        //                .limit(3)
        //                .map(Map.Entry::getKey)
        //                .collect(Collectors.toList());

        System.out.println("1st place: "+winners.get(0));
        System.out.println("2nd place: "+winners.get(1));
        System.out.println("3rd place: "+winners.get(2));
    }
}
