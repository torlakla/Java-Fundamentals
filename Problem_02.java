package Exam_FINAL_Fund;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());
        for (int i = 0; i <n; i++) {
            String input=scan.nextLine();
            Pattern regex=Pattern.compile("(?<start>.+)>(?<digits>[0-9]{3})\\|(?<lower>[a-z]{3})\\|(?<upper>[A-Z]{3})\\|(?<any>[^<>]{3})<\\1");
            Matcher matchRegex=regex.matcher(input);
            if(matchRegex.find()){
               // String encryptedPassword="";
                StringBuilder password= new StringBuilder();
                password.append(matchRegex.group("digits"));
                password.append(matchRegex.group("lower"));
                password.append(matchRegex.group("upper"));
                password.append(matchRegex.group("any"));
//                encryptedPassword= matchRegex.group("digits")+ matchRegex.group("lower")+
//                matchRegex.group("upper")+ matchRegex.group("any");

                System.out.println("Password: "+ password.toString());



            }else {
                System.out.println("Try another password!");
            }

        }


    }
}
