package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

        //smart lock dooe has password
        // unless you enter correct password
        //it keep locking u out
        //keep asking untill user enter corect one
        Scanner scan = new Scanner(System.in);
        System.out.println("Knowck knock");
        System.out.println("whtas the password");
        String password = scan.next();
        while (!password.equalsIgnoreCase("B15")) {
            System.out.println("Wrong password try again");
            password = scan.next();


        }
        System.out.println("right password");
    }
}
