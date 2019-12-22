package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        // sintax for creating and assigning value
        // dataType variable=value here

        //dytax for creating variable to store multiple items
        //and  assign a value
        //datatype[] varibaleNmae=new dataType[count of item]
        //this array can hold 4 item, it also known as array size
        int num1=10;

        int[] score= new int[4];
        score[0]=95;
        score[1]=70;
        score[2]=88;
        score[3]=100;



        System.out.println( score[0] );
        System.out.println( score[1] );
        System.out.println( score[2] );
        System.out.println(score[3] );


        byte[]data=new byte[4];
        data[0]=2;
        data[1]=4;
        data[2]=5;
        data[3]=7;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3]=8;
        System.out.println(data[3]);

    }

}
