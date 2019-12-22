package ReplTasks;

import java.util.Scanner;

public class Repl99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int n = scan.nextInt();
        int count = 0;
        String word = str.substring(0, n);
        for (int i = 0; i <= word.length() - n; i++) {
            String curChar = str.substring(i, i + n);
            {
                if (curChar.equals(word)) {
                    count++;

                }
                System.out.println(count > 1);
            }
        }
    }
}
