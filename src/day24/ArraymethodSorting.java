package day24;

import java.util.Arrays;

public class ArraymethodSorting {
    public static void main(String[] args) {
        int [] scores={33,45,76,34,23,44};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);

        char[]nameChar={'a','C','9','D'};
        System.out.println("nameChar = " +Arrays.toString (nameChar));;
        Arrays.sort(nameChar);
        System.out.println(Arrays.toString(nameChar));

        boolean[]fiveSwitchOff={true,false,true ,false};
        System.out.println("fiveSwitchOff = " +Arrays.toString (fiveSwitchOff));

    }
}
