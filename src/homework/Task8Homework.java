package homework;

import java.util.Scanner;

public class Task8Homework {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     String sentence=scan.nextLine().trim();
     //or sentence=sentence.trim();
     int firstSpace=sentence.indexOf(" ");
     int secondSpace=sentence.lastIndexOf(" ");
        System.out.println(secondSpace);



    }
    }

