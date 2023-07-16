import java.util.Scanner;
public class q3p {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.print("ENTER YOUR INCOME:");
        float income=n.nextFloat();
        float tax=0f;
        
        if(income<2.5f)
        {
           tax=tax+0;
        }
        else if(income>=2.5f && income<5.0f)
        {
               tax= tax + 0.05f*(income-2.5f);
        }
        else if(income>=5.0f && income<10.0f){
            tax= tax + 0.05f*(5.0f-2.5f);
            tax= tax + 0.20f*(income-5.0f);
        }
        else if (income>10.0f){
            tax= tax + 0.05f*(5.0f-2.5f);
            tax= tax + 0.20f*(10.0f-5.0f);
            tax= tax +0.30f*(income-10.0f);
        }
        
        System.out.println("your tax is:");
        System.out.println(tax);
    }
}
