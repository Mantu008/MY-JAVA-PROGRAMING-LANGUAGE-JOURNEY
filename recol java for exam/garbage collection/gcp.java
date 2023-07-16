
import java.util.*;
public class gcp {

    public String name;
    public int age;
    public String address;


        gcp(String name,int age,String address){
          this.name=name;
          this.age=age;
          this.address=address;
      } 

      protected void finalize(){
            System.out.println("object has been distroid.........");
      }
    
    
    public static void main(String[] args) {
        gcp p1=new gcp("mantu",21,"gopalganj");
        System.out.println("before distroing object first student detail is:"+p1.name+" "+p1.age+" "+p1.address);
        p1=null;
        System.gc();




        gcp p2=new gcp("hari",27,"siwan");
        System.out.println("before distroing object second student detail is:"+p2.name+" "+p2.age+" "+p2.address);
        p2=null;
        System.gc();
    }
}
