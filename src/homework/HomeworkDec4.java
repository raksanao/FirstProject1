package homework;

public class HomeworkDec4 {
    public static void main(String[] args) {
        int count = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 15 == 0) {
                System.out.println(x);

                ++count;
            }
        }
    }
}