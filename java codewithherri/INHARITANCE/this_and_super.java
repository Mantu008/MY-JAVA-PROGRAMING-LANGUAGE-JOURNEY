
class ekclass{
    int a;
    public int getA(){
        return a;
    }
    ekclass(int a){                     //constructor
        this.a=a; 
    }
    public int returnone(){               //method
        return 1;
    }
}
 class doclass extends ekclass{
       
        doclass(int c){
            super(c);
            System.out.println("i am a constructor");
        }

        public void name(){
            System.out.println("my name is mantu");
        }

 }

  
public class this_and_super {
    public static void main(String[] args) {
        ekclass e=new ekclass(5);
        System.out.println("the value of a is:"+e.getA());
        System.out.println("the returning value of methood is:"+e.returnone());

        doclass d=new doclass(67);
        System.out.println("the value of a is:"+d.getA());
        System.out.println("the returning value of methood is:"+d.returnone());
         d.name();

    }
}
