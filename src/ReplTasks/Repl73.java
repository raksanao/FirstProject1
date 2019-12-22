package ReplTasks;

import java.util.Scanner;

public class Repl73 {
    public static void main(String[] args) {


        //Scanner scan = new Scanner(System.in);
        //String word = "Olimova"; //scan.next();
        // if (word.length() % 2 != 0 && word.length() >= 5) {
        //    System.out.println(word.substring(word.length() / 3 - 1, word.length() / 2 + 2));

       String item="echo dot-3rd gen-chargole";
        int firs=item.indexOf("-");
        int sec=item.indexOf("-");
        String both=item.substring(firs+1,sec);
        System.out.println(both);
        }
    }

