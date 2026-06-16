//                                 FUNCTIONS AND METHODS   

// function   -->  A function is a block of code that performs a specific task and can be called when needed.
// method     -->  A method is a function that belongs to a class or object in Java.

import java.util.*;
public class O_function_method {

    public static void hello_world(){                         // method to print hello world 
        System.out.println("Hello World");
        
    }

    // FUNCTION
    public static void print_name(String name) {
        System.out.print("your name is :");
        System.out.println(name);
    }

    // function to return sum of two number
    public static int add_two_num(int a , int b){
        return a + b;
    }
    
    public static void main(String[] args) {
        
        // METHOD
        hello_world();
        hello_world();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter name :");
        String name = sc.nextLine();

        print_name(name);

        int a = 10;
        int b = 15;

        int sum = add_two_num(a, b);
        System.out.println(sum);
    }
}
