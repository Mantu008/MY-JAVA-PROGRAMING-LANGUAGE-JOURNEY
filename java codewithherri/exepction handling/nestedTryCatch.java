import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {

        int[]  marks=new int[3];
        marks[0]=84;
        marks[1]=17;
        marks[2]=19;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array index:");
        int n=sc.nextInt();

        try {
            System.out.println("welcome to nested trycatch");

            try{
                System.out.println(marks[n]);
            }catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("sorry this index does not exist");
                  System.out.println("exepction in level 2");
            }
            
        } catch (Exception e) {
           System.out.println("exepction in level 1");
        }

    }
}
