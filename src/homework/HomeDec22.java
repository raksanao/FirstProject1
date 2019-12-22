package homework;

import org.w3c.dom.ls.LSOutput;

public class HomeDec22 {


    public static void reversePrintMyOwnName() {
        String name = "Raksana";
        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.print(name.charAt(i));

        }
        System.out.println();
    }

    public static void reversePrintAnyName() {
        String myDaughtersName = "Sofia";
        for (int i = myDaughtersName.length() - 1; i >= 0; i--) {
            System.out.print(myDaughtersName.charAt(i));

        }
        System.out.println();
    }

    public static void printLastCharacterOfName() {
        String lastLet = "Omar";
        for (int i = 0; i < lastLet.length(); i++) {
        }
        System.out.println(lastLet.substring(lastLet.length() - 1));

    }

    public static void printFullNameInformation() {
        String firstName, lastName;
        firstName = "Raksana";
        lastName = "Olimova";
        System.out.println("My first name is " + firstName + " and" + " my last name is " + lastName);

    }

    public static void lengthOfTheFullName() {
        String fullName = "Rukshona Olimova";
        for (int i = 0; i <fullName.length() ; i++) {

        }
        System.out.println(fullName.length());
    }

public static void compareNameCharacterCount(){

String name1,name2;
name1="Aziza";
name2="Omar";
int count=0;
if (name1.length()>name2.length()) {
    count++;
    System.out.println(name1+" -name 1 is longer");
}else {

    System.out.println(name2 + " name 2 longer");

}
    System.out.println(count);
}
public static void printAtoZ(){
        char firstChar='A';
        char secondChar='Z';
        for(char iChar=firstChar;iChar<=secondChar;iChar++){
            System.out.print(iChar+" ");
        }
    System.out.println();
}
    public static void main(String[] args) {

        reversePrintMyOwnName();
        reversePrintAnyName();
        printLastCharacterOfName();
        printFullNameInformation();
        lengthOfTheFullName();
        compareNameCharacterCount();
        printAtoZ();
    }

}