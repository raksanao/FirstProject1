package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
        //break;
        //if line contains break reaches the loop will stop


        //  for (int x = 1; x <= 10; x++) {
        //    System.out.println(x);
        //  break;
        // continue;
        //if line continue rich the loop will skip to next iteration
        //  }
        // for (int i = 1; i <= 10; i++) {
        //  System.out.println(i);
        //if (i == 5) {
        // break;

        int sum = 0;

        for (int x = 1; x <= 10; x++) {
            sum = sum + x;
            if (sum > 40) {
                break;
            }
            System.out.println("sum = " + sum);

        }
    }
}