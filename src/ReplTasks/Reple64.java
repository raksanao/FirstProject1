package ReplTasks;

import java.util.Scanner;

public class Reple64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int length = word.length();
        int remainder = 0;
        if (length % 2 == 0) {
            remainder = length / 2;
            int priorLetter = remainder - 1;
            System.out.println(String.valueOf(word.charAt(priorLetter)) + String.valueOf(word.charAt(remainder)));
        } else {
            remainder = length / 2;

            System.out.println(word.charAt(remainder));
        }

    }

}