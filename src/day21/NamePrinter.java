package day21;

public class NamePrinter {
    public static void main(String[] args) {

        String name = "Ruxalia and azalia";
        int corCount = name.length() - 3;
        int counter=0;
        for (int x = 0; x <= corCount; x++) {
            String letteA = name.substring(x, x + 3);
           if(letteA.equalsIgnoreCase("lia"))
                {
                    System.out.println("Index " + x);
                    counter++;
                }

            }
        System.out.println(counter);
        }
    }






