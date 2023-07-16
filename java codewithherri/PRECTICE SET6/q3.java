
public class q3 {
   public static void main(String[] args) {
    
        int [] phymarks={56,78,98,87,45,67};
        int sum=0;
        for(int element:phymarks){
            sum=sum+element;
        }
                 
           int avg=sum/(phymarks.length);
            
        System.out.print("the sum of totel student number:");
        System.out.println(sum);

        System.out.print("the avg of totel student number:");
        System.out.println(avg);
  } 
}
