package OOPs.Classes.Principles.Inheritance;

public class ParentBox {
    /*
        There are four fundamentals principles/properties of the OOP system.
        1. Inheritance : (The properties that is inherited by the child class from the base/parent class) is known as (inheritance).
                         In order to access base class from the child class we use (extends keyword).
                         Parent class will not be able to access the properties of all the child class below it.
        2. Polymorphism
        3. Encapsulation
        4. Abstraction
     */
    double length;
    double height;
    double width;

    double weight;

    ParentBox() {
        /*
        Important notes: Class Object is the root of the class hierarchy. (Every class has Object as a superclass). All objects, including arrays,
        implement the methods of this class.
        Every single class inherit the (Object Class).
        Let's takes an example that if there is weight variable in the parent class as well, then order to access this we r using the super keyword.
        System.out.println(super.weight)
        that we declared in the parent class.
         */
        super();
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }
    // cube
    ParentBox(double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

    ParentBox(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    // Copy constructor
    ParentBox(ParentBox old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }
    void information() {
        System.out.println("Box is running very fast");
    }
}
