
public class q2p {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int num=17;
        boolean isanarray=false;
           for(int element:arr){     
            if(num==element){
                isanarray=true;
                break;
            }
    }
             if(isanarray){
                System.out.println("this value is present in array");
             }else{
                System.out.println("this value is not present in array");
             }

  }
}
