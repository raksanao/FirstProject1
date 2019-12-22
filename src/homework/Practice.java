package homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        // email -> info@cybertekschool.com
        // Print:
        // Email id: info
        // Email domain: cybertekschool.com
        //If email contains no @ character or multiple @ characters then print invalid email:

        // String email="info@cybertekschool.com";

        // String[] spl=email.split("@");
        // String secWord=spl[spl.length-1];
        // System.out.println("Email domain: "+secWord);


        // String split_first = email.substring(0,email.indexOf("@"));
        //String split_second = email.substring(email.indexOf("@")+1);
        // System.out.println("Email id: "+split_first);
        // System.out.println("Email domain: "+split_second);
        if (!email.contains("@") && email.contains("@@")) {
            String[] spl = email.split("@");
            String secWord = spl[spl.length - 1];
            String split_first = email.substring(0, email.indexOf("@"));
            System.out.println("Email id: " + split_first);
            System.out.println("Email domain: " + secWord);

        }else{
            System.out.println("invalid email:");
        }
    }
}