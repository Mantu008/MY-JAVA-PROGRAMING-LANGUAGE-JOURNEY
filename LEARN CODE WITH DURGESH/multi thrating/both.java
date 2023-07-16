class mythread1 implements Runnable{
     public void run(){

      synchronized(this){
      int i=1;
      while(i<=10) {
        System.out.println("the value of i using runable thrade is:"+i);
        
        try {
          Thread.sleep(0000);
        } catch (Exception e) {
        }
        i++;
       }
       this.notify();
      }
    }

      
}

class mythread2 extends Thread{
   public void run(){
    synchronized(this){
      int i=10;
      while(i>0) {
        System.out.println("the value of i using thread class is:"+i);
        try {
            Thread.sleep(0000);
          } catch (Exception e) {
          } 
        i--;
       }
       this.notify();
      }
    }


}
public class both {
public static void main(String[] args) {
   
    mythread1 t1=new mythread1();
    Thread  T=new Thread(t1);
     T.start();


     synchronized(T){
        try {
              T.wait();
        } catch (Exception e) {
          // TODO: handle exception
        }
     }

    mythread2 t2=new mythread2();
    t2.start();

    synchronized(T){
      try {
            t2.wait();
      } catch (Exception e) {
        // TODO: handle exception
      }
   }


    
}
}