import java.util.*;
class invalidage extends Exception{
    invalidage(){
         super("age is invalid");
    }
    invalidage(String massage){
        super(massage);
    }
}
class example extends Exception{
public static void main(String[] args){
  
     
    System.out.println("starting...");
    Scanner  sc=new Scanner(System.in);


   
    try {
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        System.out.println("we got two number:");
        int div=a/b;
        System.out.println("division is:"+div);

        if(b<10){
            throw new invalidage();
        }
     
    }  catch (Exception e) {

        System.out.println("generating exepction :"+e.getMessage());
      
    }finally{
        System.out.println("i am in finally block");
        System.out.println("closing all the recurces");
    }
  

    System.out.println("terminited");

}

}