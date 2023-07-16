import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.xml.transform.Source;

public class allopretion {
    public static void main(String[] args) throws Exception{
         
        //creat file

        File f=new File("C:\\Users\\mantu\\Desktop\\mn.txt");

        if(f.createNewFile()){
            System.out.println("file creat sucessufully");
        }else{
            System.out.println("file is alrady present........");
        }


        //file operationmethods

        System.out.println("file name is:"+f.getName());
        System.out.println("file location parth is:"+f.getAbsolutePath());
        System.out.println("file size is:"+f.length());
        System.out.println("fale can read:"+f.canWrite());
        System.out.println("fale can write:"+f.canRead());


        //write this file

        FileWriter f1=new FileWriter("C:\\Users\\mantu\\Desktop\\mn.txt");

        f1.write("i am b tech FIRst YEArStuDent");

        System.out.println("file wrote sucessfully..............");
        
       f1.close();



        //read this file 

        FileReader f2=new FileReader("C:\\Users\\mantu\\Desktop\\mn.txt");
    
        int i;
        while((i=f2.read())>=0){
            System.out.print((char)i);
        }
        System.out.println(" ");

        System.out.println("file read sucefully....");

       f2.close();

       FileInputStream f3=new FileInputStream("C:\\Users\\mantu\\Desktop\\mn.txt");

       int size=f3.available();
       Scanner sc=new Scanner(f3);

       int count=0;

       while(sc.hasNext()){
          sc.next();
          count++;
       }
       System.out.println(size);
       System.out.println("the word count in this given file is :"+count);
       f3.close();


       System.out.println("....................................................");
       FileInputStream f4=new FileInputStream("C:\\Users\\mantu\\Desktop\\mn.txt");
        size=f4.available();
       
       for(int k=0;i<size;i++){
           char c=(char)f4.read();
            System.out.print(Character.toUpperCase(c)); 
       }

       System.out.println(" ");

       System.out.println("the size of the file is:"+size);

      

       f4.close();
       




    }
}
