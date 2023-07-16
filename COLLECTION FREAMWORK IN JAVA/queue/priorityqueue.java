import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {

        // by default it is use for min term comprator..............

        Queue<Integer> pq=new PriorityQueue<>();
        pq.offer(78);
        pq.offer(67);
        pq.offer(87);
    

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();   
        System.out.println(pq);

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);

     System.out.println("____________________________________");

        // it is use for max term comprator............

        Queue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(34);
        pq1.offer(12);
        pq1.offer(676);

        System.out.println(pq1);
        System.out.println(pq1.peek());
        pq1.poll();   
        System.out.println(pq1);

        System.out.println(pq1.peek());
        pq1.poll();
        System.out.println(pq1);


    }
}
