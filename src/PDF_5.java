public class PDF_5 {

    // 2 static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // 2 instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // 2 static methods
    public static void staticMethod1() {
        System.out.println("Static Method 1");
        // Call instance method in static method
        // Create an instance to call instance method
        PDF_5 example = new PDF_5();
        example.instanceMethod1();
        System.out.println("Instance variable in static method: " + example.instanceVar1 + ", " + example.instanceVar2);
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2");
        // Call instance method in static method
        // Create an instance to call instance method
       PDF_5 example = new PDF_5();
        example.instanceMethod2();
        System.out.println("Instance variable in static method: " + example.instanceVar1 + ", " + example.instanceVar2);
    }

    // 2 instance methods
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
        // Print static variables in instance method
        System.out.println("Static variable in instance method: " + staticVar1 + ", " + staticVar2);
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2");
        // Print static variables in instance method
        System.out.println("Static variable in instance method: " + staticVar1 + ", " + staticVar2);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance to call instance methods
        PDF_5 example = new PDF_5();

        // Print all the static and instance variables in the main method
        System.out.println("Static variables: " + staticVar1 + ", " + staticVar2);
        System.out.println("Instance variables: " + example.instanceVar1 + ", " + example.instanceVar2);

        // Call static methods
        staticMethod1();
        staticMethod2();

        // Call instance methods
        example.instanceMethod1();
        example.instanceMethod2();
    }
}

