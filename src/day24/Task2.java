package day24;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
               Scanner scan=new Scanner(System.in);
      int areaCode,localNumber;
      areaCode=scan.nextInt();
      localNumber=scan.nextInt();
        String phoneNumber;
       phoneNumber="Calling number "+"("+areaCode+")-"+localNumber;
        System.out.println(phoneNumber);

    }

}