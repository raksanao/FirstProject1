package day22;

public class LoopingThroughArray {
    public static void main(String[] args) {

        int[] score=new int[4];
        score[0]=95;
        score[1]=56;
        score[2]=88;
        score[3]=100;
        int itemCount=score.length;
       // String name="JOhn Snow";
       // int charCount =name.length();
        int lastIndex=itemCount-1;
        for (int x = itemCount-1; x >=0 ; x--) {
            System.out.println(score[x]);

        }

    }
}
