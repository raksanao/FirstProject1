package day27;

public class EachArray {
    public static void main(String[] args) {
int [][]arr2D={{10,20,30},{40,50,60,70,80}};
for(int[] each:arr2D) {
    for (int eaxhElement : each) {
        System.out.println(eaxhElement + "");
    }

}


    }
}