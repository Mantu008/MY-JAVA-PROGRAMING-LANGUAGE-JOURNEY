class goes extends Thread{
    public goes(String name){
          super(name);
    }
        public void run(){
        System.out.println("this is user defind thread");
       }
}
public class go{
    public static void main(String[] args) {

        System.out.println("program started.....");
        int a=34+56;
        System.out.println("the value of a is:"+a);

        //running thread...

        Thread t=Thread.currentThread();
    
        //get thread name
        System.out.println("current running thread is:"+t.getName());
        

        // set thrtead name
          t.setName("mantu");
          System.out.println("changing thrade is:"+(t.getName()));       
          System.out.println("id of current thread is:"+(t.getId()));

        //   try {
        //     Thread.sleep(2000);
        //   } catch (Exception e) {
           
        //   };

          // going to start user difine thread

          System.out.println("");

            goes g=new goes("mantu");

            g.start();

            System.out.println("the id of user defined thread is:"+g.getId());
            System.out.println("the name of user defined thread is:"+g.getName());          //here thread name is not defined...
            g.setName("ashish");                                                       // here set the thred name
            System.out.println("the changed name of user defined thread is:"+g.getName());

       

        System.out.println("program ended.........");

    }

    
}