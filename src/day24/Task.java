package day24;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int [] nums1 ={2,4,1,34,8};
        int [] nums2 ={2,4,1,34,8};
        boolean checkIfarraysEqual=true;
        if(nums1.length!=nums2.length){
            checkIfarraysEqual=false;
            System.out.println("Arrays are no equal. Have different amount of elements");
        }else{
            for(int i=0; i< nums1.length; i++){
                if(nums1[i]!=nums2[i]){
                    checkIfarraysEqual=false;
                    break;
                }
            }
        }
        System.out.println(checkIfarraysEqual);
    }

        }


