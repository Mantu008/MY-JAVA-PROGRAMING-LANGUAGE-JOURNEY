
import java.util.Scanner;
public class q5p {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("enter year:");
        int year=n.nextInt();

        if(year%4==0){
                   if(year%100==0)
                   {
                      if(year%400==0){
                          System.out.println("year is in leap");
                      }else{
                        System.out.println("year is not in leap");
                      }
                   }else{
                    System.out.println("year is in leap");
                   }
        }else{
            System.out.println("year is not in leap");
        }
         
    }
}
