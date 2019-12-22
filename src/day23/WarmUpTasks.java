package day23;

public class WarmUpTasks {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i <=num.length ; i++) {

            System.out.print(num[i]);
        }
        int size=num.length;
        int index=size-1;
        int value=num[index];
        System.out.println("Value of last index is "+value);
        int middle=value/2;
        System.out.println("Its middle number "+num[middle]);
          int sum=0;
         for (int x = 0; x <=size ; x++) {
            sum=sum+num[x];
             System.out.println("sum"+sum);
        }

    }
    }







