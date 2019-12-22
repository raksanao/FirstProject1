package ReplTasks;

import java.util.Scanner;

public class Repl103 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String star="";
        for( i=1;i<=3;i++){
            star=star+="*";
            System.out.println(star);
        }
    }
}
