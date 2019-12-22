package day10;

public class newLesson {
    public static void main(String[] args) {
        System.out.println("Welcome to call center please select your number");
String lang="";
int call= 3;
switch (call){
    case 1:
        System.out.println("you selected 1");
        lang="English";
        break;
    case 2:
        System.out.println("you selected 2");
        lang="German";
        break;
    case 3:
        System.out.println("you selected 3");
        lang="Tajik";
        break;
    default:
        System.out.println("Unknown language");

}
        System.out.println("Your language is "+lang);
    }
}