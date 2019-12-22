package Day32;

public class NumberAction {
    public static void main(String[] args) {
        numberComparision(20, 30);
        numberComparision(770, 60);
        numberComparision(15, 15);
        repeater("I did it", 3);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(4);
    }


    public static void numberComparision(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("num 1 is more than num2");

        } else if (num2 > num1) {
            System.out.println("num 2 is more than num1");
        } else {
            System.out.println("they are equal");
        }
        System.out.println();
    }

    public static void repeater(String strToRepeat, int count) {
        for (int x = 1; x <= count; x++) {
            System.out.print(strToRepeat);
        }
        System.out.println();

    }

    public static void skipCountBy3From0to50() {

        for (int i = 0; i <= 50; i += 3) {
            System.out.print(i + " ");

        }

        System.out.println();
    }

    public static void countDownByEvenNumberFrom50to0() {
        for (int i = 50; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
        System.out.println();
    }

    public static void print1toX(int x){
        for (int i = 1; i <=x ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
        }


