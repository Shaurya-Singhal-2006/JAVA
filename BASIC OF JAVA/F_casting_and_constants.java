//                                                   CASTING AND CONSTANTS

// for constant we use ' final ' keyword 

public class F_casting_and_constants {

    public static void main(String[] args) {

        float price = 100.00f;
        float finalprice = price + 18;                // implicit casting  (java does this by itself) 

        System.out.println(finalprice);               // 118.00

        int p = 100;
        // int fp = p + 18.00;                          this will give error  {we have to do explicit casting}
        int fp = p + (int)18.00;
        System.out.println(fp);                       //118       
        
        int age = 19;                                 // we can change the value of these variables 
        age = 20;
        age = 21;

        System.out.println(age);                      // 21

        final float PI = 3.14F;                       // now the value of PI will not change if we will try it will throw a error
        // PI = 3.11F;
        System.out.println(PI);                       // 3.14

    }
}
