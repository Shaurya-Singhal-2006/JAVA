//                                                  INTERFACE 

// An Interface is a blueprint of a class that contains method declarations. 
// It is used to achieve abstraction and multiple inheritance in Java.
// hides all the useless information


package OOPS;

interface Animals{

    void walk();
}

interface Herbivore{

}

// MULTIPLE INHERTANCE
class Dog implements Animals , Herbivore{              // we use implement for interface

    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class H_interface {
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
    }
}
