class  ticketbookapp extends Thread{
    public void run(){

        while(true)
        {
               System.out.println("good morning.....");
               System.out.println("welcome....");
               try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
        }
        
        
    

    }
}
public class q1p {
    public static void main(String[] args) {

       ticketbookapp t=new ticketbookapp();
        t.start();  
        }  
    }

