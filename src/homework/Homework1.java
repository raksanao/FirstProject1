package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == nums[j]) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.print(nums[j]);


            }



        }


    }
}
