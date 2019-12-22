package day29;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
     //   Scanner scan = new Scanner(System.in);

     /*  String hero1 = "Superman-Clark J Kent";
        String[] heroSplitted = hero1.split("-");
        String heroCode = heroSplitted[0];
        String fullName = heroSplitted[1];
        String stars = "";
        for (int i = 1; i <= fullName.length(); i++) {
            stars += "*";
        }
        String heroX = hero1.replace(fullName, stars);
        System.out.println( hero1);
        System.out.println( heroX);
*/



        String []movie = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

       for(String each:movie){
           System.out.println(each);
           String []split=each.split("-");
           String star="";
           for (int i = 0; i <split[1].length() ; i++) {
               star+="*";


           }
           System.out.println(split[0]+"-"+star);
           System.out.println();



        //for (String eachMovie : movie ) {
         //   System.out.println (eachMovie);
           // String[] arrMovie = eachMovie.split("-") ;
           // String stars = "";
          //  for (int i = 0; i < arrMovie[1].length() ; i++) {
           //     stars+="*";
           // }
           // System.out.println(arrMovie[0]+"-"+stars);
           // System.out.println();
        }


        }



        }
