package day21;

public class Task {
    public static void main(String[] args) {
        // int sum = 0;
        // for (int x = 1; x <= 10; x++) {
        //    sum = sum + x;
        //  if (sum > 40)
        //    break;
        //   System.out.println(sum);
        String name ="Omar";
        for(int x =0; x<name.length();x++){
            char currentCar=name.charAt(x);
            if(currentCar=='m'){
                System.out.println("found");
                break;



            }
            System.out.println(currentCar);

        }
    }
}
