//                                               ABSTRACTION

// Abstraction is the process of hiding implementation details and showing only the essential features to the user.


package OOPS;

// we dont need to show the Animal class to user as it is not relivent
abstract class Animal{                                    // we use ' abstract '
    abstract void walk();
}

class Horse extends Animal{

    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{

    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class G_abstraction {
    
    public static void main(String[] args) {
        
        Horse horse = new Horse();
        horse.walk();  

        // Animal animal = new Animal();                     this will give error

    }
}

// Constructor chaining  --> Constructor Chaining is the process of calling one constructor from another constructor.