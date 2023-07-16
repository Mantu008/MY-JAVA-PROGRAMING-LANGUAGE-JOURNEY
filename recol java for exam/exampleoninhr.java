class a{

   public void show(){
     System.out.println("i am mantu...........");
    }
   
}

class b extends a{
     public void  show2(){
          System.out.println("hey how are you at that time.....");
        } 
}

class c extends b{
      public void show3(){
         System.out.println("hey it is good day..............");
      }
}


public class exampleoninhr {
    public static void main(String[] args) {
      
     a man=new a();

     man.show();

     b man1=new b();
     man1.show2();
     man1.show();

     c man2=new c();

     man2.show2();
     man2.show();
     man2.show3();
     
        
    }
}
