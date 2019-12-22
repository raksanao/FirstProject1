package ReplTasks;

public class Exer {
    public static void main(String[] args) {
        //How to get the length of sentence
        String sentence = " I love java but its really hard to understand  ";
        System.out.println("The length of my sentence is " + sentence.length());
        //how to make all the characters UpperCase and LowerCase
        String upp = sentence.toUpperCase();
        System.out.println(upp);
        String low = sentence.toLowerCase();
        System.out.println(low);
        //Trim the sentence and words
        String trm = sentence.trim();
        System.out.println(trm);

        // How to check index of 'T' on my String sentence

        char letO = 'o';
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letO) {
                System.out.println("index of" + letO + i);
                //How to find quantity of characters

                int count = 0;
                char letL = 'l';
                for (int j = 0; j < sentence.length(); j++) {
                    if (sentence.charAt(j) == letL) {
                        count++;
                    }
                }
                System.out.println("Count of " + letL + "is" + count);

                //make Word Reversed
                String word = " rukhshona";
                String reversed = "";
                for (int k = word.length() - 1; k >= 0; k--) {
                    reversed += word.charAt(k);

                }
                System.out.println(reversed);

            }

            String getthelength = "im so tiref of pratising";
            System.out.println(getthelength.length());

        }


    }


}
