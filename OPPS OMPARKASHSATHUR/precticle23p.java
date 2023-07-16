import java.io.*;
public class precticle23p {
    public static void main(String s[])throws Exception {
        FileInputStream in=new FileInputStream("C:\\Users\\mantu\\Desktop\\abc.txt");
        int size=in.available();
        System.out.println("file size is:"+size);
        int i;
        char c;

        for(i=0;i<size;i++){
            c=(char)in.read();
            System.out.print(Character.toLowerCase(c));
        }
        in.close();
       
    }
}
