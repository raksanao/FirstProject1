package day22;

public class CreatingArray2 {
    public static void main(String[] args) {
       int num;
       num=10;
       int[] age;
       age=new int[]{1,2,3,45,34};


       int[] areaCode={703,300,954,665};
        for (int i = 0; i < areaCode.length; i++) {
            System.out.println(areaCode[i]+" ");

        }








        //creating array in second way

        int[] ages =new int[]{1,2,3,45,34};
        int itemCount= ages.length;
        System.out.println("itemCount = " + itemCount);;
        for (int x = 0; x <itemCount; x++) {
            System.out.println(ages[x]);

        }

    }
}
