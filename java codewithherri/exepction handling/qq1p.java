import java.util.Scanner;
public class qq1p {
    public static void main(String[] args) {

        int[]  marks=new int[5];
        marks[0]=84;
        marks[1]=17;
        marks[2]=19;
        marks[3]=55;
        marks[4]=67;

        System.out.println("started program....");
        boolean b=true;

        Scanner sc= new Scanner(System.in);
        while(b){
           System.out.print("enter array index:");
           int n=sc.nextInt();   
           try {
            System.out.println(marks[n]);
            b=false;
           } catch (Exception e) {
              System.out.println("exepction occure..");
              System.out.println("exepction is:"+e.getMessage());
           }
        }    
        
        System.out.println("ending program.......");
        
    }
}
