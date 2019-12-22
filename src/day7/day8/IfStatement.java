package day7.day8;

public class IfStatement {
    public static void main(String[] args) {
//inside parenthesis we can put boolean value,boolean variable, any expression that returms value
        int speedLimit =60;
        int yourCurrentSpeed = 75;
        boolean ISpeeding =yourCurrentSpeed>speedLimit;
        //if(ISpeeding) {
       // if(true){
        if(yourCurrentSpeed>speedLimit ){
            System.out.println("Get pulled ove by polic");
            System.out.println("given ticket by police");
            System.out.println("taken away some point on ur licence");
            System.out.println("go to cort");
        }else{
            System.out.println("enjoy your day");

        }
       // System.out.println("The end");
        //if yourCurrent speed is more that speed limit
        // get pulled over by the police
        // given ticket by the police
        // taken away some point on your license
        //go to court
        //if not over the limit
        //go shopping




    }
}
