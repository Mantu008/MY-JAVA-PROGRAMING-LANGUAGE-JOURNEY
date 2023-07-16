import java.io.*;
public class write {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter("abcd.txt");
            f.write("marwadi university");
            f.close();
            System.out.println("file is update sucessfully");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
