package day22;

public class CharArray {
    public static void main(String[] args) {
        //create a char arrey that holds all the letter from your name
        //and assign values  using each characters of your name
        // then print out each character
        char name[] = new char[4];
        name[0] = 'r';
        name[1] = 'u';
        name[2] = 'x';
        name[3] = 'a';
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name);

        boolean[] bool=new boolean[3];
        System.out.println(bool[0]);
        System.out.println(bool[1]);
        System.out.println(bool[2]);
        System.out.println(bool[3]);

        bool[0]=true;
        System.out.println( bool[0]);
    }
}
