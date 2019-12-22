package day23;

public class StringArayPractice {
    public static void main(String[] args) {
       //we created array in shortway just by opening up{}
        //we put them in defirent line since white space bot matter
        String[]show={"orville", "Gifted",
                      "Flash","Super Girl"};
       int showsCount=show.length;
        System.out.println("showsCount = " + showsCount);
        for (int i = 0; i <showsCount ; i++) {
       String currentShow=show[i];
            System.out.println(currentShow+" has character count "+currentShow.length());

        }
    }
}
