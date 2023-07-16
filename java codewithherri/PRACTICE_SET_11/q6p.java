interface TvRemote{
           void OnTv();
           void OffTv();
}

 interface SmartTvRemote extends TvRemote{
            void OnAc();
            void ONfan();
 }

  class Tv implements TvRemote{
       public void OnTv(){
            System.out.println("on the tv......");
        }
       public void OffTv(){
            System.out.println("off the tv.....");
        }
  }
  
public class q6p {
    public static void main(String[] args) {
        Tv t= new Tv();
        t.OffTv();
        t.OnTv();
   //   t.ONfan();                        //     this is illigal
        
    }
}
