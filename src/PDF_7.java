// Class A
class A {
    int data = 10; // Data member for runtime polymorphism demonstration

    // Specific method to class A
    void methodA1() {
        System.out.println("Method A1 of class A");
    }

    // Another specific method to class A
    void methodA2() {
        System.out.println("Method A2 of class A");
    }

    // Overridden method
    void display() {
        System.out.println("Display method of class A");
    }
}

// Class B extending A
class B extends A {
    int data = 20; // Data member for runtime polymorphism demonstration

    // Specific method to class B
    void methodB1() {
        System.out.println("Method B1 of class B");
    }

    // Another specific method to class B
    void methodB2() {
        System.out.println("Method B2 of class B");
    }

    // Overridden method
    @Override
    void display() {
        System.out.println("Display method of class B");
    }
}

// Class C extending B
class C extends B {
    int data = 30; // Data member for runtime polymorphism demonstration

    // Specific method to class C
    void methodC1() {
        System.out.println("Method C1 of class C");
    }

    // Another specific method to class C
    void methodC2() {
        System.out.println("Method C2 of class C");
    }

    // Overridden method
    @Override
    void display() {
        System.out.println("Display method of class C");
    }
}

// Main class
public class PDF_7 {
    public static void main(String[] args) {
        // Creating objects of each class
        A a = new A();
        B b = new B();
        C c = new C();

        // Calling methods of class A
        System.out.println("Methods of class A:");
        a.methodA1();
        a.methodA2();
        a.display();

        // Calling methods of class B
        System.out.println("\nMethods of class B:");
        b.methodB1();
        b.methodB2();
        b.display();

        // Calling methods of class C
        System.out.println("\nMethods of class C:");
        c.methodC1();
        c.methodC2();
        c.display();

        // Demonstrating runtime polymorphism
        A ref; // Reference variable of type A

        // Referring to B object
        ref = b;
        System.out.println("\nRuntime Polymorphism with B:");
        ref.display();

        // Referring to C object
        ref = c;
        System.out.println("Runtime Polymorphism with C:");
        ref.display();

        // Demonstrating runtime polymorphism with data members
        System.out.println("\nRuntime Polymorphism with Data Members:");
        System.out.println("Data member in A: " + a.data);
        System.out.println("Data member in B: " + b.data);
        System.out.println("Data member in C: " + c.data);
    }
}
