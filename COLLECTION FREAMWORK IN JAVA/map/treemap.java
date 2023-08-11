
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {

        Map<String,Integer> student=new TreeMap<>();

        student.put("mantu", 1);
        student.put("ashish", 14);
        student.put("hari", 16);
        student.put("bikash", 787);

        System.out.println(student);
        
        //treversing one by one element using foreach method.........

        student.forEach((name,roll)->{
            System.out.println(name+"->"+roll);
        });

        System.out.println("_______________________________________");

        student.putIfAbsent("mantu", 123);    //these value is put if keysvalus are different
        
        System.out.println("_________________________________________");
        
        //traversing only keys one by one.........
      for(String key:student.keySet()){
        System.out.println(key);
      }

      System.out.println("_________________________________________");

      //traversing only  values one by one.........
      for(Integer value:student.values()){
        System.out.println(value);
      }

      System.out.println("_________________________________________");
       
     // get value from key refrence..........

      System.out.println(student.get("ashish"));
      System.out.println(student.get("mantu"));

      System.out.println("_________________________________________");
      
      // check value is present or not in map
      System.out.println(student.containsValue(5));
      System.out.println(student.containsKey("nidhi"));
      System.out.println(student.containsValue(1));

      System.out.println("_________________________________________");
        
      //remove student.............

      student.remove("hari");
      System.out.println(student);

      System.out.println("_________________________________________");


      
    }
}
