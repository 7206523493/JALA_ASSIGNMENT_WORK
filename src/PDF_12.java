//class MyClass {
//    // Default constructor
//    MyClass() {
//        System.out.println("Default constructor called");
//    }
//
//    // One argument constructor
//    MyClass(int a) {
//        System.out.println("One argument constructor called with value: " + a);
//    }
//
//    // Two argument constructor
//    MyClass(int a, int b) {
//        System.out.println("Two argument constructor called with values: " + a + ", " + b);
//    }
//
//    public static void main(String[] args) {
//        // Instantiating the class to call all constructors
//        MyClass obj1 = new MyClass();
//        MyClass obj2 = new MyClass(10);
//        MyClass obj3 = new MyClass(20, 30);
//    }
//}
//class ParentClass {
//    // Default constructor
//    ParentClass() {
//        System.out.println("Parent class default constructor called");
//    }
//
//    // One argument constructor
//    ParentClass(int a) {
//        System.out.println("Parent class one argument constructor called with value: " + a);
//    }
//}
//
//class ChildClass extends ParentClass {
//    // Default constructor
//    ChildClass() {
//        super();
//        System.out.println("Child class default constructor called");
//    }
//
//    // One argument constructor
//    ChildClass(int a) {
//        super(a);
//        System.out.println("Child class one argument constructor called with value: " + a);
//    }
//
//    public static void main(String[] args) {
//        // Instantiating the child class to call parent constructors
//        ChildClass obj1 = new ChildClass();
//        ChildClass obj2 = new ChildClass(10);
//    }
//}
//class AccessModifiers {
//    // Default constructor
//    AccessModifiers() {
//        System.out.println("Default access modifier constructor called");
//    }
//
//    // Public constructor
//    public AccessModifiers(int a) {
//        System.out.println("Public access modifier constructor called with value: " + a);
//    }
//
//    // Protected constructor
//    protected AccessModifiers(int a, int b) {
//        System.out.println("Protected access modifier constructor called with values: " + a + ", " + b);
//    }
//
//    // Private constructor
//    private AccessModifiers(int a, int b, int c) {
//        System.out.println("Private access modifier constructor called with values: " + a + ", " + b + ", " + c);
//    }
//
//    public static void main(String[] args) {
//        // Instantiating the class to call constructors with different access modifiers
//        AccessModifiers obj1 = new AccessModifiers();
//        AccessModifiers obj2 = new AccessModifiers(10);
//        AccessModifiers obj3 = new AccessModifiers(20, 30);
//        // AccessModifiers obj4 = new AccessModifiers(40, 50, 60); // This line will cause a compilation error due to private constructor
//    }
//}
//
//class MyClass {
//    MyClass() {
//        System.out.println("Constructor called");
//    }
//
//    void callConstructor() {
//        System.out.println("Constructor-like method called");
//    }
//
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        // Trying to call the constructor multiple times (actually calling a method)
//        obj.callConstructor();
//        obj.callConstructor();
//        obj.callConstructor();
//    }
//}
//
