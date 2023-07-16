import java.io.*;
import java.util.*;

public class preacticle24p {
    public static void main(String s[])throws Exception {
        FileInputStream in=new FileInputStream("C:\\Users\\mantu\\Desktop\\abc.txt");
        Scanner sc=new Scanner(in);
        int size=in.available();
        int count=0;
       

        while(sc.hasNext()){
         sc.next();
         count++;
        }

        System.out.println("size of file:"+size+" byte");
        System.out.println("there are:"+count+" word in file");

        in.close();
       
    }
}
