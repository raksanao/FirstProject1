package day17;

public class NamePrinter_WhileLoop {
    public static void main(String[] args) {
        //Get each char vertically
        // String name="Raksana";

        // int x =0;
        //while(x<name.length()){
        //    System.out.print(" "+x+" :");
        //  System.out.println(name.charAt(x));
        //  ++x;


        //assume u dont know ur name length
        //write a program to print ur name backword

        String name1 = "Rukhshona";
        int x = name1.length() - 1;
        while (x >= 0) {
            System.out.println("index "+x+"-"+name1.charAt(x));
            --x;


        }











    }
}
