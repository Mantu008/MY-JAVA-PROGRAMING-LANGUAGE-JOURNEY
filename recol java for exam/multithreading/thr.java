class th1 extends Thread{
    int i=0;
    String s;

    th1(String s){
        this.s=s;
    }

    public void  run(){
        while(i<200){
            System.out.println(i+"  "+s);
            i++;
        }
      }
}


public class thr {
    public static void main(String[] args) {
        th1 t1=new th1("mantu");
        th1 t2=new th1("hari");
        th1 t3=new th1("ashish");
        t1.start();
        t2.start();
        t3.start();

         t1.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);
         t3.setPriority(Thread.MIN_PRIORITY);

    }
}
