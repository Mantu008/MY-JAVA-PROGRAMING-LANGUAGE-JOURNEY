class totalearning extends Thread{
     int total=0;
     public void run(){
        synchronized(this){
        for(int i=0;i<12;i++){
            total=total+100;
        }
        this.notifyAll();
     }
}
}
public class ticketbookingapp {
    public static void main(String[] args) {
            totalearning t1=new totalearning();
            
            t1.start();

            synchronized(t1){
                try {
                     t1.wait();
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }

            System.out.println("total earning collection is:"+t1.total);
    }
}
