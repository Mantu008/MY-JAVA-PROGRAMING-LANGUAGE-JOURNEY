import java.util.Random;
import java.util.Scanner;

class game{
        public  int number;
        public int inputnumber;
        public int noofguess=0;
        
        game(){
                Random r=new Random();
                this.number=r.nextInt(100);
        }
        void userinput(){
            System.out.print("guess number:");
            Scanner sc=new Scanner(System.in);
            inputnumber=sc.nextInt();
        }

        boolean iscorrectnum(){
            noofguess++;
             if(inputnumber==number){
                System.out.printf("you guess correct number in %d attempt",noofguess);
                     return true;
        }else if(inputnumber>number){
            System.out.println("guess smaller number");
        }
        else if(inputnumber<number){
            System.out.println("guess grator number");
        }
         return false;
        
}
}
public class number_gussing_game {
    public static void main(String[] args) {

        game g=new game();
        
        boolean b=false;

        while(!b){
            g.userinput();
            b=g.iscorrectnum();
        }
        
    }
}
