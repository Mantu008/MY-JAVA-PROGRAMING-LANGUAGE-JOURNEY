
public class relational_opretor_in_decision_making_statment {
public static void main(String[] args) {
    System.out.println("FOR LOGICAL AND");
    boolean a=true;
    boolean b=false;
   
    if(a && b)
    {
        System.out.println("T");
    }else{
        System.out.println("N");
    }


      System.out.println("FOR LOGICAL OR");

      if(a || b){
        System.out.println("Y");
      }else{
        System.out.println("N");
      }


      System.out.println("FOR LOGICAL NOT");
      
      System.out.print("NOT A IS:");
      System.out.println(!a);
      System.out.print("FOR NOT B:");
      System.out.println(!b);


}
    
}