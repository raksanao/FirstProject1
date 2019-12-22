package day31;

import org.w3c.dom.ls.LSOutput;

public class PrintOddNumbers {
    public static void myName(){
        String name="Raksana";
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i)+"-");

        }

    }


    public static void printOddNumbers1to100() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
            System.out.println();
        }
    public static void countFrom20to1(){

        for (int i = 20; i >1 ; i--) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        printOddNumbers1to100();
        countFrom20to1();
        myName();
    }


        }















