package day22;

public class LoopControlStetment {
    public static void main(String[] args) {
        String name="I love Java";
        for (int i = 0; i <=name.length() ; i++) {
            char curCount=name.charAt(i);
            if(curCount=='a'){
                System.out.println("found");
                break;

        }
            System.out.println(curCount);
            }
    }
}