package homework;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE
        String word[]={"Charming","Snow","Beautiful","Happy"};
       String longest=word[3];
        for (String each : word) {
            if(each.length()>longest.length()){
                longest=each;
            }
        }
        System.out.println("Longest word in array is = " + longest);

    }
}
