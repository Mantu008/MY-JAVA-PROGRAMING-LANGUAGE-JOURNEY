import java.util.ArrayList;

public class arraylist {
public static void main(String[] args) {
    
    ArrayList<Integer> a=new ArrayList<>();

    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(5);

    System.out.println(a);


    a.add(1, 10);

    System.out.println(a);

    a.set(1, 89);

    System.out.println(a);

}
}