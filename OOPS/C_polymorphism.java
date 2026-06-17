//                                                   POLYMORPHISM

// FUNCTION OVERLOADING    --> Occurs when multiple methods have the same name but different parameters. {Compile-Time Polymorphism}
// FUNCTION OVERRIDING     --> Occurs when a child class provides its own implementation of a method already defined in the parent class.

package OOPS;


// POLYMORPHISM
// It allows the same method or object to behave differently in different situations.

// FUNCTION OVERLOADING  
class Stu {
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }

    public void printinfo(String name ,  int age){
        System.out.println(name + " " + age);
    }
}

public class C_polymorphism {
 
    public static void main(String[] args) {
        
        Stu s1 = new Stu();
        s1.name = "shaurya singhal";
        s1.age = 19;

        s1.printinfo(s1.age);              // 19
        s1.printinfo(s1.name);             // shaurya singhal
        s1.printinfo(s1.name , s1.age);    // shaurya singhal 19
    }
}
