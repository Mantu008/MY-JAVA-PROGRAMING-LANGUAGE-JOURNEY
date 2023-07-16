class a extends Thread{
        int amount=0;
        public void run(){
            synchronized(this){
                for(int i=0;i<10;i++){
                    amount+=200;
                }
                notify();
            }
    }    
}
public class intrrhr {
    public static void main(String[] args) {
          a a1=new a();
          a1.start();
     synchronized(a1){
          try {
            a1.wait();
            a1.setPriority(1);
          } catch (Exception e) {
            // TODO: handle exception
          }   
        }
        System.out.println("the final collection is:"+a1.amount);
    }
}
