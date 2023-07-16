import java.util.Scanner;

public class multicath {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
      

       try {
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt(); 
          System.out.println("division of a and b is:"+a/b);
       } catch (ArithmeticException e) {
        // TODO: handle exception
        System.out.println(e);
            
       }catch(Exception e){
                   System.out.println(e);
       }finally{
           System.out.println("it always execuate ");
       }

    }
}
