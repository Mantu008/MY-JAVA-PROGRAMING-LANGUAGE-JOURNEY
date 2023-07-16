public class var_args {
    static int sum(int...arr){
        int result=0;
        for(int a:arr){
            result +=a;
        }
        return result;
        
    }
    public static void main(String[] args) {
        System.out.println("the addition of 4 and 5 is=" +sum(4,5));
        System.out.println("the addition of 4 and 5 is=" +sum(4,5,6));
        System.out.println("the addition of 4 and 5 is=" +sum(4,5,6,7));
        System.out.println("the addition of 4 and 5 is=" +sum(4,5,6,7,8));
        System.out.println("the addition of 4 and 5 is=" +sum(4,5,6,7,8,9));

    }
}
