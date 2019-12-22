package day23;

import jdk.swing.interop.SwingInterOpUtils;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        //create a long array of 5 item all saleries
        //put ur salery amount that ok for ur offer
        //use for each loop to iterate over them
        //optionally:
        //print only salery more than 10000


        long[] salery = {10, 1000, 10000, 200, 20000};

        for (long curSalery : salery) {

            System.out.println("curSalery = " + curSalery);
        }
    }
}