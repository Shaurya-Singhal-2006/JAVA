//                                             CONSTRUCTOR 

// 1. DEFAULT CONSTRUCTOR --> A default constructor is a constructor that does not take any parameters. 
// It is used to initialize objects with default values. If no constructor is written in a class, Java automatically provides a default constructor.

// 2. PARAMETERIZED CONSTRUCTOR --> A parameterized constructor accepts one or more parameters. 
// It is used to initialize objects with specific values provided at the time of object creation.

// 3. COPY CONSTRUCTOR --> A copy constructor creates a new object by copying the data from an existing object. Java does not provide a built-in copy constructor like C++,
//  so it must be defined manually.

// name should be same 
// they dont have a return type 
// we can call them only one time 


package OOPS;

class Students{
    String name;
    int age;

    // NON PARAMETERIZED CONSTRUCTOR
    Students(){
        System.out.println("Hello Students");
    }

    // PARAMETERIZED CONSTRUCTOR
    Students(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("your name is : " + this.name);
        System.out.println("your age is : " + this.age);
    }

    // COPY CONSTRUCTOR 
    Students(Students s2){
        this.name  = s2.name;
        this.age = s2.age;
    }

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}


public class B_constructor {
    public static void main(String[] args) {

        Students s1 = new Students();                                   // NON PARAMETERIZED CONSTRUCTOR
        Students s2 = new Students("shaurya singhal" , 19);   // PARAMETERIZED CONSTRUCTOR
        s1.name = "Rohan";
        s1.age = 19;

        Students s3 = new Students(s1);                                 // COPY CONSTRUCTOR 
        s3.printinfo();
    }
}
