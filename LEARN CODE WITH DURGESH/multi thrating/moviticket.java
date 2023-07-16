class app{
    int totalseet=10; 
   synchronized public void bookseat(int sheat){
        if(totalseet>=sheat){
        System.out.println("ticketbook sucessfully......");
        totalseet=totalseet-sheat;
        System.out.println("total remaning seat is:"+totalseet);
        }else{
            System.out.println("ticket not book because ticket not inouguht left...");
            System.out.println("total remaning seat is:"+totalseet);
        }
    }
      
}

 class moviticket extends Thread{
    static app b;
    int sheat;
     public void run(){ 
        synchronized(this){
        b.bookseat(sheat);
        this.notify();
        }
    }
   
public static void main(String[] args) {

     b=new app();
    
     moviticket mantu=new moviticket();
     synchronized(mantu){
     mantu.sheat=3;
     mantu.start();
     try {
        mantu.wait();
     } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
     }
     }
      
     moviticket ashish=new moviticket();    
     synchronized(ashish){
     ashish.sheat=5;
     ashish.start();
       try {
        ashish.wait();
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
       }
    } 

   
  moviticket yuvraj=new moviticket();
   synchronized(yuvraj){
   yuvraj.sheat=6;
   yuvraj.start();
   try {
    yuvraj.wait();
   } catch (Exception e) {
    // TODO: handle exception
    System.out.println(e);
   }
}


moviticket anish=new moviticket();    
synchronized(anish){
anish.sheat=2;
anish.start();
  try {
   anish.wait();
  } catch (Exception e) {
   // TODO: handle exception
   System.out.println(e);
  }
}   

    
     
}

}
