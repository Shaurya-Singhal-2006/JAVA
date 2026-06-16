//                               TRY AND CATCH


//  try is used to enclose code that may cause an exception (error) during program execution.
//  catch is used to handle an exception thrown by the code inside the try block.

public class N_try_catch {
    
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        try{
            System.out.println(num[7]);                                    // made an error of printing more that array size
        }
        catch(ArrayIndexOutOfBoundsException e){                           // do things after catching
            System.out.println("out of bound");
        }

        System.out.println("my name is shaurya singhal");               //before this line wont execute because of the error above

    }
}
