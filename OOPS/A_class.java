//                                               OOPS


// Class -->   A class is a blueprint or template for creating objects.
// Object -->  An object is an actual instance of a class.

package OOPS;
  
class Pen {                                    // CLASS 
    String color; 
    String type; 

    // functions which are defined in class are called methods 
    public void write(){
        System.out.println("writting something");
    }

    public void printcolor(){
        System.err.println(this.color);        // ' this ' refers to the current object that is calling the method.
    }
}


// CLASS STUDENT
class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println("your name is :" + this.name);
        System.out.println("your age is :" + this.age);
    }
}


public class A_class {

    public static void main(String[] args) {

        // OBJECT 
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ball";

        pen1.printcolor();
        pen2.printcolor();


        // STUNDENT OBJECT
        Student s1 = new Student();    // new is used to allocate memory to newly created object      
        Student s2 = new Student();    // new is used to allocate memory to newly created object    

        s1.name = "Shaurya Singhal";
        s1.age = 19;

        s2.name = "Rohan Varma";
        s2.age = 20;

        s1.printinfo();            // calling method from the class
        s2.printinfo();            // calling method from the class
    }
    
}
