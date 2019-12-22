package homework;

import org.w3c.dom.ls.LSOutput;

public class Cell {
    public static void main(String[] args) {
        System.out.println("--- THIS IS HOW WE READ EXCEL ---");

        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                System.out.print("Cell"+"("+i+","+j+")");
                
            }
            System.out.println();

    }
        System.out.println("----ACTUAL EXCEL USE A-Z FOR COLUMN---");
        for (int i = 1; i <=6 ; i++) {
            for (char j = 'A'; j <='D' ; j++) {
                System.out.print("Cell"+"("+i+","+j+")");
                
            }
            System.out.println();
        }
        
    }
}