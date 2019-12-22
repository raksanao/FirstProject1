package day19;

public class FindingtheCount {
    public static void main(String[] args) {
        //from 1-100 print out all the numbers can be divided by 15 without remainder
        int counter = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 00)
                System.out.println(i);
            ++counter;

        }
    }
}