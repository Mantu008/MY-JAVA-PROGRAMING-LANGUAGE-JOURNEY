
class student{
    int id;
    String name;
    String city;

    public student(){
        System.out.println("this is non-p constructor:");          //non paramaterize constructor...
    }

    public student(int id,String name,String city){
      System.out.println("this is p constructor:");               // constructor overloding......
      this.id=id;
      this.name=name;
      this.city=city;
    }
          

    public void printDetail(){
        System.out.println("my name is:"+name);                              //methood.....
        System.out.println("my id is:"+id);
        System.out.println("my city is:"+city);
    }



    public void printDetail(int id,String name,String city){                 //methood onverloding....
        System.out.println("my name is:"+name);
        System.out.println("my id is:"+id);
        System.out.println("my city is:"+city);
    }

}


public class classObject {
    public static void main(String[] args) {

        student std1=new student();
        std1.name="mantu";
        std1.city="gopalganj";
        std1.id=15;                                            // constructor with no argument
        std1.printDetail();

        System.out.println("");

        // student std2=new student();
        // std2.name="ashish";                             // constructor with no any argument
        // std2.city="siwan";
        // std2.id=17;
        // std2.printDetail();



        // student std2=new student(5,"hari","mujahapurpur");      // constructor overloding.......
        // std2.printDetail();

 
        student std2=new student();                              // method overloding
        std2.printDetail(45,"yuvraj","patna");  





        
    }

    
}