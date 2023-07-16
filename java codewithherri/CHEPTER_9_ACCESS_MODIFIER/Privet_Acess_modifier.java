class MyEmployee{
   
   private int id;
   private String name;
    
   public String getName(){
    return name;
   }
   public void setName(String n){
        name=n;
   }
   public int getId(){
    return id;
   }
   public void setId(int i){
       id=i;
   }

}
public class Privet_Acess_modifier {
    public static void main(String[] args) {
        MyEmployee mantu=new MyEmployee();

        mantu.setName("mantu kumar");
        mantu.setId(78);

        System.out.println("Name of employee is:"+mantu.getName());
        System.out.println("Id of employee is:"+mantu.getId());
    }
}
