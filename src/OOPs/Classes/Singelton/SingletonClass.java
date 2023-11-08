package OOPs.Classes.Singelton;

public class SingletonClass {
    /*
        Make a class in such a way that allows only one instance.. there comes singleton concept.
        Whenever we are creating an object we r using (new keyword) along with the (constructor call).. so, in order to achieve the singleton concept
        we need to restrict the constructor call...
     */
    private static SingletonClass instance;
    private String name;
    private SingletonClass() {
    }
    public static SingletonClass getInstance() {
        // check whether only 1 object is created or not
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "SingletonClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
