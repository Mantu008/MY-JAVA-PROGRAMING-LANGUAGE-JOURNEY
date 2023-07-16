

class mythread implements Runnable{
   public void run(){

       synchronized(this){

         for(int i=0;i<20;i++){
            System.out.println("the value of i is:"+i);

            try {
                Thread.sleep(0);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
         }

         this.notify();
        }

         
     }
}

class mythread1 extends Thread{
    public void run(){

        synchronized(this){

        for(int i=20;i>=0;i--){
           System.out.println("the value of i is: "+i   +"  ..............");

           try {
               Thread.sleep(0);
           } catch (Exception e) {
               // TODO: handle exception
               System.out.println(e);
           }
        }
        this.notify();
    }
    }
}

public class threadrunabble {
    public static void main(String[] args) {
        
        mythread t1=new mythread();
        Thread t=new Thread(t1);

        mythread1 t2=new mythread1();

    
            t.start();

            synchronized(t){
                try {
                    t.wait();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }


            t2.start();

            synchronized(t2){
                try {
                    t2.wait();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }

    }
}
