package homework;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class LastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

       /* int minLength =str[0].length();
        int min =0;
        String minWor ="";
        for (int x = 0; x <str.length ; x++) {

            if (str[x].length()<minLength){
                min=x;
                minLength = str[x].length();
            }


        }

        System.out.println(str[min]);
    }
*/

       int minimumWord=str[0].length();
       int minimum=0;

        for (int i = 0; i <str.length ; i++) {
            if(str[i].length()<minimumWord){
                minimum=i;
                minimumWord=str[i].length();
            }
        }
        System.out.println(str[minimum]);
        }

}