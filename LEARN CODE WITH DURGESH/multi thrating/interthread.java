class  ticketbookapp extends Thread{
    int total=0;

    public void run(){

        synchronized(this){

        for(int i=1;i<=10;i++){
            total+=100;
        }
        this.notify();
    }

    }
}
public class interthread {
    public static void main(String[] args) {

       ticketbookapp t=new ticketbookapp();
        t.start();

        synchronized(t){
            try {
                t.wait();
            } catch (Exception e) {
            }
            System.out.println("total collection is:"+t.total+" rs");
        
        }
       
    }
}
