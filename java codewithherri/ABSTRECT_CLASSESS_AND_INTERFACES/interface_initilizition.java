interface bycycle{
     
    int a=56;
      
        void applybrake(int decriment);
        void speedup(int incriment);
}

interface ring{
    void ringconstant();
    void ringonce();
}


class Avoncycle implements bycycle,ring{
           
   public void applybrake(int decriment){
        System.out.println("apply brake");
    }
   public void speedup(int incriment){
        System.out.println("apply speedup");
    }

    public void blowhorn(){
             System.out.println("piiiiiiiiiiii");
    }

    public void ringconstant(){
        System.out.println("trin..trin..trin..trin");
    }
    public void ringonce(){
        System.out.println("trin..trin");
    }

}


public class interface_initilizition {

    public static void main(String[] args) {
        Avoncycle cyclemantu=new Avoncycle();

        cyclemantu.applybrake(7);
        cyclemantu.speedup(56);
        // we can creat properties in interfaces
        System.out.println("the value of a is:"+cyclemantu.a);

        //we cannot modify the properties in interfaces as they are final
      //  cyclemantu.a=34;

      cyclemantu.ringconstant();
      cyclemantu.ringonce();
        
    }
}