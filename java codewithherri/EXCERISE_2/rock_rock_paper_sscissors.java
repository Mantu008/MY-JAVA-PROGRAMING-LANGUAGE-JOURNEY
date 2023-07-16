
import java.util.Random;
import java.util.Scanner;

public class rock_rock_paper_sscissors {
public static void main(String[] args) {
       
    //0 for rock
    //1 for paper
    //2 for scisor

    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER 0 FOR ROCK,1 FOR PAPER,2 FOR SCISOR:");
    int userInput=sc.nextInt();

    if(userInput<=2 && userInput>=0){
    Random random=new Random();
    int ComputerInput=random.nextInt(3);

    if(userInput==ComputerInput){
        System.out.println("Draw");
    }else if( userInput==0 && ComputerInput==2 || userInput==1 &&ComputerInput==0 || userInput==2 && ComputerInput==1){
        System.out.println("YOU WON");
    }else{
        System.out.println("COMPUTER WIN");
    }

    if(ComputerInput==0){
        System.out.println("Computer choice:rock");
    }else if(ComputerInput==1){
        System.out.println("Computer choice:paper");
    }else if(ComputerInput==2){
        System.out.println("Computer choice:scisor");
    }
}else{
    System.out.println("you chose wrong choice");
}

}  
} 