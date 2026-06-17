//                                                 STATIC

// The static keyword is used for members (variables, methods, blocks, nested classes) that belong to the class itself, 
// rather than to individual objects.

package OOPS;


class Studen{
    String name;
    static String school;                           // we want the school to be same for all the students so we use static

    public void info(){
        System.out.println(name + " " + school);
    }

    public static void changeschool(){
        school = "ABCD";
    }
}


public class I_static {
    
    public static void main(String[] args) {
        
        Studen.school = "KL International";         // we directly use static 

        Studen s1 = new Studen();
        s1.name = "Shaurya singhal";
        s1.info();                                  // KL International
        Studen.changeschool();
        s1.info();                                  // ABCD 

    }
}
