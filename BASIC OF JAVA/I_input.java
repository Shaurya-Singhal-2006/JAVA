//                                    INPUT

import java.util.*; 
// Scanner class

public class I_input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);              // Create a Scanner object named sc that can read data entered from the keyboard.
        System.out.print("input your age :");
        int age  = sc.nextInt();                          // Scanner method that reads the next integer entered by the user.
        System.out.println(age);

        Scanner n = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = n.next();                           // this takes input as tokes not the whole line 
        System.out.println(name);

        Scanner na = new Scanner(System.in);
        System.out.print("enter your full name : ");
        String name1 = na.nextLine();                     // this will take the whole line as input 
        System.out.print(name1);

    }
    
}
