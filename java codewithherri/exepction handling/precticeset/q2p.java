import java.util.Scanner;

public class q2p {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter a:"); 
       int a=sc.nextInt();
       System.out.print("enter b:"); 
       int b=sc.nextInt();



       try {
            System.out.println("div is:"+a/b);
       } catch (ArithmeticException e) {
            System.out.println("HaHa");
            System.out.println("exepction is:"+e.getMessage());
       }catch(IllegalArgumentException e){
          System.out.println("HeHe");
          System.out.println("exepction is:"+e.getMessage());
       }
       


    }
}