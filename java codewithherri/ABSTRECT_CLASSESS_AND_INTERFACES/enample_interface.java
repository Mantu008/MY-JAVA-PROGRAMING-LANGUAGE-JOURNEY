

interface camera{
     void takesnap();
     void recordvideo();

     private void great(){
        System.out.println("good morning");
     }
     default void record4ksnap(){
        great();
        System.out.println("recording in 4k");
    }
}

interface wify{
      String [] getnetworks();
      void connectnetwork(String network);
}


class callphon{
    void callnumber(int phonnumber){
        System.out.println("calling:--"+phonnumber);
    }
    void pickcall(){
             System.out.println("connecting...the call....");
    }
}


class smartphone extends callphon implements  camera,wify{
    public void takesnap(){
        System.out.println("taking snap:----");
    }
    public void recordvideo(){
        System.out.println("recording video:----");
    }
    // public void record4ksnap(){
    //     System.out.println("recording in 4k snap");
    // }
    public String [] getnetworks(){
        System.out.println("gatting list of networks:");
        String [] networklist={"mantu4G","ashish676","niteshI#$%"};
        return networklist;
    }
    public void connectnetwork(String network){
        System.out.println("connecting to"+network);
    }



}
public class enample_interface {
    public static void main(String[] args) {
        smartphone ms=new smartphone();

        ms.record4ksnap();

        String[] ar=ms.getnetworks();
        for(String item:ar){
            System.out.println(item);
        }

       // ms.great();          // throws an error because it is private
    }
}
