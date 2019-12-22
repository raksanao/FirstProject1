package day27;

import org.w3c.dom.ls.LSOutput;

public class MultidiminsionalArray {
    public static void main(String[] args) {

int [][] number={{12,11,20,19},{18,45,65}};
int max=number[0][0];
        for (int i = 0; i <number.length ; i++) {
            for (int j = 0; j <number[i].length; j++) {
if(max<number[i][j]){
    max=number[i][j];
}
            }
        }
        System.out.println(max);
        int mx2=number[0][0];
        for(int []each:number) {
            for (int eachInt : each) {
                if (mx2 < eachInt) {
                    mx2 = eachInt;
                }
            }
        }
        System.out.println(mx2);


        //finding the minimum
        int min=number[0][0];
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j <number[i].length ; j++) {
              if(min>number[i][j])  {
                  min=number[i][j];

              }
            }

        }
        System.out.println(min);
        System.out.println("============");
        String[]dev={"azia","hasan","olim","Inobat"};
        String[]tesers={"Ruxa","Lisa","Sofia","fara"};
        String[]busnissAnaliys={"ogulveg","Karima","hasan"};
        String[][]scrumTeam={dev,tesers,busnissAnaliys};

    }
}


