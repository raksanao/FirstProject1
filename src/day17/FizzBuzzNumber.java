package day17;

public class FizzBuzzNumber {
    public static void main(String[] args) {

         int num =1;
      while (num<=50){
     if(num%5==0 && num%3==0) {
        System.out.println(num+" Fizz Buzz");
     } else if(num%5==0) {
        System.out.println(num+" Fizz");
     }else if(num%3==0){
        System.out.println(num+" Buzz");
     }
     ++num;
}



    }
}
