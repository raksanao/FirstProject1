package day22;

public class MorningTask {
    public static void main(String[] args) {


        String mas=" ",
      abc="aaabbbccdggggglggggkhhhdddd";
        for (int i = 0; i <=mas.length()-1 ; i++) {
            if (!mas.contains(abc.substring(i + 1))) {
                mas += abc.charAt(i);
            }
        }
                    System.out.println(abc);
            }

        }



