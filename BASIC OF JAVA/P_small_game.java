// To generate a random number and allow the user to repeatedly guess it until the correct number is found, providing hints whether 
// the guess is too high or too low.

import java.util.*;                           
public class P_small_game {

    public static void main(String[] args) {
        
        int random_num = (int)(Math.random()*100);                        // making random number
        Scanner sc = new Scanner(System.in);
        int guess_num;

        do{
            System.out.print("enter the guess number : ");
            guess_num = sc.nextInt();                                     // taking input   

            if(guess_num == random_num){
                System.out.println("YOU GUESSED IT !!!!");
                break;
            }
            else if(guess_num < random_num){
                System.out.println("your number is small");
            }
            else{
                System.out.println("your number is large");
            }
        }while(guess_num >= 0);

        System.out.print("the number was :");                          // only prints if the user enters -1
        System.out.println(random_num);
    }
    
}
