package ReplTasks;

import java.util.Scanner;

public class Repl107 {
    public static void main(String[] args) {

       /* Task 1 :
        given 3 whole numbers variable num1, num2 , num3 with value already set .
        If the sum of the numbers are more than 100 print you have won
        if not print sum of 3 numbers are not more than 100
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int total = num1 + num2 + num3;
        if (total > 100) {
            System.out.println("you won");
        }else{
            System.out.println("sum of 3 numbers are not more than 100");

-------------------------------------------------

 Task 3 :
 given 3 whole numbers variable num1, num2 , num3 with value already set .
 Write a program to
 find out the largest number and print the result
__________________________________________

Task 4 :
given 3 whole numbers variable num1, num2 , num3 with value already set .
 Write a program with below logic
 it should print true if all the individual numbers are more than 100
 if not print not all numbers are more than 100

        */
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        if (num1 > 100 || num2 > 100 || num3 > 100) {
            System.out.println("True");
        } else {
            System.out.println("not all numbers are more than 100");

        }
    }
}
