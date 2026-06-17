//                                               INHERITANCE 

// Inheritance is an OOP concept where one class acquires the properties and methods of another class.
// It helps in code reusability and creates a parent-child relationship between classes.


// 1. Single Inheritance        -->  One child inherits from one parent.
// 2. Multilevel Inheritance    -->  A class inherits from a class that is already inherited.
// 3. Hierarchical Inheritance  -->  Multiple child classes inherit from the same parent.


package OOPS;

class Shape{
    public void area(){
        System.out.println("Display Area");
    }
}

// SINGLE LEVEL INHERITANCE
class Triangle extends Shape{                     // we use ' extends ' keyword to inherit 
 
    public void area(int h , int b){
        System.out.println(1/2*b*h);
    }
}

// MULTILEVEL INHERITANCE
class EquilateralTriangle extends Triangle{

    public void area(int h , int b){
        System.out.println(1/2*b*h);
    }
}

// HIERARCHICAL INHERITANCE 
class Circle extends Shape{

    public void area(int r){
        System.err.println((3.14)*r*r);
    }
}

public class D_inheritance {
    
    public static void main(String[] args) {
        
    }
}
