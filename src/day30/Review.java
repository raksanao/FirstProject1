package day30;

public class Review {
    public static void main(String[] args) {

//"carmake-carmodel",
//"Acura-NSX",
//"Chevrolet-Corvette",
//"Chevrolet-Cavalier",
//"BMW-3 Series",
//"Pontiac-LeMans",
//"Oldsmobile-Achieva",
//"Honda-Civic",
        //creat an array that have those data
        String car[]={
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "Oldsmobile-Achieva",
                "Honda-Civic",};
        //count how many Chevrolet is in this list
      //how many civic you have
      int countCivic=0;
        int countChev=0;
        for(String eachCar:car){
           if(eachCar.contains("Civic")) {
               countCivic++;
           }else if (eachCar.contains("Chevrolet")){
               countChev++;
           }
}
        System.out.println(countChev+"Count of Chevrolet");
        System.out.println(countCivic+"Count of Civic");
        //Task2 print all location of civic
        for (int i = 0; i < car.length; i++) {
            if(car[i].contains("Civic")){
                System.out.println(" Location of Civic is"+i);
            }

        }

    //if(car[i].contains(Civic)
}

        }