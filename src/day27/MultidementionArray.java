package day27;

import java.util.Arrays;

public class MultidementionArray {
    public static void main(String[] args) {

   //Single demention array
   //multi dimensional arrey

int[][]numbers={{1,2,3},{4,5,6},{7,8,9},{10,11,12,13}};
        for (int n = 0; n < numbers.length; n++) {
            System.out.println(Arrays.toString(numbers[n]));
            for (int i = 0; i <numbers[n].length ; i++) {
                System.out.println(numbers[n][i]+" ");
            }
        }

    }
}
