
class first extends Thread{
        
  public void run() {
       for(int i=1;i<=5;i++){
         System.out.println("Hiiiii");

         try {
             Thread.sleep(1000);
   } catch (Exception e) {
       System.out.println(e);
   }
       }

      
  }
}
class second extends Thread{
 
public void run() {
  for(int i=1;i<=5;i++){
    System.out.println("Hello");



    try {
     Thread.sleep(2000);
    } catch (Exception e) {
  System.out.println(e);
  }
  }

  
}
}
class third extends Thread{
        
  public void run() {
       for(int i=1;i<=5;i++){
         System.out.println("How Are You..?");
         
       try {
          Thread.sleep(3000);
    }  catch (Exception e) {
    System.out.println(e);
}
       }

  }
}
public class precticle22p {
public static void main(String[] args) {
   first t1=new first();
   t1.start();  
   second t2=new second();
   t2.start();  
   third t3=new third();
   t3.start();  
}
}
