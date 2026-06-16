//                              CONDITIONAL STATEMENTS 


// IF

// if(SunUp == true)
//             System.out.println("Day");
//         else
//             System.out.println("Night");


// ELSE IF

//    if(age <= 13)
//        System.out.println("Child");
//    else if(age <=18)
//        System.out.println("Teenager");
//    else
//        System.out.println("Adult");


import java.util.*;


public class J_conditional_statements {

    public static void main(String[] args) {
        
        // IF
        boolean SunUp = true;
        if(SunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");


        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age  = sc.nextInt();

        // ELSE IF
        if(age <= 13)
            System.out.println("Child");
        else if(age <=18)
            System.out.println("Teenager");
        else
            System.out.println("Adult");
    }   
}
