package homework;

public class Homework2FindA {
    public static void main(String[] args) {
        String name = "Rukhshonana";
        int count = 0;
        for (int x = 0; x < name.length(); x++) {
            System.out.println(name.charAt(x));
            if (name.charAt(x) == 'a') {
                System.out.println("found a");
                ++count;

            }
            System.out.println(count);
        }
    }

}

