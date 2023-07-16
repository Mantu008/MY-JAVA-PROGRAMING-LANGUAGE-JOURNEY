import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionclass {
     public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(56);
        num.add(75);
        num.add(45);
        num.add(13);
        num.add(17);
        num.add(98);

        System.out.println(num);

         //find min tearm
        System.out.println("min element:"+ Collections.min(num));

        //find max tearm
        System.out.println("max element:"+ Collections.max(num));

        //sorted arraylist in forword......

        Collections.sort(num);
        System.out.println(num);

        //sorted arraylist in reverce......

        Collections.sort(num,Comparator.reverseOrder());
        System.out.println(num);


     
        


     }
}
