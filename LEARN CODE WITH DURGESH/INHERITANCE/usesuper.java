class a{

      a(){
          System.out.println(2*2);
      }

      public   void run(){
             System.out.println("method");
      }
}
class b extends a{


         b(){
            super();
            super.run();
         }


         public  void nj(){          
            super.run();
         }



}

public class usesuper {
    public static void main(String[] args) {
        
        b c=new b();        

        c.nj();


    }
}
