//                              SWITCH CASE 


// A control statement in Java that selects and executes one block of code from multiple options based on the value of an expression.

import java.util.*;

public class K_switch {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. of day : ");
        int day = sc.nextInt();

        switch(day){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
            System.err.println("Invalid Input");
        }
    }
}
