import java.lang.reflect.WildcardType;
import java.util.*;

import javax.sound.sampled.SourceDataLine;;
public class travers {
    public static void main(String[] args) {

        ArrayList<String>name=new ArrayList<>();     //we cannot asign diff type of variable only assign sam as declare

   /* order preserved
      indexed collection 
      dublicate are allowed
    */

     name.add("mantu");
     name.add("hari");
    // name.add(676);                           //it is throw a eror because variable is different
     name.add("ashish");
     name.add("neha");
     name.add("vikram");
     name.add("ABC");

     //1.use for-eachloop for travers
     
     for(String e:name){
        System.out.print(e +"\t"+e.length()+"\t");
        StringBuffer br=new StringBuffer(e);
        System.out.println(br.reverse());
     }


     System.out.println("_________________________________________________");


     //2.traversing using ittractor


     //forword treversing

     Iterator<String>itr=name.iterator();

     while(itr.hasNext()){
        String next=itr.next();
        System.out.println(next);
     }


     System.out.println("__________________________________________");


     //backword treversing
     ListIterator<String> itr2=name.listIterator(name.size());
      
     while(itr2.hasPrevious()){
        String previous=itr2.previous();
        System.out.println(previous);
     }

     System.out.println("________________________________________________");


     // 4.traversing using for each-mathod()...

     name.forEach(e->{
      
      System.out.println(e);

     });


     System.out.println("_____________________________________________");


     // 5.traversing using enumration...

      // Vector v=new Vector<>();
      // v.add(name);
      // System.out.println(v);
      // Enumeration e=v.elements();
      // while(e.hasMoreElements()){
      // String st=(String)e.nextElement();
      // System.out.println(st);
      // }
      // System.out.println(v);




     System.out.println("__________________________________________________");

     // sorting element using treeset

     System.out.println("sorting of element...........");
     TreeSet<String> str=new TreeSet<>();
     str.addAll(name);
     str.forEach(m->{
           System.out.println(m);
     });





    }
}
