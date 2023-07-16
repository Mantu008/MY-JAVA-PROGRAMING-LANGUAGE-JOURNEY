import java.io.File;
import java.io.FileWriter;

public class write {
    public static void main(String[] args) throws Exception {
        FileWriter f=new FileWriter("C:\\Users\\mantu\\Desktop\\mn.txt"); 

        f.write("i am mantu kumar maurya");

        f.close();

        System.out.println("sucessfully wrote data in file");
    }
}
