package day12;

public class WarmUpSeasonFinder {
    public static void main(String[] args) {
        //if the month is between6-8 print its summer
        //if


        int month= 6;
        if (month<1 ||month>12) {
            System.out.println("Invalid month");
        }else if(month>=3 && month<=5) {
            System.out.println("Its spring");
        }else if(month>=6 && month<=8){
            System.out.println("Its summer");}
        else if (month>= 9 && month<=11) {
            System.out.println("Its fall");
        }else {
            System.out.println("Its winter");

        }


        }
}
