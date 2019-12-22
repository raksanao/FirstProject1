package homework;

import java.util.Scanner;

public class Task10Homework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //i love java print second word

        String word=scan.nextLine();
        int firstIndex=word.indexOf(" ");
        System.out.println(firstIndex);

        int secondIndex=word.lastIndexOf(" ");
        System.out.println(secondIndex);

        System.out.println(word.substring(firstIndex+1,secondIndex));

    }
}
