//                                                     TYPES

// PRIMITIVE TYPES  (simple values) (fixed size)

// 1. Byte -->     1 byte memory [-128 to 127]
// 2. Short -->    2 byte memory  
// 3. Int -->      4 byte memory  (1,2,3,4)
// 4. Long -->     8 byte memory 
// 5. Float -->    4 byte memory  (3.14)
// 6. Double -->   8 byte memory
// 7. Char -->     2 byte memory  (a,b,c,d)
// 8. boolean -->  1 byte memory  (true / false)



// NON-PREMITIVE TYPES 

// String --> collection of char 

// EG : name.lenght()  --> tells the length of the string 


public class C_dataTypes{

    public static void main(String[] args) {
        byte age = 19;
        int phone1 = 1234567890;               // int can store only 10 numbers if we want to store more we have to use long
        long phone2 = 1234567890123456789L;    // we have to write " L " in teh end of the long so Java know we are using long 
        float pi = 3.14F;                      // same with float we end it with " F " so Java know we are using float  
        char alphabet  = 'S';                  // in char we use ' ' rather than " " like in string
        String name = "shaurya";               // here we have used " " because its a string not a char
        boolean isadult = false;       

        System.out.println(age);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(pi);
        System.out.println(alphabet);
        System.out.println(name);
        System.out.println(isadult);

        System.out.println(name.length());
        
    }
}

// OUTPUT 

//  19
//  1234567890
//  1234567890123456789
//  3.14
//  s
//  shaurya
//  false
//  7