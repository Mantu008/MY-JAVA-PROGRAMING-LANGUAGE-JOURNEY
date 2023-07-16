import java.util.Random;
import java.util.Scanner;
public class number_gussin {
    public static void main(String[] args) {
        Random random= new Random();
        int r=random.nextInt(100);
        System.out.println("the random num is="+r);
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        for(int i=1;i!=r;i++){
            if(n>r){
                System.out.println("you are guess higher number chose smaller number");
            }else if(n<r){
                System.out.println("you are guess lower number chose grator number");
            }else{
                System.out.println("you are guess correct number");
            }
        } 

    }

}
