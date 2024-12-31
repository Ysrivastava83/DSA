
class Example {
    private int x;
    private int y;

    // Constructor 1
    public Example() {
        this(0, 0); // Calls Constructor 2
        System.out.println("Default constructor");
    }

    // Constructor 2
    public Example(int x) {
        this(x, 0); // Calls Constructor 3
        System.out.println("Constructor with one parameter");
    }

    // Constructor 3
    public Example(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructor with two parameters");
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Example example1 = new Example();  // Calls Constructor 1
        example1.display();

        Example example2 = new Example(5); // Calls Constructor 2
        example2.display();

        Example example3 = new Example(5, 10); // Calls Constructor 3 directly
        example3.display();
    }
}
