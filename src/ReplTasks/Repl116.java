package ReplTasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Repl116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        int count = 0 ;
        for (int i = 0; i <= 9; i++) {
            nums[i] = input.nextInt();

                if (nums[i]%2==0) {
                    count+=1;
                }
            }
            System.out.println(count) ;
        }
          //  System.out.println(countOfEven+countOfEven);
           //int count=0;
         //  for(int eachNum:nums){
            //   if(eachNum%2==0){
            //       count++;
            //   }
          //}
          //  System.out.println(count);
                }


