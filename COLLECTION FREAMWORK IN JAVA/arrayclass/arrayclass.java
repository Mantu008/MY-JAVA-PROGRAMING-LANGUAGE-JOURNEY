import java.util.Arrays;

public class arrayclass {
    public static void main(String[] args) {

        int[] n={1,2,3,4,5,6,7,8,9,12,14,16,20};
        System.out.println("the index of element 3 in the arrayis:"+Arrays.binarySearch(n,3));
        System.out.println("the index of element 3 in the arrayis:"+Arrays.binarySearch(n,14));
       
        System.out.println("________________________________________");
        
        int[] num={9,5,7,6,3,4,1,2,8,15,11,87,45,35};
        Arrays.sort(num);

        for(int i:num){
            System.out.print(i+" ");
        }
        System.out.println("");

        System.out.println("___________________________________");

         Arrays.fill(num, 6);
         for(int i:num){
            System.out.print(i+" ");
        }
        System.out.println("");
      
    }
}
