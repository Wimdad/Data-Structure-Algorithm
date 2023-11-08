package OOPs.Classes.Static;

public class Human {
    /*
    The variables declared inside the class is known as instance variables.
    Q. What is static variables?
    A. When a member is declared (static) it can be accessed before any of the objects of the class is being created and without referencing to
       that object.
     */
    String name;
    String gender;
    int salary;
    Boolean isMarried;
    // static is not related to an object, whenever we r (creating) or (updating) or (fetching) static variables don't access through (reference variables)
    static long population;

    Human(String name, String gender, boolean isMarried, int salary) {
        this.name = name;
        this.gender = gender;
        this.isMarried = isMarried;
        this.salary = salary;
        Human.population += 1;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", isMarried=" + isMarried +
                '}';
    }
}