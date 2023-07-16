class mythread1 extends Thread{
    public void run(){
      int i=0;
      while(i<400) {
        System.out.println("i am cocking now....");
        System.out.println("i am sad");
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
        }
        i++;
       }
    }
}

class mythread2 extends Thread{
    public void run(){
      int i=0;
      while(i<400) {
        System.out.println("i am reading now....");
        System.out.println("i am happy");
        i++;
       }
    }
}
public class initilize_multithrating_by_extending_threat_class {
public static void main(String[] args) {
   
    mythread1 t1=new mythread1();
    mythread2 t2=new mythread2();

    t1.start();;
    t2.start();
    
}
}