//interface MyInterface {
//    void method1();
//    void method2();
//}
//
//abstract class MyClass implements MyInterface {
//    public void method1() {
//        System.out.println("Method1 implementation");
//    }
//}
//
//class MySubClass extends MyClass {
//    // method2 is not implemented
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MySubClass obj = new MySubClass();
//        obj.method1();
//    }
//}
//interface MyInterface {
//    void myMethod();
//}
//
//class MyClass implements MyInterface {
//    public void myMethod() {
//        System.out.println("My Method implementation");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyInterface obj = new MyClass();
//        obj.myMethod();
//    }
//}
//interface Interface1 {
//    void method1();
//}
//
//interface Interface2 {
//    void method2();
//}
//
//class MyClass implements Interface1, Interface2 {
//    public void method1() {
//        System.out.println("Method1 implementation");
//    }
//
//    public void method2() {
//        System.out.println("Method2 implementation");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        obj.method1();
//        obj.method2();
//    }
//}
//interface Interface1 {
//    void myMethod();
//}
//
//interface Interface2 {
//    void myMethod();
//}
//
//class MyClass implements Interface1, Interface2 {
//    public void myMethod() {
//        System.out.println("My Method implementation");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        obj.myMethod();
//    }
//}
//interface MyInterface {
//    default void myDefaultMethod() {
//        System.out.println("Default Method implementation");
//    }
//}
//
//class MyClass implements MyInterface {
//    // No need to override the default method
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        obj.myDefaultMethod();
//    }
//}
//interface ParentInterface {
//    void parentMethod();
//}
//
//interface ChildInterface extends ParentInterface {
//    void childMethod();
//}
//
//class MyClass implements ChildInterface {
//    public void parentMethod() {
//        System.out.println("Parent Method implementation");
//    }
//
//    public void childMethod() {
//        System.out.println("Child Method implementation");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        obj.parentMethod();
//        obj.childMethod();
//    }
//}
//public interface MyInterface {
//    int value = 10; // public static final by default
//    void myMethod();
//}
//
//class MyClass implements MyInterface {
//    public void myMethod() {
//        System.out.println("Interface Method implementation");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        System.out.println("Interface field value: " + MyInterface.value);
//        obj.myMethod();
//    }
//}
//interface MyInterface {
//    static final int value = 10;
//    void myMethod();
//}
//
//class MyClass implements MyInterface {
//    public void myMethod() {
//        System.out.println("Interface Method implementation");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        MyClass obj = new MyClass();
//        System.out.println("Interface static final variable value: " + MyInterface.value);
//        obj.myMethod();
//    }
//}
