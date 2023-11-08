package OOPs.Classes.Static;

public class Main {
    public static void main(String[] args) {
        Human salman = new Human(
                "Salman",
                "Male",
                false ,
                63000
        );
        Human sachin = new Human(
                "Sachin",
                "Male",
                false ,
                63000
        );
        System.out.println(salman);
        // we can directly call it by using the class name, don't use reference variables to call static variables. Convention is important
        System.out.println(Human.population);
        /*
        we r getting an error saying this: Non-static method 'greeting()' cannot be referenced from a static context, because main method is static.
        If we make this a static method then we r able to access this inside the static main
        Note: We know that something which is not static belongs to an object
         */
        Main object = new Main();
        object.fun();
    }

    void greeting() {
        System.out.println("Hello, world!");
    }
    // this is not dependent on object
    static void message() {
        Main obj = new Main();
        obj.fun();
        obj.greeting();
    }

    void fun() {
        // it's not throws an error because we already created an object in the Main class.. inside message() method
       greeting();
    }
}
