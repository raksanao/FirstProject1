package day23;

public class FindMax {
    public static void main(String[] args) {
        long salary[]={120000,112000,123000,154000,98000};
        long a=salary[0];
        for (long whatIsThis:salary) {
            if (whatIsThis>a) {
                a=whatIsThis;
            }
        }
        System.out.println(a);
    }
    }

