package ReplTasks;

import java.util.Arrays;
import java.util.Scanner;

public class jhh {
    public static void main(String[] args) {
        String name = "hello";
        String name2 = new String("hello");
        String st ="I have been taking Cybertek course since November";
        //1 To get the length of my sentence
        System.out.println("The length of sentence "+st.length());
        //2 how to make all character upperCase and lowerCase
        String allUpper=st.toUpperCase();
        String allLower= st.toLowerCase();
        System.out.println(allUpper);
        System.out.println(allLower);
//     3 trim the sentence and words
        String trimSen =st.trim();
        System.out.println(trimSen);
        //4 Checking index of my string
        char ch ='c';
        for (int i=0; i<st.length();i++){
            if(st.charAt(i)==ch){
                System.out.println("letter " +ch+ " found in index "+i );
            }
        }
        //5 How to find quantity of character
        int countChar = 0;
        char ch1= 'k';
        for(int i = 0; i<st.length();i++){
            if(st.charAt(i)==ch1){
                countChar++;
            }
        }
        System.out.println("there ara "+countChar+" letters "+ ch1+" in my sentence ");
        //6. Make words reversed. (also can do with StringBuilder,but did not learn yet)
        String reversed  ="";
        for( int i =st.length()-1; i>=0; i--){
            reversed+=st.charAt(i);
        }
        System.out.println(reversed);
        //7 Extract numbers from String
        String st1 = "Aus2ti5n 7is b7eau8ti9ful pl6ac7e to li6ve ";
        String onlyNums =st1.replaceAll("[a-zA-Z]","");
        System.out.println(onlyNums);
        String onlyLetter =st1.replaceAll("[0-9]","");
        System.out.println(onlyLetter);
        //9 Split the sentence by etc
        String trip ="This summer I went to New York city and its was fun";
        String[] trp  = trip.split(" ");
        System.out.println(Arrays.toString(trp));
        System.out.println(trp[0]+" "+trp[7]);
        //another split example, how to write this date like standard format
        String date = "2019/15/9"; // 9/15/2019
        String[]newDate = date.split("/");
        System.out.println(newDate[2]+"/"+ newDate[1]+"/"+newDate[0]) ;
        //how to print valid email from string
        String email = "hello@gmail cyber@gmail.com tech@com @yahoocom myemail@otmail.org";
        String[] arrEmail =email.split(" ");
        for( int i =0; i<arrEmail.length; i++){
//            System.out.println(arrEmail[i]);
            if(   (arrEmail[i].contains("@")  &&  arrEmail[i].contains(".com") )||
                    arrEmail[i].contains("@") && arrEmail[i].contains("org")){
                System.out.println(arrEmail[i]);
            }
        }

    }


}