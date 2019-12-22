package day21;

import java.util.Scanner;

public class NumberStairCase {
    public static void main(String[] args) {
        for (int x = 0; x <= 1; x++) {
            for (int y = 0; y <= 1; y++) {
                System.out.println(x + "+" + y + "=" + y + x);
            }
            System.out.println();
        }

    }
}