package OOPs.Classes.Principles.Inheritance;

public class ChildBox extends ParentBox {
    double weight;

    ChildBox() {
        super();
        this.weight = -1;
    }

    ChildBox(double length, double height, double width, double weight) {
        /*
        Super keyword: What is this? It is nothing but calls the parent class constructor.
        Used to initialize values present in the parent class.
         */
        super(length, height, width);
        this.weight = weight;
        /*
        we are able to access the weight variable in the child class by using the (this) keyword.
        But in order to access the weight variable of the parent class we need to do it by using (super) keyword.
         */
        System.out.println(this.weight);
        System.out.println(super.weight);
    }
    ChildBox(ChildBox other) {
        super(other);
        this.weight = other.weight;
    }
}
