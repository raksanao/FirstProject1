package day12;

public class LoginTestV2 {
    public static void main(String[] args) {




        String userName="abc123";
        boolean userNameCore=userName.equals("ABC123");
        System.out.println(userNameCore);


        boolean usenamecor2 = userName.equalsIgnoreCase("ABC123");
        System.out.println(usenamecor2);

       String myName2 ="Raksana";
       boolean name =myName2.equals("raksana");
        System.out.println(name);

        String myName="raksana";
        boolean  myNameCorrect=myName.equalsIgnoreCase("Raksana");
        System.out.println(myNameCorrect);

    }
}
