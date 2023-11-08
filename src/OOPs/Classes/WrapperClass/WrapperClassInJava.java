package OOPs.Classes.WrapperClass;

public class WrapperClassInJava {
    /*
    Q. When to use wrapper classes in Java.

    A Wrapper class in Java is a class whose object wraps or contains primitive data types.Here are some scenarios where you might need to use a
    wrapper class in Java:

    1. **Converting Primitive Data Types into Objects**: Wrapper classes convert primitive data types into objects. This is useful when you want
    to modify the arguments passed into a method, because primitive types are passed by value¹.
    2. **Data Structures in the Collection Framework**: Data structures in the Collection framework, such as ArrayList and Vector, store only objects
    (reference types) and not primitive types¹.
    3. **Supporting Synchronization in Multithreading**: An object is needed to support synchronization in multithreading¹.
    4. **Autoboxing and Unboxing**: The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as
    autoboxing. The reverse process is known as unboxing¹.
    5. **Java Generics**: Java Generics works only with object types and does not support primitive types⁴.
    6. **Serialization**: We need to convert the objects into streams to perform the serialization. If we have a primitive value, we can convert
    it into objects through the wrapper classes².

    Remember, Java is an object-oriented programming language, so we often need to deal with objects. In such cases, wrapper classes can
    be very helpful².
     */
    public static void main(String[] args) {
        int a = 10; // primitive data type
        int b = 20; // primitive data type
        /*
        Integer is final. Here questions aries what's the final keyword that we r dealing with..
        Final keyword: using (final) keyword we (preventing our variables to modified in near future)
        Note: Final variable has to be initialized. Always initialized the final variable while declaring  it.
        But unfortunately final guarantees immutability only when instance variables are of primitive type and not the referenced type.
        If we use final keyword for the object then we can modify it's variables but not reassign it's.
        (Example: final Student student = new Student();
                  student.name = "new name";
                  kunal = other object. (We can't do this))
         */
        Integer number = 15; // this is an object instead of a primitive type
        /*
        we only have pass by value in java we don't have pass by reference
         */
        Integer digit = 890; // this is also an object
        swap(number, digit);
        System.out.println("Number: " + number + "," + "Digit: " + digit);
        swap(a, b);
        System.out.println("Original A: " + a + "," + "Original B: " + b);

        final A human = new A("Sachin Ramesh Tendulkar");
        human.name = "Rahul Dravid";
        System.out.println(human.name);
        /*
        Cannot assign a value to final variable 'human'. When a non primitive is final, we can't reassign it
         */
//        human = new A("Sachin R");
    }
    /*
    However, when we pass an object to a method in Java, the "value" being passed is actually the reference to the object in memory
    (not the actual object itself). This might give the illusion of (pass-by-reference behavior) because changes to the object that the
    reference points to (like calling a setter on the object) will persist outside the method.
     */
    static void swap(Integer number, Integer digit) {
        int temp = number;
        number = digit;
        digit = temp;

        System.out.println("Number: " + number + "," + "Digit: " + digit);
    }
    /*
    That's correct. Java is strictly pass-by-value. When we pass a variable to a method, a new copy of the variable is created in the method stack
    frame. Any changes made in the method do not affect the original variable
     */
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A: " + a + "," + "B: " + b);
    }
}
class A {
    final int value = 10;
    String name;
    Boolean isMatched;
    public A(String name) {
        this.name = name;
    }
}
