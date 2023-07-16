import javax.swing.text.Utilities;

interface camera{
    void takesnap();
    void recordvideo();

}

interface wify{
     String [] getnetworks();
     void connectnetwork(String network);
}


class callphon{
   void callnumber(){
       System.out.println("calling:--9649486218");
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
        System.out.println("connecting to:"+network);
    }



}

public class polimorphisim_interfaces {
public static void main(String[] args) {
    
    System.out.println("smartphone work as a camara");
    camera c=new smartphone();      //this is a smartphone but,use it only as a camara: 
    c.takesnap();
    c.recordvideo();
    System.out.println();

     System.out.println("smartphone work as a wify");    
    wify w=new smartphone();            //this is smartphone but use it only as a wify
    String[] ar=w.getnetworks();
    for(String item:ar){
        System.out.println(item);
    }
    w.connectnetwork("mantu4G");
    System.out.println();


    System.out.println("smartphone work as a (camara+wify+callphone) together");
    smartphone s= new smartphone();
    s.takesnap();
    s.recordvideo();
    String[] arr=s.getnetworks();
    for(String item:arr){
        System.out.println(item);
    }
    s.connectnetwork("ashish676");
    s.pickcall();
    s.callnumber();

    

}
}