class mythread extends Thread{
    public mythread(String name){
    super(name);
    }
    public void run(){
        int i=0;
        while(i<600){
        System.out.println("hey how are you:"+this.getName());
        i++;
        }
    }
}


public class thread_priority {
    public static void main(String[] args) {

        // Ready Queue: T1 T2 T3 T4 T5
        
        mythread t1= new mythread("mantu1");
        mythread t2= new mythread("mantu2");  
        mythread t3= new mythread("mantu3");        
        mythread t4= new mythread("mantu4");       
        mythread t5= new mythread("mantu5");


        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
         
        
      

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    
    
        
    

    }
}
