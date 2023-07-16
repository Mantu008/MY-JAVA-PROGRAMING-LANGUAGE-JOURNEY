
class animal{
     public String x;
      
     public String getFoodtype(){
        return x;
     }
     public void setFoodtype(String x){
       this.x=x;
     }
    }
class dog extends animal{
       public String y;

       public String getInstriction(){
        return y;
       }
       public void setInstriction(String y){
            this.y=y;
       }
}
public class qq1 {
    public static void main(String[] args) {
        
        animal a=new animal();
        a.setFoodtype("today food type is:chicken");
    
        System.out.println(a.getFoodtype());
        
        dog d=new dog();
        d.setInstriction("todsy instruction is:barking");
        System.out.println(d.getInstriction());
  
    

    }
}
