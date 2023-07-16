
  class myThred extends Thread{
 public void run(){
        // task for thread
      
        for(int i=1;i<=10;i++){
            System.out.println("i am .............here        ...............");
            try{
                 Thread.sleep(0);
               }catch(Exception e){
           }
        }
    }
}

class myThred2  extends Thread{
    public void run(){
        // task for thread
            for(int i=0;i<10;i++)
            System.out.println("i am goooooooo.....................");
            try{
                 Thread.sleep(0);
               }catch(Exception e){
           }
        
        }
    }

    public class runable2p{
    public static void main(String[] args) {

        myThred t=new myThred();
        myThred2 t2=new myThred2();

        t.start();
        t2.start();
        

    }
}
