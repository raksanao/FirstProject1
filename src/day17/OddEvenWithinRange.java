package day17;

public class OddEvenWithinRange {
    public static void main(String[] args) {
        //Write program to print out even number from0 to 50;
        //Write a program to print odd number from 0 to 50;
        //-----------------------------------------
        //Even

        int cnt = 0;
        while (cnt <= 50) {
            cnt += 2;

            System.out.print(cnt + " ");
        }

        //odd
        int cnt2 = 1;
        while (cnt2 <= 50) {
            System.out.print(cnt2 + ",");
            cnt2 += 2;

        }
        int cnt3 = 0;
        while (cnt3 <= 50) {
            if (cnt3 % 2 == 0) {
                System.out.print(cnt3 + "Even");
            } else {
                System.out.print(cnt3 + "Odd");
            }
            ++cnt3;
        }
    }
}