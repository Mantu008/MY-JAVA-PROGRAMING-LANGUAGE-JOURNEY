import java.io.File;

public class fileinfo {
    public static void main(String[] args) throws Exception{
        File f=new File("C:\\Users\\mantu\\Desktop\\mn.txt"); 

       if(f.exists()){
            System.out.println("the file name is:"+f.getName());
            System.out.println("file location is:"+f.getAbsolutePath());
            System.out.println("can we write this file:"+f.canWrite());
            System.out.println("can read this file:"+f.canRead());
            System.out.println("size of the file is:"+f.length());
            System.out.println("file delit:"+f.delete());
       }else{
               System.out.println("file doesnot exist..");
       }
    }
}
