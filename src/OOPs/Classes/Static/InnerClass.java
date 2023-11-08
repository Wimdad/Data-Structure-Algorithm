package OOPs.Classes.Static;
/*
    Outside class can't be static.
 */
public class InnerClass {
    public static void main(String[] args) {
        Car audi = new Car("audi");
        Car bmw = new Car("bmw");
        audi.run();
        bmw.run();
        System.out.println(audi.name);
        System.out.println(bmw.name);
    }
    /*
        Inner class is dependent on outer class, hence it need to be static
     */
    static class Car {
        String name;

        Car(String name) {
            this.name = name;
        }

        void run() {
            System.out.println(name + " is running");
        }
    }
}
