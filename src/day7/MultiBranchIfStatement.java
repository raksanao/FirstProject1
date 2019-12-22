package day7;

import java.util.Scanner;

public class MultiBranchIfStatement {


    public static void main(String[] args) {
        //pseudo code
        //given your currentSpeed, speedLimit
        //check whether the current speed is more then 90-->jail
        //more then 80 and less than 90-> reckless driving


        // more than 70 and less than 80 -> point taken
        // more than 60 and less than 70-> warning

        //if not speeding keep driving

        //  int currentSpeed=45;

        // if(currentSpeed>65) {
        //    System.out.println("You are speeding more than 70 poin taken");


        // }else if (currentSpeed>90){
        //     System.out.println("your speed is less than 70 but  more than 60");

        //  }else{
        //      System.out.println("Keep driving you r good");


       /* int currentSpeed =10;
        if(currentSpeed>90) {
            System.out.println("Jail");
        }else if(currentSpeed>80){
            System.out.println("reckless driving");
        } else if(currentSpeed>70){
            System.out.println("warning");
        }else if(currentSpeed>60)
            System.out.println("keep driving");
        }

*/
       /* int apple = 10;
        int orange = 5;
        if (apple > orange) {
            System.out.println("its big");
        } else {
            System.out.println("not big");
        }
        String userName = "abc";
        String lastName = "abc";
        if (userName.equals(lastName)) {
            System.out.println("its true");
        } else {
            System.out.println("Its not true");

        }
        int books = 9;
        if (books > 10) {
            books = books + 10;
        }
        System.out.println(books);

        boolean cold = false;
        if (cold) {
            System.out.println("Give me some");
        } else {
            System.out.println("dont give me");
        }
        int age = 15;
        if (age != 15) {
            System.out.println("You big");
        } else {
            System.out.println("you r not big boy");
        }
        Boolean weather = false;
        if (weather) {
            System.out.println("go out");
        } else {
            System.out.println("Stay home\n watch movies");
        }
        Scanner bu = new Scanner(System.in);
       /* System.out.println("Enter user name and password plz");
        String user =input.next();
        String password =input.next();
        String validUse="abc";
        String validPassword ="123";
        if(user.equals(validUse)&&password.equals(validPassword)){
            System.out.println("u logged in");
        }else{
            System.out.println("you r blocked");
*/
       /* System.out.println("What is your speed?");
       int speedLimit= input.nextInt();
       if (speedLimit<50){
           System.out.println("you are good");
        }else{
           System.out.println("You are speeding");*/
        // char grade = 'A';
        //  if (grade == 'A') {
        // System.out.println("good job");
        // } else if (grade == 'B') {
        // System.out.println("normal");
        // } else if (grade == 'C') {
        // System.out.println("not bed");
        // } else {
        //    System.out.println("you failed");


        Scanner scan = new Scanner(System.in);

        String subject1, subject2, subject3, subject4, subject5, summary;
        double grade1, grade2, grade3, grade4, grade5, average;

        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
         String f = scan.next();
         double d= scan.nextDouble();
    }
}
