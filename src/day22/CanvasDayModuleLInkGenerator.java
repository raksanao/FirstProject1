package day22;

public class CanvasDayModuleLInkGenerator {
    public static void main(String[] args) {
        String baseUrl = "https://learn.cybertekschool.com/courses/278/modules#3317";
        String dayMsg = "This will lead you to day";
      //  for (int module = 3317; module <= 3317+25; module++) {
          //  System.out.println(module);

            for (int day = 21; day <= 56; day++) {
                System.out.println(dayMsg + day);
                System.out.println(baseUrl+(3317-21+day));
            }
        }
    }
