package day15;

import org.w3c.dom.ls.LSOutput;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("what is your name");
        String name = scan.next();
        int lengthOfName=name.length();
        System.out.println("length of the name="+ lengthOfName);
        if(lengthOfName<4) {
            System.out.println("short name");
        }else if(lengthOfName>=4&&lengthOfName<=11){
            System.out.println("medium");}
        else{
            System.out.println("longer name");
          if (name.contains("a") || name.contains("e")) {
                System.out.println(" name contains a or e");
            }else {
                System.out.println("I dont have a or e");
            }
        }


    }
}
