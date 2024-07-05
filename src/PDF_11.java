//
//class MyClass {
//    int a = 10;
//    String b = "Hello";
//
//    void printFields() {
//        System.out.println("a: " + this.a);
//        System.out.println("b: " + this.b);
//    }
//
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        obj.printFields();
//    }
//}
//class ParentClass {
//    int x = 20;
//    String y = "Parent";
//
//    void printParentFields() {
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);
//    }
//}
//
//class ChildClass extends ParentClass {
//    int x = 10;
//    String y = "Child";
//
//    void printFields() {
//        System.out.println("Child x: " + x);
//        System.out.println("Child y: " + y);
//        System.out.println("Parent x: " + super.x);
//        System.out.println("Parent y: " + super.y);
//    }
//
//    public static void main(String[] args) {
//        ChildClass obj = new ChildClass();
//        obj.printFields();
//    }
//}
//class MyClass {
//    MyClass() {
//        this("Hello");
//        System.out.println("Default constructor");
//    }
//
//    MyClass(String msg) {
//        System.out.println("Parameterized constructor: " + msg);
//    }
//
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//    }
//}
//class MyClass {
//    MyClass() {
//        this(10);
//        System.out.println("Default constructor");
//    }
//
//    MyClass(int num) {
//        System.out.println("Parameterized constructor: " + num);
//    }
//
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//    }
//}
//class ParentClass {
//    ParentClass() {
//        System.out.println("Parent class constructor");
//    }
//}
//
//class ChildClass extends ParentClass {
//    ChildClass() {
//        super();
//        System.out.println("Child class constructor");
//    }
//
//    public static void main(String[] args) {
//        ChildClass obj = new ChildClass();
//    }
//}
//class ParentClass {
//    void parentMethod() {
//        System.out.println("Parent class method");
//    }
//}
//
//class ChildClass extends ParentClass {
//    void childMethod() {
//        super.parentMethod(); // using super to call parent class method
//        this.childSpecificMethod(); // using this to call another method in the same class
//    }
//
//    void childSpecificMethod() {
//        System.out.println("Child specific method");
//    }
//
//    public static void main(String[] args) {
//        ChildClass obj = new ChildClass();
//        obj.childMethod();
//    }
//}
