package day23;

public class Repl71 {
    public static void main(String[] args) {
        char start='z';
        char end='v';
        for (int i = (int)start; i >=(int)end; i--) {
            for (int j = (int)start; j >=(int)end ; j--) {
                System.out.println((char)i+""+(char)j);
            }   
        }

    }
}
