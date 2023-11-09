package OOPs.Classes.Principles.Inheritance;

public class Main {
    public static void main(String[] args) {
        ParentBox box = new ParentBox();
        System.out.println("Height: " + box.height + "," + "Width: " + box.width + "," + "Length: " + box.length);
        ParentBox cube = new ParentBox(13.2);
        System.out.println("Height: " + cube.height + "," + "Width: " + cube.width + "," + "Length: " + cube.length);
        ParentBox randomBox = new ParentBox(100.0,
                24.0,
                12.3);
        System.out.println("Height: " + randomBox.height + "," + "Width: " + randomBox.width + "," + "Length: " + randomBox.length);
        ParentBox oldBox = new ParentBox(randomBox);
        System.out.println("Height: " + oldBox.height + "," + "Width: " + oldBox.width + "," + "Length: " + oldBox.length);

        ChildBox childBox = new ChildBox();
        System.out.println("Height: " + childBox.height + "," + "Width: " + childBox.width + "," + "Length: "
                + childBox.length + "," +  "Weight: " + childBox.weight);
        ChildBox childBoxInheritParent = new ChildBox(
                100.0,
                24.0,
                12.3,
                43.0
        );
        System.out.println("Height: " + childBoxInheritParent.height + "," + "Width: " + childBoxInheritParent.width + "," + "Length: "
                + childBoxInheritParent.length + "," +  "Weight: " + childBoxInheritParent.weight);
        ChildBox copyConstructor = new ChildBox(childBoxInheritParent);
        System.out.println("Height: " + copyConstructor.height + "," + "Width: " + copyConstructor.width + "," + "Length: "
                + copyConstructor.length + "," +  "Weight: " + copyConstructor.weight);

        /*
        Whatever i am doing now is very much important in the view of the interview.
        I am taking data type as a (ParentBox) and creating a (reference variable of ParentBox) but creating an object of the (ChildBox).
        (We are able to initialized all the variables that are in ParentBox as well as in childBox, but we are not able to access
        childBox parameters using the ParentBox reference variable.)
        Important Note: It's the type of the reference variable that actually  determines not the type of object that what members can be accessed.
         */
        ParentBox parentBoxAccess = new ChildBox(2,4,6,7);
        System.out.println(parentBoxAccess.length  + " " + parentBoxAccess.height + " " + parentBoxAccess.width);
        /*
        We are not able to initialized the weight while creating the object of the parent box class because in the parent class we don't have
        weight variable.
        (Example: ChildBox childBoxAccess = new ParentBox();)
        This will throw an error because we need to initialize the weight variable in order to access it but in parent class we don't have
        weight variable.
        Below class not able to access the class that was above.
         */
    }
}
