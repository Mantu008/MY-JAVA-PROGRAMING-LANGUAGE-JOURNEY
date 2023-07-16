
public class q6 {
    public static void main(String[] args) {
         int[] arr={1,2,-3,45,-77,878};
         int max=Integer.MIN_VALUE;
         for(int element:arr){
            if(element>max){     
                max=element;
            }
         }
         System.out.println("the max element of this array="+max);
    }
}
