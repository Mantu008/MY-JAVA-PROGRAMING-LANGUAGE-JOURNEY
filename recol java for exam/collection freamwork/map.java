import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> m=new TreeMap<>();

        m.put(4, "hari");
        m.put(6, "mantu");
        m.put(1,"ashish");
        m.put(2,"nidhi");

        System.out.println(m);

        System.out.println(m.get(4));
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.remove(2));

        System.out.println(m);

        m.put(1, "anuj");

        System.out.println(m);

        m.clear();
        System.out.println(m);
    }
}
