package ReplTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

      String first =sentence.substring(0,sentence.indexOf(" ")+1);
       System.out.println(first);
        String second=sentence.substring(sentence.indexOf(" ")+1,sentence.lastIndexOf(" ")+1);

        System.out.println(second);
String last=sentence.substring(sentence.lastIndexOf(" ")+1,sentence.lastIndexOf(" "));
        System.out.println(last);
       // System.out.println(first+"\n"+second+"\n"+last);

    }

        }






