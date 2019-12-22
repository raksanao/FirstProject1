package homework;

import java.util.Arrays;

public class ArrayHomeWork {
    public static void main(String[] args) {
        //                      0      1         2        3           4
        String[] grocary = {"apple", "banana", "carrot", "tomatoes", "kiwi"};


        for (int i = 0; i < grocary.length; i++) {
            System.out.println(grocary[i] + ",");

        }
        System.out.println("=====");
//print each item in odd index

        for (int i = 0; i < grocary.length; i++) {
            if (i % 2 == 1) {
                System.out.print(grocary[i] + " ");
            }

        }
        System.out.println("====");
//print all item in reverse order

            for (int k = grocary.length - 1; k >= 0; k--) {
                System.out.print(grocary[k] + " ");

            }
            System.out.println();
        }
    }




