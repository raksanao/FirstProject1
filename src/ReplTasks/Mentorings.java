package ReplTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Mentorings {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Write a program tha removes all the duplicate characters
        String dupl = "aaabbccdd";
        String store = "";

        for (int i = 0; i < dupl.length(); i++) {
            String each = "" + dupl.charAt(i);
            if (!store.contains(each))
                store += each;
        }
        System.out.println(store);

       //Task 3. given the array of names:
        String[] names = { "Ahmed", "John", "Eric", "Ahmed", "Hassan"};
      //  write a program that can remove all the names named Ahmed from the array

        String stored="";
        for(String eachName:names){
            if(!eachName.equals("Ahmed")){
                stored+=eachName+" ";

            }
        }
String[] withoutAhmetNames=stored.split(" ");
        System.out.println(Arrays.toString(withoutAhmetNames));
    }
}