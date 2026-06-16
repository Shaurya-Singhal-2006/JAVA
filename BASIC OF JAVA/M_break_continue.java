//                                BREAK AND CONTINUE

// break -->     break is used to immediately terminate a loop or switch statement and move control to the next statement after it.
// continue -->  continue is used to skip the current iteration of a loop and move to the next iteration.


public class M_break_continue {
    public static void main(String[] args) {

        // CONTINUE
        for(int i = 1 ; i <= 100 ; i++){
            if(i%5 == 0){
                System.out.println(i);
            }
            else
                continue;
        }

        System.out.println();                //for empty line

        // BREAK
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if(i > 5){
                break;
            }
        }
    }
}
