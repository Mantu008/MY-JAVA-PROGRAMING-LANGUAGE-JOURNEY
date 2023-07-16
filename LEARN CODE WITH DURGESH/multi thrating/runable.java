 class myThred  implements Runnable{
    public void run(){
        // task for thread
      
           for(int i=0;i<300;i++){
            System.out.println("i      am sleeping");
            try{
                 Thread.sleep(0);
               }catch(Exception e){
           }

        }
    }
}

class myThred2  implements Runnable{
    public void run(){
        // task for thread
            for(int i=0;i<300;i++)
            System.out.println("i am reading.....................");
            try{
                 Thread.sleep(0);
               }catch(Exception e){
           }
        
        }
    }



public class runable {
    public static void main(String[] args) {

        myThred t= new myThred();
        Thread t1=new Thread(t);

        myThred2 T= new myThred2();
        Thread t2=new Thread(T);

        t1.start();
        t2.start();

    }
}
