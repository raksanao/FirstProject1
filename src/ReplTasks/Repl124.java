package ReplTasks;

import java.util.Scanner;

public class Repl124 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below
        for (int i =nums.length-1; i >=0 ; i--) {
            System.out.print(nums[i]);
        }

        int temp = nums[0];
        nums[0] = nums[4];
        nums[4] = temp;
        //Do not change below statement:
      //  System.out.println(Arrays.toString(nums));

    }
}
