class mythreadrunnable1 implements Runnable{
     public void run(){
        int i=0;
        while(i<300){
        System.out.println("i   coocking food now......");
        i++;
        }
     }
}


class mythreadrunnable2 implements Runnable{


    public void run(){
        int i=0;
        while (i<300) {
            System.out.println("i am reading now......");
            i++;
        } 
    }

}
public class initilize_threat_by_implamant_runnable_interface {
public static void main(String[] args) {
    

    mythreadrunnable1 bullet1=new mythreadrunnable1();
    Thread gun1=new Thread(bullet1);
    mythreadrunnable2 bullet2=new mythreadrunnable2();
    Thread gun2=new Thread(bullet2);

    gun1.start();
    gun2.start();


}
    
}