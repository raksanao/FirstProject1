package day21;

public class NestedLoopIntro {
    public static void main(String[] args) {
        for (int x = 1; x <= 4; x++) {
            System.out.println("Iteration " + x);}
            for (int i = 1; i <= 10; i++){
                if (i % 2 != 0){

                    System.out.println(i + " ");
                }
            }
            System.out.println();
        }
    }
