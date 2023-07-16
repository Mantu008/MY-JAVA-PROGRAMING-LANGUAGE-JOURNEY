public class q6p {
    static int add(int...arr){
        int result=0;
        for(int e:arr){
            result +=e;
        }
        int avg=result/arr.length;
         return avg;    
    }
    public static void main(String[] args) {
        System.out.println("the avg of 2,3 and 5 is="+add(2,3,5));
    }
}
