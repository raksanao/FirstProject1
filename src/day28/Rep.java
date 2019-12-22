package day28;

import java.util.Arrays;
import java.util.Scanner;

public class Rep {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;
        String input="";

        do{

            System.out.println("Enter Item"+count+" and its price:");
            item=scan.next();
            price=scan.nextDouble();
            shoppingListReport+="item"+count+": "+item+" price: "+price+", ";
            count++;
            System.out.println("Add one more item?");
           countinue=scan.next();
           totalProce+=price;

        }while(countinue.equalsIgnoreCase("yes")&&count<=10);
       shoppingListReport=shoppingListReport.substring(0,shoppingListReport.length()-2);
        System.out.println(shoppingListReport);
        System.out.println("Total price: "+totalProce);
        }
        }





       // System.out.println(Arrays.toString([i]));

