//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class PDF_14 {
//    public static void main(String[] args) {
//        int result = 10 / 0; // This will generate an ArithmeticException
//        System.out.println(result);
//    }
//}
//public class PDF_14 {
//    public static void main(String[] args) {
//        try {
//            int result = 10 / 0; // This will generate an ArithmeticException
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException caught: " + e.getMessage());
//        }
//    }
//}
//public class MethodThrowsException {
//    public static void riskyMethod() throws Exception {
//        throw new Exception("Exception thrown from riskyMethod");
//    }
//
//    public static void main(String[] args) throws Exception {
//        riskyMethod(); // No try block here
//    }
//}
//public class MultipleCatchBlocks {
//    public static void main(String[] args) {
//        try {
//            int[] array = new int[5];
//            array[10] = 30 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException caught: " + e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
//        }
//    }
//}
//public class CustomMessageException {
//    public static void main(String[] args) {
//        try {
//            throw new Exception("This is a custom exception message");
//        } catch (Exception e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//    }
//}
//class MyCustomException extends Exception {
//    public MyCustomException(String message) {
//        super(message);
//    }
//}
//
//public class CustomExceptionExample {
//    public static void main(String[] args) {
//        try {
//            throw new MyCustomException("This is my custom exception");
//        } catch (MyCustomException e) {
//            System.out.println("MyCustomException caught: " + e.getMessage());
//        }
//    }
//}
//public class FinallyBlockExample {
//    public static void main(String[] args) {
//        try {
//            int result = 10 / 0;
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException caught: " + e.getMessage());
//        } finally {
//            System.out.println("This is the finally block");
//        }
//    }
//}
//public class GenerateArithmeticException {
//    public static void main(String[] args) {
//        int result = 10 / 0; // This will generate an ArithmeticException
//        System.out.println(result);
//    }
//}
//public class GenerateClassNotFoundException {
//    public static void main(String[] args) {
//        try {
//            Class.forName("NonExistentClass"); // This will generate a ClassNotFoundException
//        } catch (ClassNotFoundException e) {
//            System.out.println("ClassNotFoundException caught: " + e.getMessage());
//        }
//    }
//}
//import java.io.File;
//        import java.io.FileInputStream;
//        import java.io.FileNotFoundException;
//
//public class GenerateFileNotFoundException {
//    public static void main(String[] args) {
//        try {
//            File file = new File("nonexistentfile.txt");
//            FileInputStream fis = new FileInputStream(file); // This will generate a FileNotFoundException
//        } catch (FileNotFoundException e) {
//            System.out.println("FileNotFoundException caught: " + e.getMessage());
//        }
//    }
//}
//import java.io.BufferedReader;
//        import java.io.FileReader;
//        import java.io.IOException;
//
//public class GenerateIOException {
//    public static void main(String[] args) {
//        try (BufferedReader br = new BufferedReader(new FileReader("nonexistentfile.txt"))) {
//            br.readLine(); // This will generate an IOException
//        } catch (IOException e) {
//            System.out.println("IOException caught: " + e.getMessage());
//        }
//    }
//}
//import java.lang.reflect.Field;
//
//public class GenerateNoSuchFieldException {
//    public static void main(String[] args) {
//        try {
//            Field field = String.class.getField("nonexistentField"); // This will generate a NoSuchFieldException
//        } catch (NoSuchFieldException e) {
//            System.out.println("NoSuchFieldException caught: " + e.getMessage());
//        }
//    }
//}
//import java.lang.reflect.Method;
//
//public class GenerateNoSuchMethodException {
//    public static void main(String[] args) {
//        try {
//            Method method = String.class.getMethod("nonexistentMethod"); // This will generate a NoSuchMethodException
//        } catch (NoSuchMethodException e) {
//            System.out.println("NoSuchMethodException caught: " + e.getMessage());
//        }
//    }
//}
//
//public class GenerateNullPointerException {
//    public static void main(String[] args) {
//        String str = null;
//        System.out.println(str.length()); // This will generate a NullPointerException
//    }
//}
//public class GenerateNumberFormatException {
//    public static void main(String[] args) {
//        String str = "abc";
//        int num = Integer.parseInt(str); // This will generate a NumberFormatException
//        System.out.println(num);
//    }
//}
//public class GenerateStringIndexOutOfBoundsException {
//    public static void main(String[] args) {
//        String str = "hello";
//        char ch = str.charAt(10); // This will generate a StringIndexOutOfBoundsException
//        System.out.println(ch);
//    }
//}
//
//public class GenerateSQLException {
//    public static void main(String[] args) {
//        try {
//            Connection conn = DriverManager.getConnection("jdbc:invalid:url", "user", "password"); // This will generate a SQLException
//        } catch (SQLException e) {
//            System.out.println("SQLException caught: " + e.getMessage());
//        }
//    }
//}
