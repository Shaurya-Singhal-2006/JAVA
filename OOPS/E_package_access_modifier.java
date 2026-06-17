//                                               PACKAGES AND MODIFIERS

// PACKAGE         -->  A package is a collection of related classes, interfaces, and sub-packages.
// ACCESS MODIFIER -->  Access Modifiers control where a class, variable, method, or constructor can be accessed from.



// import E_bank_package;
package OOPS;

public class E_package_access_modifier {
    
    public static void main(String[] args) {

        Account acc = new Account();
        acc.name = "SHAURYA";
        acc.info();


        Accounts accs = new Accounts();
        accs.name = "Shaurya singhal";
        accs.email = "shauryasinghal@gmail.com";
        accs.SetPassword("abcd");
        System.out.println(accs.GetPassword());
    }
}




// Modifier              	Same Class	Same Package	Subclass (Different Package)    Different Package

// private	                    ✅	       ❌	            ❌	                             ❌
// Default (no modifier)	    ✅	       ✅                ❌                                ❌
// protected	                ✅	       ✅	            ✅	                             ❌
// public	                    ✅	       ✅	            ✅	                             ✅


// if we dont use any modifier then it is default 

// getters and setters for private modifier

class Accounts{
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String GetPassword(){
        return this.password;
    }

    public void SetPassword(String pass){
        this.password = pass;
    }
}


// i have class setpassword function to store function 
// accs.password = "abcd"   --> this will not work
