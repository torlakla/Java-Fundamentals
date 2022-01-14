package Exercise.TextProcessing;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine();
        String[]test =input.split("\\\\");
        int fileIndex=input.lastIndexOf("\\");
        String fileName=input.substring(fileIndex+1);
        String[] array=fileName.split("\\.");
        String file=array[0];
        String ext=array[1];
        System.out.println("File name: "+file);
        System.out.println("File extension: "+ ext);

    }
}
