package ReplTasks;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number % 10 == 0) {
            System.out.println(number+" is even");
        }else if (number%33==0) {
            System.out.println(number + " is odd");
        }//else if(number%0==0){
         //   System.out.println(number+" is even");
        }
    }
