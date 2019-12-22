package homework;

import java.util.Scanner;

public class Task11Homework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String newWord="";
        newWord=word.charAt(word.length()-1)+word.substring(1,word.length()-1)+word.charAt(0);
        System.out.println(newWord);
    }
}

