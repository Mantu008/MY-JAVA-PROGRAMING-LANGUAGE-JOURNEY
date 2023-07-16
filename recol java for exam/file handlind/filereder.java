import java.io.FileReader;

public class filereder {
    public static void main(String[] args) throws Exception{
        FileReader f=new FileReader("C:\\Users\\mantu\\Desktop\\mn.txt");
    
        int i;
        while((i=f.read())>=0){
            System.out.print((char)i);
        }
        System.out.println(" ");

        System.out.println("file read sucefully....");
    }
}
