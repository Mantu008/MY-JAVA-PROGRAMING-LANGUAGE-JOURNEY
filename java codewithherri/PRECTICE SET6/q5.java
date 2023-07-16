
public class q5 {
    public static void main(String[] args) {
        // int [] arr={1,2,3,4,5,6,7,8,9,10};         //1st methood
        // for(int i=(arr.length-1);i>=0;i--){
        //     System.out.print(arr[i]);
        //     System.out.print(" ");
        // }

        int [] arr={1,2,3,4,5,6};        // 2nd methood
        int l=arr.length;
        int n=Math.floorDiv(l, 2);
        int temp;
        for(int i=0;i<n;i++){

            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
