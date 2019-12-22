package ReplTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Repl119 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //String []sentenceSplit=sentence.split(" ");
        // for (int x = 0; x <sentenceSplit.length ; x++) {
        //   System.out.println(sentenceSplit[x]);

        //if (email.contains("@") || email.contains("@@")) {
        //   String[] mail = email.split("@");
        //  System.out.println(Arrays.toString(mail));
        // for (int i = 0; i < mail.length; i++) {
        // System.out.println(mail[i]);
        //  }

        //  } else {
        //     System.out.println("Invalid");


        //email -> info@cybertekschool.com
        //Print:
        // Email id: info
        // Email domain: cybertekschool.com

        String[] emailSplitted = email.split("@");
        String name = emailSplitted[0];
        String domain = emailSplitted[1];
        System.out.println("Email id: " + name);
        System.out.println("Email domain: " + domain);
        for (int i = 0; i < email.length(); i++) {

    }
}
}