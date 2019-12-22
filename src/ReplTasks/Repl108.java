package ReplTasks;

import java.util.Scanner;

public class Repl108 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int k = i; k <=n; k++) {
            for (int l = j; l <=k; l++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    }

