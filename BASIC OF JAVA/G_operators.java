//                                   OPEARTORS

// Arithmethic Operators ( + , - , * , / , % , ** )

// 1. +  --> addition
// 2. -  --> subtraction
// 3. *  --> multiplication
// 4. /  --> division
// 5. %  --> modulo



// Assignment Operators

// 1. =  -->           assignment 
// 2. --X , ++X -->    prefix       (increase or decrease first then use)
// 3. X-- , X-- -->    postfix      (use first then increase or decrease)
// 4.  +=
// 5.  -=
// 6.  *=
// 7.  /=
// 8.  %=



// Relational Operators 

// 1. ==  -->  equals to ( answer is in terms of true or false )(boolean value)
// 2. !=  -->  not equals to ( answer is in terms of true or false )(boolean value)
// 3. >=  -->  greater than equal to ( answer is in terms of true or false )(boolean value)
// 4. >   -->  greater than ( answer is in terms of true or false )(boolean value)
// 5. <=  -->  less than equal to ( answer is in terms of true or false )(boolean value)
// 6. <   -->  less than ( answer is in terms of true or false )(boolean value)



// Logical Operator 

// 1.  && AND -->  both condition needs to be true for the answer to be true
// 2.  || OR  -->  if one condition is true the answer is true   
// 3.  !  NOT -->  makes true false and false true

import java.util.*;

public class G_operators {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // AND
        if(a < 20 && b < 20)
            System.out.println("both are less than 20");


        // NOT
        boolean IsAdult = false;
        if(!IsAdult)
            System.err.println("ADULT");
        else
            System.out.println("NOT ADULT");


        // notebook = 40 , pen = 20
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the amount u have : ");
        int money = sc.nextInt();

        if(money < 10){                                        // we use { } if we want to execute code more than one line
            System.out.println("can not buy anything");
            System.out.println("get more money");
        }
        else if (money > 10 && money < 50){
            System.err.println("u can buy only one things");
        }
        else
            System.out.println("u can buy both the things ");

    }
}
