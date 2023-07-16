class mythread extends Thread{
    public void run(){
        // int i=0;
        while(true){
        System.out.println("hey how are you");
        // i++;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}

class mythread2 extends Thread{
    public void run(){
        // int i=0;
        while(true){
        System.out.println("thank you");
        // i++;
        }
    }
}

public class thread_method {
    public static void main(String[] args) {
        
        mythread t1= new mythread();
        mythread2 t2=new mythread2();
        t1.start();
        //  try{
        //     t1.join();
        //  }catch(Exception e){
        //     System.out.println(e);
        //  }
    
        t2.start();
    }
}
