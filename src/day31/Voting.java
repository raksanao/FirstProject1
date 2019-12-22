package day31;

public class Voting {
    public static void main(String[] args) {
        checkEligiblity(16);


        int youAge=32;
        checkEligiblity((youAge));
    }


    public static void checkEligiblity(int age) {

        if (age > 18) {
            System.out.println(" U are eligble");
        } else {
            System.out.println("U r not eligble");

        }

    }
}
