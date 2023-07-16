
import java.util.Stack;


public class stack {
    public static void main(String[] args) {
        Stack<String> animal=new Stack<>();

        //we use push fuction to add element in stack

        animal.push("cat");
        animal.push("elephant");
        animal.push("lion");
        animal.push("dog");
    

        System.out.println(animal);

        //we have peak function to see which element is into top  in steak.

        System.out.println(animal.peek());  

        //we have pop function to  remove top element from steak .
        
        animal.pop();
        System.out.println(animal);
        System.out.println(animal.peek());


    



    }
}
