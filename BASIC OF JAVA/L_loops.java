//                              LOOPS

// 1. FOR
// 2. DO WHILE 
// 3. WHILE


import java.util.*;

public class L_loops {
    
    public static void main(String[] args) {

        // FOR LOOP
        for(int i = 0 ; i<= 100 ; i++){
            System.out.println(i);
        }

        // WHILE
        int i = 100;
        while( i >= 1){
            System.out.println(i);
            i--;
        }

        // DO WHILE
        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k <= 100);


        // taking input from user till the user enters -1
        int num;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter a number :");
            num = sc.nextInt();
            System.out.print("here is the number u entered :");
            System.out.print(num);
        }while(num >= 0);
        
    }
}