import java.util.*;
public class linkedhasset {
    public static void main(String[] args) {
        //in linkedhasset duplicate are not allowed but  index is preserve
        Set<Integer> num=new LinkedHashSet<>();
        num.add(17);    //add function is use to add element in set..
        num.add(78);
        num.add(56);
        num.add(45);
        num.add(2);
        num.add(56);       //duplicate are not allowed

        System.out.println(num);

       //for remove element from set

        num.remove(2);     
        System.out.println(num);

        //for avaliblity
        System.out.println("element avalivality is:"+num.contains(45));
        System.out.println("element avalivality is:"+num.contains(35));

        // for empty status
        System.out.println("empty status:"+num.isEmpty());

        //for size of set
        System.out.println("size of set is:"+num.size());

        // for clear all element of set   
        num.clear();
        System.out.println(num);

    }
}
