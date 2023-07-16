
class a{
    void show(){
       System.out.println("mantu");
    }
}
class b extends a{
    
      void show(){
          System.out.println("hari");
       }
}

public class methodoverriding{
    public static void main(String[] args) {

       a x=new a();
       
       x.show();

       b y=new b();
       y.show();
        
    }
}
