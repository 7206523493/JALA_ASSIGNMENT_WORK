// Abstract class with abstract and non-abstract methods
abstract class AbstractClass {
    // Abstract method
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("This is a non-abstract method in the abstract class.");
    }
}

// Subclass for the abstract class
class ChildClass extends AbstractClass {
    // Implementing the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented in the child class.");
    }
}

// Main class to run the code
public class PDF_9 {
    public static void main(String[] args) {
        // Creating an instance of the child class
        ChildClass child = new ChildClass();

        // Calling the abstract method implemented in the child class
        child.abstractMethod();

        // Calling the non-abstract method from the abstract class using the child class object
        child.nonAbstractMethod();
    }
}
