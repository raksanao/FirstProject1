package ReplTasks;

import java.util.Scanner;

public class Reple77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int underScore=email.indexOf("_");
        int signAt=email.indexOf("@");
        int dot=email.indexOf(".");

      String name=email.charAt(0)+"";
        String lastName=""+email.charAt(email.indexOf("_")+1);

        String part1=name.toUpperCase()+email.substring(1,underScore);
        System.out.println("First name: "+part1);

        String part2=lastName.toUpperCase()+email.substring(underScore+2,signAt);
        System.out.println("Last name: "+part2);

        String part3=email.substring(signAt+1,dot);
        System.out.println("Domain: "+part3);

        String part4=email.substring(dot+1);
        System.out.println("Top-Level Domain: "+part4);






        //String e = scan.next();
       // String b=e.charAt(0)+"";
       // String c=""+e.charAt(e.indexOf("_")+1);
        //System.out.println("First name: "+b.toUpperCase()+e.substring(1,e.indexOf("_")));
        //System.out.println("Last name: "+c.toUpperCase()+e.substring(e.indexOf("_")+2,e.indexOf("@")));
       // System.out.println("Domain: "+e.substring(e.indexOf("@")+1,e.indexOf(".")));
        //System.out.println("Top-Level Domain: "+e.substring(e.indexOf(".")+1,e.length()));




    }
}
