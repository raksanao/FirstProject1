package day5;

import java.util.Scanner;

public class WageConverter {
    public static void main(String[] args) {

        /*
    Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.
    * */


            Scanner scan = new Scanner(System.in);
            System.out.println("What is your hourly wage? ");
            int wageInHour = scan.nextInt();
            int salary = wageInHour * 2080;
            System.out.println("Your yearly salary based on the hourly wage rate of " + wageInHour + "$ is equal to " + salary + "$ per year");

        }




    }

