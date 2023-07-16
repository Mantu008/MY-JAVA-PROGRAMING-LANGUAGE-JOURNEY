public class storing_marks_of_5_subject {
public static void main(String[] args) {
        
         int [] marks=new int [5];           //(declaration+memoryallocation)        //first way to  define array:

        //  int[] marks;                    //  declare                             //  second way to define array:
        //  marks=new int[5];               //memory allocation

         marks[0]=100;                      //initialization:
         marks[1]=60;
         marks[2]=70;
         marks[3]=66;
         marks[4]=79;
  //     marks[6]=89;     //  Through error because length of array is 5:


        // int [] marks={100,60,70,66,79};   // third way to declare  string:(declare+memoryallocation+initialige):

     System.out.println(marks[4]);

}
    
}