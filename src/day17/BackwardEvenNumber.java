package day17;

public class BackwardEvenNumber {
    public static void main(String[] args) {
        //print all the even number backward from 100 to 0
//try to use if statement rather than -2

        int x = 100;


        while (x >=0) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
                --x;
            }
        }
    }
