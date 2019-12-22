package ReplTasks;

import java.util.Scanner;

public class REpNameSwap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       // System.out.println("Please enter a word!");
       // String word=scan.next();
      //  System.out.println("Starting character is : " + word.charAt(0) );
      //  System.out.println("Ending character is: " + word.charAt(word.length()-1));
       // System.out.println("Characters in between are : " + word.substring(1,word.length()-1));
        System.out.println("Enter your name");
        String name=scan.next();
        System.out.println("First letter "+name.charAt(0));
        System.out.println("Middle letter "+name.substring(1,name.length()-1));
        System.out.println("last letter "+name.charAt(name.length()-1));

    }
}
