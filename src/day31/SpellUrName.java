package day31;

public class SpellUrName {


    public static void spellYourname() {
        // Create a method to spell your name :  Raksana -->> R-ak-s-a-n-a
        String myName = "Raksana";
        for (int i = 0; i < myName.length() - 1; i++) {
            System.out.print(myName.charAt(i) + "-");
        }
        System.out.println(myName.charAt(myName.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("Spell 1");
        spellYourname();

    }

}
