import java.util.Scanner;
public class q4p {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in); 
        System.out.print("enter your choice:");
        int choice=n.nextInt();

        switch(choice){

            case 1 ->System.out.println("monday");
            case 2 ->System.out.println("tuesday");
            case 3 ->System.out.println("wednesday");
            case 4 ->System.out.println("thrusday");
            case 5 ->System.out.println("friday");
            case 6 ->System.out.println("saturday");
            case 7 ->System.out.println("sunday");
        }
    }
    
}