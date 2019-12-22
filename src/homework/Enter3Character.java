package homework;

import java.util.Scanner;

public class Enter3Character {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter at least 3 words");
        String words=scan.next();
        int cHarInd=words.length();
        System.out.println(words.charAt(0));
        System.out.println(words.charAt(cHarInd-1));
        int middle=(cHarInd-1)/2;
        System.out.println(words.charAt(middle));
    }
}
