package day21;

public class SkipAll5s {
    public static void main(String[] args) {
        //count 1to100
        //skipp all the numbers divisible by 5
        //x%5==0
        //  for (int x = 1; x <= 100; x++) {
        //     if (x % 5 == 0) {
        //       System.out.println("skip" +x);
        //      continue;
        //  }
        //   System.out.println(x);
        for (int x = 1; x <= 100; x++) {
            if (x % 5 != 0) {
                System.out.println(x);
            } else {
                System.out.println("skipp "+x);

            }
        }
    }
    }