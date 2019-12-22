package day19;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {

        //String at = "";
       // for (int i = 1; i <= 1; i++) {
        //    at = at += "@";
        //    System.out.println(at);


            //  char myChar = 'a';
            // System.out.println(myChar);
            // System.out.println(++myChar);
            // System.out.println(++myChar);
            // for (char let = 'Z'; let >='A'; let--) {
            // let = let += 'a';
            //  System.out.println(let);
            // System.out.println('B'>'A');
           // String line = "";
           // for (char let1 = 'A'; let1 <= 'Z'; let1++) {
              //  line += let1;
               // System.out.println(line);
           Scanner scan=new Scanner(System.in);
            System.out.println("Enter 2 number");
            int sum=0;
            int num=scan.nextInt();
            int num2=scan.nextInt();
            for(int x=num; x<=num2;x++){
                sum=sum+x;}
                System.out.println(sum);

            }
        }


