package homework;

import java.util.Scanner;

public class Task9Homework {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //www.google.com
        String url=scan.next();
        int firstDot=url.indexOf(".");
        System.out.println("First dot index is= "+firstDot);
        int secondDor=url.lastIndexOf(".");
        System.out.println("Second dot Index ="+secondDor);
        System.out.println(url.substring(firstDot+1, secondDor));
    }
}
