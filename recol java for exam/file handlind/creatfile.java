import java.io.File;
import java.io.IOException;

public class creatfile {
    public static void main(String[] args) throws Exception {
        File f=new File("C:\\Users\\mantu\\Desktop\\mn.txt");

        if(f.createNewFile()){
            System.out.println("file creat sucessfully"); 
        }else{
            System.out.println("file is alrady exist...");
        }
    }
}
