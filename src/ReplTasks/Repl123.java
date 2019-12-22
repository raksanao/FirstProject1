package ReplTasks;

public class Repl123 {
    public static void main(String[] args) {
        int growth=1;
        int year=0;
        int treeSize=0;
        for (int i = 1; i <=10; i++) {
           // System.out.println("year "+i +"- growth "+i+" cm\n" +
                //    "tree size:"+i+" cm");
            if(i<4) {
                treeSize+=1;
            }else{
                treeSize+=2;
            growth=2;
            }

            System.out.println("year "+i+" - growth "+growth+" cm"+"\n"+"tree size: "+i+"cm");

        }
    }
}
