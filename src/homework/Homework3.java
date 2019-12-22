package homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yot name");
        String name=scan.nextLine();
        int index=name.indexOf(" ")+1;
        String fullName=name.substring(0,1)+""+name.charAt(index);
        System.out.println(fullName);

    }
    }