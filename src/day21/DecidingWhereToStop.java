package day21;

public class DecidingWhereToStop {
    public static void main(String[] args) {
        String name="hello";
        int count =name.length();
        int q=3;
        for(int x=0;x<=count-q;x++) {
            System.out.println(name.substring(x,x + q));
        }
    }
}