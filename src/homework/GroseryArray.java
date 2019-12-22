package homework;

import java.util.Arrays;

public class GroseryArray {
    public static void main(String[] args) {
        String fruites[] = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float prices[] = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
//1, loop through each grocery items and print them in one line
        for (int i = 6; i <= fruites.length; i++) {
            System.out.println(Arrays.toString(fruites));
//    1.2 print all items in reverse order

            for (int j = fruites.length - 1; j >= 0; j--) {
                System.out.print(fruites[j] + ",");
                //1.4 find out the count of groceries that contains berry in the name
                int count = 0;
                for (int k = 0; k <= fruites.length - 1; k++) {
                    if (fruites[k].contains("berry")) {
                        count++;
                        System.out.println(count);
                    }
                }

            }
        }
    }
}