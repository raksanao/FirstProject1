package ReplTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Repl76 {
    public static void main(String[] args) {
        // In this task, you need to swap first name
        // with last name in the email. If email doesn't contains
        // underscore - do not anything.

        // input: mike_tyson@gmail.com
        // output: tyson_mike@gmail.com

        Scanner scan = new Scanner(System.in);
     String email=scan.next();
if(email.contains("_")){
        String firstWord = email.substring(0, email.indexOf("_"));
        String secondWord = email.substring(email.indexOf("_") + 1, email.indexOf("@"));

        String atRest = email.substring(email.indexOf("@"));
        System.out.println(secondWord + "_" + firstWord + atRest);
    }else{
    System.out.println(email);
    }


    }

}