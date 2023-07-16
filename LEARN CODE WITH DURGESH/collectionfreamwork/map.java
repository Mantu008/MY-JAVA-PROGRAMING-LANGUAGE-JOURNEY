import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String,Integer> student= new HashMap<>();

    // adding element...........

    student.put("mantu", 3001);
    student.put("ashish", 3016);
    student.put("nidhi", 3005);
    student.put("hari", 3096);

    System.out.println(student);

// treversing element using for-each.....

    student.forEach((key,value)->{
       System.out.println(key+"->"+value);
    });


// check element value......

System.out.println(student.get("mantu"));
    






    }
}
