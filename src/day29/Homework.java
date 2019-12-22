package day29;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {


                String[] allHeroes = {"Superman-Clark Kent",
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
                for (String eachHero : allHeroes ) {
                    System.out.println (eachHero);

                    String[] arrHeroes = eachHero.split("-") ;

                    String stars = "";
                    for (int i = 0; i < arrHeroes[1].length() ; i++) {
                        stars+="*";
                    }
                    System.out.println(arrHeroes[0]+"-"+stars);
                    System.out.println();
                }

            }
        }




