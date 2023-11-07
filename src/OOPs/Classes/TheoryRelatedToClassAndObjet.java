package OOPs.Classes;

import java.util.Arrays;

public class TheoryRelatedToClassAndObjet {
    public static void main(String[] args) {
//        // store 5 roll numbers
//        int[] rollNumbers = new int[5];
//        // store 5 names of a students
//        String[] names = new String[5];
//        // lets say we need to store data of 5 students: {rollNumbers, names, marks}
//        float[] marks = new float[5];

        // whenever we create an (instance or object) of the class, the jvm will allocate memory at (runtime)..
        // class is an (theoretical constructor).. and object is the (physical) thing that takes space in the heap memory...
        Student waquar = new Student(1, 100.2f, "Waquar Imdad");
        System.out.println(waquar.getName() + " " + waquar.getMarks() + " " + waquar.getRollNumbers());

        Student kunal = new Student();
        kunal.setName("Kunal");
        kunal.setMarks(123.3f);
        kunal.setRollNumbers(2);
        System.out.println(kunal.getName() + " " + kunal.getMarks() + " " + kunal.getRollNumbers());

        Student student;
        // declaring it heere, now it is just in the stack memory not pointing to any object, just try to print and check, we r not able to print
        // because it's not yet initialized, so in order to print this we need to first initialized the object..
        student = new Student();
        System.out.println(student);

        Student[] arrayOfStudent = new Student[5];
        System.out.println(Arrays.toString(arrayOfStudent));
        // but for the object it's null.. because it's not initialized..
    }

    /*
    (Class) is an template/blue print of an object and (object) is the (instance) of the class..
    Example: Car is a template and its (properties) are the object.. each (properties) has an different (values)...
    if we create a class static then we don't need to create an object for this, we directly call the class..
    (Object has an three essentials property: 1. State 2. identity 3. behavior of an object)
    1. State --> it's value from the data type
    Note: Instance Variable:-> Variable inside an object is known as instance variable or variable declare inside the class..
     (VVImportant) (When we create an object, memory is dynamically allocated at run time...) and return reference to it..
     */

    // Inner class: Student student = new Student(); here (Student) is the data type and (student) is the reference variable...
    // Example: ArrayList<Integer> arrayList = new ArrayList<>(); Just like above here (Integer) is the data type..
    static class Student {
        // this are called the class data type... and class is used to define this data type..
        // inner class need to be static..
        int rollNumbers;
        float marks;
        String name;

        // Parameterized constructor..
        Student(int rollNumbers, float marks, String name) {
            this.rollNumbers = rollNumbers;
            this.marks = marks;
            this.name = name;
        }
        // Non Parameterized constructor
        Student() {

        }

        public int getRollNumbers() {
            return rollNumbers;
        }

        public float getMarks() {
            return marks;
        }

        public String getName() {
            return name;
        }

        public void setRollNumbers(int rollNumbers) {
            this.rollNumbers = rollNumbers;
        }

        public void setMarks(float marks) {
            this.marks = marks;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
