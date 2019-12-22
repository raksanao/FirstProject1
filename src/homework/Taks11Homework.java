package homework;

import java.util.Scanner;

public class Taks11Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // i love java
        String word = scan.nextLine();

        int firstSpace = word.indexOf(" ");
       // System.out.println(firstSpace);
        int secondSpace = word.lastIndexOf(" ");
       // System.out.println(secondSpace);

        String firatWord=word.substring(0,firstSpace);
        System.out.println(firatWord);

        String secondWord=word.substring(secondSpace+1);
        System.out.println(secondWord);
    }
}
