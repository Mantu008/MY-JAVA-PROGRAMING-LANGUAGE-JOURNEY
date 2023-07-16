import java.util.ArrayDeque;

public class arraydec {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(45);
        adq.offerLast(87);
        adq.offer(99);
        adq.offerFirst(17);
        
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        adq.pollFirst();
        System.out.println(adq);
        System.out.println(adq.peekLast());
        adq.pollLast();
        System.out.println(adq);
    }   
}
