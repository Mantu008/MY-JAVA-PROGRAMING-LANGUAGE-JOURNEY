import java.util.LinkedList;
import java.util.Queue;

public class linklistusingqueue {
    public static void main(String[] args) {
        Queue<Integer> num=new LinkedList<>();
 
        //offer function is use to add element in linklist 
        num.offer(10);
        num.offer(16);
        num.offer(78);

        System.out.println(num);
        System.out.println(num.peek()); // peak function is use to see which element is next 
         num.poll();                     //poll is use to remove and print element 
        System.out.println(num);
       

        
        System.out.println(num.peek());
        num.poll();
        System.out.println(num);
       







        }
}
