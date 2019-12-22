package ReplTasks;

import java.util.Scanner;

public class Reple106 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String vowels = "";
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (int x = 0; x < word.length(); x++) {
            char vov = Character.toLowerCase(word.charAt(x));
            if (vov == 'a' || vov == 'e' || vov == 'i' || vov == 'o' || vov == 'u') {
                System.out.print(word.charAt(x));
            }
        }
    }
}
