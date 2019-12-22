package day17;

public class Practice {
    public static void main(String[] args) {

    // String name="rUxShOna";

    // String name2=name.toUpperCase().substring(0,1);
        //name2+=name.substring(1).toLowerCase();

        //   System.out.println(name2);

        //String name1="ruXSona";
      //  String name2=(name1.charAt(0)+"").toUpperCase();
       // name2=name2+name1.substring(1).toLowerCase();
      //  System.out.println(name2);


String fullname="ruxa olim";
String first=fullname.substring(0,4);
String last=fullname.substring(5);
String firstcor=first.toUpperCase().substring(0,1)+first.toLowerCase().substring(1);
        System.out.println(firstcor);




    }
}