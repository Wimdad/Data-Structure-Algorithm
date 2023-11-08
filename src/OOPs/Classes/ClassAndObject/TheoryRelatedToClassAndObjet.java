package OOPs.Classes.ClassAndObject;

import java.util.Arrays;

public class TheoryRelatedToClassAndObjet {
    public static void main(String[] args) {
        // store 5 roll numbers
//        int[] rollNumbers = new int[5];
//        // store 5 names of a students
//        String[] names = new String[5];
//        // lets say we need to store data of 5 students: {rollNumbers, names, marks}
//        float[] marks = new float[5];

        // whenever we create an (instance or object) of the class, the jvm will allocate memory at (runtime)..
        // class is an (theoretical constructor).. and object is the (physical) thing that takes space in the heap memory...

        Student student; // declaring the object
        // declaring it heere, now it is just in the stack memory not pointing to any object, just try to print and check, we r not able to print
        // because it's not yet initialized, so in order to print this we need to first initialized the object..
        student = new Student(); // initialize the object, new Student() is called constructor
        // by using the dot operator we can call the instance variable of the object or set the values.
        student.name = "Waquar Khan";
        student.greeting();
        student.marks = 99.99f;
        student.rollNumbers = 1;

        System.out.println(student.name);
        System.out.println(student.rollNumbers);
        System.out.println(student.marks);

        Student[] arrayOfStudent = new Student[5];
        // but for the object it's null.. because it's not initialized..
        System.out.println(Arrays.toString(arrayOfStudent));
        // this is successful with the help of the constructor that we r creating in the class
        Student newStudent = new Student(
                "Sarukh Khan",
                100.0f,
                7
        );
        newStudent.greeting();
        newStudent.changeName("Salman Khan");
        System.out.println(newStudent.name);
        System.out.println(newStudent.marks);
        System.out.println(newStudent.rollNumbers);

        Student otherStudent = new Student(newStudent);
        System.out.println(otherStudent.name);
        System.out.println(otherStudent.marks);
        System.out.println(otherStudent.rollNumbers);

        Student random = new Student();
        System.out.println(random.name);
        System.out.println(random.marks);
        System.out.println(random.rollNumbers);

    }

    /*
    (Class) is an template/blue print of an object and (object) is the (instance) of the class..
    Example: Car is a template and its (properties) are the object.. each (properties) has an different (values)...
    if we create a class static then we don't need to create an object for this, we directly call the class..
    (Object has an three essentials property: 1. State 2. identity 3. behavior of an object)
    1. State --> it's value from the data type
    Note: Instance Variable:-> Variable inside an object is known as instance variable or variable declare inside the class..
     (VVImportant) (When we create an object, memory is dynamically allocated at run time...) and return reference to it..
     Dynamic Memory Allocation: -> Lef hand side (Student student) = Right hand side (new Student()); whatever in the left hand side of the equal to is happened at compile time
     and the right hand side of the equal to is happened at the runtime.

     Primitive are stored in stack memory, because they r not an object
     */
}
// Student student = new Student(); here (Student) is the data type and (student) is the reference variable...
// Example: ArrayList<Integer> arrayList = new ArrayList<>(); Just like above here (Integer) is the data type..
class Student {
    // this are called the class data type... and class is used to define this data type..
    // inner class need to be static..
    int rollNumbers; // primitive data type
    float marks; // primitive data type
    String name;

    void greeting(){
        System.out.println("Hello World!, My name is " + name);
    }
    void changeName(String newName){
        name = newName;
    }

    /*
    Constructor is defined what happens when object is created. Constructor is the special type of function in the class.
    It runs when we create an object and it allocates some variables.

    (this) keyword is replacing with the name of reference variable
     */
    // it is called by default constructor, created by jvm for us..
//    Student() {
//        this.name = "Abhishek Bacchan";
//        this.marks = 24.5f;
//        this.rollNumbers = 43;
//    }
    /*
        It will fail if variable (name) and (name) inside the constructor is same.
     */
//    Student(String name, float marks, int rollNumbers) {
//        name = name;
//        marks = marks;
//        rollNumbers = rollNumbers;
//    }
    Student () {
        // this is how we call a constructor from another constructor
        // internally: new Student("Default Person", 100.0f, 100);
        // here (this) keyword is referring to the constructor
        this ("Default Person", 100.0f, 100);
    }

    /*
        In order to resolve this we can use two separate variables names or we can use (this) keyword.
     */
    Student(String name, float marks, int rollNumbers) {
        this.name = name;
        this.marks = marks;
        this.rollNumbers = rollNumbers;
    }

    Student (Student other) {
        this.name = other.name;
        this.marks = other.marks;
        this.rollNumbers = other.rollNumbers;
    }
}
