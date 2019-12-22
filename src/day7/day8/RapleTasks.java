package day7.day8;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RapleTasks {
    public static void main(String[] args) {


        // System.out.println("what is my car number");
        // int myNumber= scan.nextInt();
        //if(myNumber == 300) {
        //    System.out.println("BINGO");
        //}else {
        //    System.out.println("try ");

        // System.out.println("What day is today?");
        // int dayDate =scan.nextInt();
        // if(dayDate==30){
        //  System.out.println("Then we go outside");}else{
        //     System.out.println("we stay home");

        // System.out.println("what is you date of birth");
        //int date= scan.nextInt();
        //if (date==12) {
        //   System.out.println("yes its your birthday");}else{
        //  System.out.println("Its not");
        /*Scanner scan = new Scanner(System.in);
        String subject1, subject2, subject3, subject4, subject5, summary;
        double grade1, grade2, grade3, grade4, grade5, average;

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String sub= scan.next();
        double score= scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String sub2= scan.next();
        double score2= scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String sub3= scan.next();
        double score3= scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String sub4= scan.next();
        double score4= scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String sub5= scan.next();
        double score5= scan.nextDouble();

        System.out.println("Summary: "+sub+ " - "+score+", "+sub2+" - "+score2+", "+sub3+" - "+score3+", "+sub4+" - "+score4+", "+sub5+" - "+score5);

        System.out.println("Your average score is: 4.36");
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");
      //  -build summary variable by concatenating subject names and grades
       // calculate average score and define that value into average variable.

       // -Display prompt: "Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4"
        //        -Display prompt: "Your average score is: 4.36"
         //       -Display prompt: "Thank you for using Grader!"
         //       -Display prompt: "Goodbye!"
*/
        Scanner scanner = new Scanner(System.in);
        int day=1;
        if (day == 1) {
            System.out.println("It's a Monday!");

            day =scanner.nextInt();
        }else if (day == 2) {
            System.out.println("It's a Tuesday!");
            day =scanner.nextInt();
        }else if (day == 3) {System.out.println("It's a Wednesday!");
            day =scanner.nextInt();
        }else if (day == 4) {System.out.println("It's a Thursday!");
            day =scanner.nextInt();
        }else if (day == 5) {System.out.println("It's a Friday!");
            day =scanner.nextInt();
        }else if (day == 6) {System.out.println("It's a saturday!");
            day =scanner.nextInt();
        }else if (day == 7) {System.out.println("It's a Sunday!");
        }else {
            System.out.println("There is no such a day!");


        }
    }
        }

