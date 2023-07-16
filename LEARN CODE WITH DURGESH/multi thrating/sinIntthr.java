
class company{
    int n;
    boolean f=false;
    synchronized public void produceitem(int n){
        if(f){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.n=n;
      System.out.println("priduced:"+this.n);
      f=true;
      notify();

    }
    
    synchronized public void consumeitem(int n){
        if(!f){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("consumed:"+this.n);
        f=false;
        notify();
         
      
    }
}



class producer extends Thread{

    company c;
    producer(company c){
        this.c=c;
    }
    
    public void run(){
        int i=1;
         while(i<10){
            this.c.produceitem(i);
            try {
                 Thread.sleep(1000);
            } catch (Exception e) {
               
            }
            i++;
            
         }
    }
}



class consumer extends Thread{

    company c;

    consumer(company c){
       this.c=c;
    }


    public void run(){
        int i=1;
        while(i<10){
            this.c.consumeitem(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
               
            }
            i++;
        }
    }
}



public class sinIntthr {
    public static void main(String[] args) {


        company comp=new company();

        producer p=new producer(comp);

        consumer c=new consumer(comp);

        p.start();
        c.start();

         
    }
}
