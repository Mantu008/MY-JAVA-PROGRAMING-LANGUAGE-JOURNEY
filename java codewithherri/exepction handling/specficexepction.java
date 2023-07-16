import java.util.Scanner;

public class specficexepction {
    public static void main(String[] args) {
        int[]  marks=new int[3];
        marks[0]=84;
        marks[1]=17;
        marks[2]=19;

        Scanner sc=new Scanner(System.in);
        System.out.print("enter array index:");
        int ind=sc.nextInt();

        System.out.print("enter num:");
        int num=sc.nextInt();

        try {
            System.out.println("the value at array index enterd by you is:"+marks[ind]);
            System.out.println("the value of array-valu/number is:"+marks[ind]/num);
        } catch (ArithmeticException e) {
           System.out.println("ArithmeticException occure");
           System.out.println("exepction is:"+e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException exepction occur");
            System.out.println("exepction is:"+e.getMessage());
         }catch (Exception e) {
            System.out.println("some exepction occur");
            System.out.println("exepction is: "+e.getMessage());
         }
    }
}
