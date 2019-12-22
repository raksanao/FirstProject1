package day31;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {
        finallyAwake();
    }
public static void finallyAwake(){
wakeUp();
    drinkCoffee();
}

        public static void wakeUp(){
        System.out.println("Open ur eye");
        System.out.println("Close ur eye");
        System.out.println("Hear ur alarm open it again");
        System.out.println("---------------------");


    }
    public static void drinkCoffee() {

        System.out.println("put coffee in ur machine");
        System.out.println("Press the button Make your coffee");
        System.out.println("----------------------");
    }






    }
