package homework;

import java.util.Scanner;

public class ScannerArrayloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int [] num=new int [10];
        for (int i = 0; i <num.length; i++) {
            System.out.println("Enter ur number"+i+1);
                num[i]=scan.nextInt();

            }
        for (int i = 0; i <num.length; i++) {
            System.out.print(num[i]);
        }
        }
                }

