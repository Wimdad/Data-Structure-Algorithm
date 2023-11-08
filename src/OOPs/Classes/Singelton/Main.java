package OOPs.Classes.Singelton;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonClassOne = SingletonClass.getInstance();
        SingletonClass singletonClassTwo = SingletonClass.getInstance();
        SingletonClass singletonClassThree = SingletonClass.getInstance();
        /*
            all of this 3 reference variables are pointing to the same object
         */
        System.out.println(singletonClassOne);
        System.out.println(singletonClassTwo);
        System.out.println(singletonClassThree);
    }
}
