package ReplTasks;

import java.util.Scanner;

public class Reple121 {
    public static void main(String[] args) {

      //  Given an array nums, calculate count
        //  of even numbers in nums (not their values!)
        //  and print out to console.
//nums → [2, 1, 2, 3, 4]) → 3
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

       //int num[]={2,1,2,3,4};

int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]%2==0){
                count++;

            }

        }
        System.out.println(count);
    }
}
