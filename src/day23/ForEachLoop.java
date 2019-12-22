package day23;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] prizes = {99.23, 23.45, 12.23, 20.29, 30.99};
        //for each loop syntax
        //for(data Typeof your array and varible name for each item: your arrau variable
//do something with ur array items
        for (int i = 0; i < prizes.length; i++) {
            double eachPrice = prizes[i];
            System.out.println("eachPrice = " + eachPrice);
        }

        for (double eachprice : prizes) {
            System.out.println("eachprice = " + eachprice);
        }

    }
}