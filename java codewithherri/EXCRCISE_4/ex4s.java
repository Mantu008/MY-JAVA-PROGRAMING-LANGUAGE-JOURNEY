
class Libarary{

    String [] books;
    int no_of_books;
    Libarary(){
        this.books=new String[100];
        this.no_of_books=0;
    }


    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+ "has been added!");
    }
    
    
    void showAvaliablebooks(){
      System.out.println("avaliable books are:");
      for(String book:this.books){
        if(book==null){
           continue;
        }
        System.out.println("*"+book);
      }
    }

   void issuebook(String book){
        for(int i=0;i<this.books.length;i++){
          if(this.books[i].equals(book)){
            System.out.println("this book has been issued sucessfully!");
            this.books[i]=null;
            return;
          }
        } 
          System.out.println("this book is not exist in libariry!");
   }


   
   void returnbook(String book){
             addbook(book);             
   }



}
public class ex4s {
  public static void main(String[] args) {
     

           //impliment java libariry using java class "libariry"
           //methoods: addbook,issuebook,returnbook,showAvaliablebooks
           //properties:array to store the avaliable books,
           //array to store the issued books


         Libarary centrallibrary=new Libarary();
         System.out.println("");
         centrallibrary.addbook("think and grow rich");
         centrallibrary.addbook("c");
         centrallibrary.addbook("c++");
         centrallibrary.addbook("java");
         centrallibrary.addbook("algorithms");
         centrallibrary.showAvaliablebooks();
         System.out.println("");

         centrallibrary.issuebook("c++");
         centrallibrary.showAvaliablebooks();
         System.out.println("");

         centrallibrary.returnbook("c++");
         centrallibrary.showAvaliablebooks();



  }  
}
