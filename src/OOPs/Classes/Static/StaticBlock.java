package OOPs.Classes.Static;
/*
    Class level static variables and methods resolves during compile time
 */
public class StaticBlock {
    static int a = 14;
    static int b;

    /*
    will run only once, when the first object is create i.e when the class is loaded
    fot the first time
     */
    static {
        System.out.println("Inside static block");
        b = a * 23;
    }

    public static void main(String[] args) {
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println(StaticBlock.b);
    }
}
