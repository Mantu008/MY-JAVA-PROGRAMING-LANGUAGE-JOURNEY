
public class q7 {
   public static void main(String[] args) {
      int[] arr={1,2,3,-5,-55,-88,7};
      int min=Integer.MAX_VALUE;
      for(int element:arr){
        if(element<min){
            min=element;
        }
      }
      System.out.println("the minimum value in this array is="+min);

   } 
}
