//class PrivateClass {
//    private int privateField = 10;
//
//    private void privateMethod() {
//        System.out.println("Private method called");
//    }
//
//    public static void main(String[] args) {
//        PrivateClass obj = new PrivateClass();
//        System.out.println("Private Field: " + obj.privateField);
//        obj.privateMethod();
//    }
//}
//
//class SubClassPrivate extends PrivateClass {
//    public void tryAccess() {
//        // The following lines will cause compilation errors because private members are not accessible.
//        // System.out.println("Private Field: " + privateField);
//        // privateMethod();
//    }
//}
//class DefaultClass {
//    int defaultField = 20;
//
//    void defaultMethod() {
//        System.out.println("Default method called");
//    }
//}
//
//public class DefaultAccessTest {
//    public static void main(String[] args) {
//        DefaultClass obj = new DefaultClass();
//        System.out.println("Default Field: " + obj.defaultField);
//        obj.defaultMethod();
//    }
//}
//package package1;
//
//public class ProtectedClass {
//    protected int protectedField = 30;
//
//    protected void protectedMethod() {
//        System.out.println("Protected method called");
//    }
//}
//
//package package1;
//
//public class ProtectedAccessTest {
//    public static void main(String[] args) {
//        ProtectedClass obj = new ProtectedClass();
//        System.out.println("Protected Field: " + obj.protectedField);
//        obj.protectedMethod();
//    }
//}
//
//package package2;
//
//        import package1.ProtectedClass;
//
//public class SubClassProtected extends ProtectedClass {
//    public void accessProtected() {
//        System.out.println("Protected Field: " + protectedField);
//        protectedMethod();
//    }
//}
//
//package package2;
//
//        import package1.ProtectedClass;
//
//public class ProtectedAccessDifferentPackage {
//    public static void main(String[] args) {
//        ProtectedClass obj = new ProtectedClass();
//        // The following lines will cause compilation errors because protected members are not accessible outside the package without inheritance.
//        // System.out.println("Protected Field: " + obj.protectedField);
//        // obj.protectedMethod();
//    }
//}
//package package1;
//
//public class PublicClass {
//    public int publicField = 40;
//
//    public void publicMethod() {
//        System.out.println("Public method called");
//    }
//}
//
//package package1;
//
//public class PublicAccessTest {
//    public static void main(String[] args) {
//        PublicClass obj = new PublicClass();
//        System.out.println("Public Field: " + obj.publicField);
//        obj.publicMethod();
//    }
//}
//
//package package2;
//
//        import package1.PublicClass;
//
//public class PublicAccessDifferentPackage {
//    public static void main(String[] args) {
//        PublicClass obj = new PublicClass();
//        System.out.println("Public Field: " + obj.publicField);
//        obj.publicMethod();
//    }
//}
