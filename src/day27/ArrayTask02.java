package day27;

public class ArrayTask02 {
    public static void main(String[] args) {
        //write a program that returns max number
        //do not use sort method

        int[]num={100,3445,765443,3456,7654,3456};
        int max=num[0];
        for (int i = 0; i <num.length ; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
                System.out.println(max+"First mac Number");
        //how to find second max
        int secMaxNum=num[0];
        for (int i = 0; i <num.length ; i++) {
           if(secMaxNum<num[i]&&num[i]!=max) {
               secMaxNum=num[0];

           }
        }
        System.out.println(secMaxNum);
        }

    }
