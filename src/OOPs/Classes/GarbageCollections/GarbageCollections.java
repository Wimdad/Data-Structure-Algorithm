package OOPs.Classes.GarbageCollections;

public class GarbageCollections {
    public static void main(String[] args) {
        /*
        We can't (destroyed the object manually in java). Because in Java, (garbage collection happens automatically).
         */
        Example example = new Example("Waquar Imdad");
        System.out.println(example);
    }
}
class Example {
    final int size = 4;
    String name;

    public Example(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Example{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}