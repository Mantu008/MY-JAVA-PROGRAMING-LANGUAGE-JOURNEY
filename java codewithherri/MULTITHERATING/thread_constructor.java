

class mythread extends Thread{
    public mythread(String name){
    super(name);
    }
    public void run(){
        System.out.println("hey mantu how are you");
    }
}

class mythreadrunnable implements Runnable{
    public mythreadrunnable(){
         System.out.println("i am good.......");
    }
    public void run(){
       System.out.println("i am coocking food now......");
    }
}
public class thread_constructor {
    public static void main(String[] args) {
         

        mythread t1=new mythread("mantu");
        t1.start();
        System.out.println("the id of mythread is:"+ t1.getId());
        System.out.println("the name of thread is:"+t1.getName());

        System.out.println();

        mythread t2=new mythread("ashish");
        t2.start();
        System.out.println("the id of mythread is:"+ t2.getId());
        System.out.println("the name of thread is:"+t2.getName());

        System.out.println();

        mythreadrunnable r=new mythreadrunnable();
        Thread t3= new Thread(r,"raju");
        t3.start();
        System.out.println("the id of mythreadrunnable is:"+t3.getId());
        System.out.println("the name of mythreadrunnable is:"+t3.getName());

        System.out.println("");



        mythreadrunnable r2=new mythreadrunnable();
        Thread t4= new Thread(r2,"ashu");
        t4.start();
        System.out.println("the id of mythreadrunnable is:"+t4.getId());
        System.out.println("the name of mythreadrunnable is:"+t4.getName());

    }
}
