
import java.util.Scanner;
public class elae_if_clause {
    public static void main(String[] args) {
         Scanner a=new Scanner(System.in);
         System.out.print("enter your age:");
         int age=a.nextInt();
        if(age>70)
        {
            System.out.println("you are now old");
        }else if(age>50){
            System.out.println("you are reach 50");
        }else if(age>20){
            System.out.println("now it time for learn new things");
        }else{
            System.out.println("now you are a college student");
        }
    }
}
