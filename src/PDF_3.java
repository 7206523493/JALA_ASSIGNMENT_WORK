//import java.util.Scanner;
//
//public class PDF_3 {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Bright IT Career");
//        }
//    }
//}
//public class PrintNumbers {
//    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 20) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}
//public class EqualNotEqual {
//    public static void main(String[] args) {
//        int a = 10, b = 5;
//        System.out.println("a == b: " + (a == b));
//        System.out.println("a != b: " + (a != b));
//    }
//}
//public class OddEvenNumbers {
//    public static void main(String[] args) {
//        System.out.println("Even numbers:");
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("Odd numbers:");
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}
//
//public class LargestNumber {
//    public static void main(String[] args) {
//        int a = 10, b = 20, c = 30;
//        int largest;
//
//        if (a >= b && a >= c) {
//            largest = a;
//        } else if (b >= a && b >= c) {
//            largest = b;
//        } else {
//            largest = c;
//        }
//
//        System.out.println("The largest number is: " + largest);
//    }
//}
//public class EvenNumbers {
//    public static void main(String[] args) {
//        int i = 10;
//        while (i <= 100) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//    }
//}
//public class PrintNumbersDoWhile {
//    public static void main(String[] args) {
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);
//    }
//}
//import java.util.Scanner;
//
//public class ArmstrongNumber {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int originalNumber = number;
//        int result = 0;
//        int n = 0;
//
//        while (originalNumber != 0) {
//            originalNumber /= 10;
//            ++n;
//        }
//
//        originalNumber = number;
//
//        while (originalNumber != 0) {
//            int remainder = originalNumber % 10;
//            result += Math.pow(remainder, n);
//            originalNumber /= 10;
//        }
//
//        if (result == number) {
//            System.out.println(number + " is an Armstrong number.");
//        } else {
//            System.out.println(number + " is not an Armstrong number.");
//        }
//
//        scanner.close();
//    }
//}
//import java.util.Scanner;
//
//public class PrimeNumber {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        boolean isPrime = true;
//
//        for (int i = 2; i <= number / 2; i++) {
//            if (number % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if (isPrime && number > 1) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }
//
//        scanner.close();
//    }
//}
//import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        int originalNumber = number;
//        int reverse = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            reverse = reverse * 10 + digit;
//            number /= 10;
//        }
//
//        if (originalNumber == reverse) {
//            System.out.println(originalNumber + " is a palindrome.");
//        } else {
//            System.out.println(originalNumber + " is not a palindrome.");
//        }
//
//        scanner.close();
//    }
//}
//import java.util.Scanner;
//
//public class EvenOddSwitch {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        switch (number % 2) {
//            case 0:
//                System.out.println(number + " is an even number.");
//                break;
//            case 1:
//                System.out.println(number + " is an odd number.");
//                break;
//        }
//
//        scanner.close();
//    }
//}
//import java.util.Scanner;
//
//public class GenderSwitch {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter gender (M/F): ");
//        char gender = scanner.next().charAt(0);
//
//        switch (gender) {
//            case 'M':
//                System.out.println("Male");
//                break;
//            case 'F':
//                System.out.println("Female");
//                break;
//            default:
//                System.out.println("Invalid input");
//                break;
//        }
//
//        scanner.close();
//    }
//}
//
//public class LargestNumberIfElse {
//    public static void main(String[] args) {
//        int num1 = 10, num2 = 20, num3 = 30;
//
//        if (num1 >= num2 && num1 >= num3) {
//            System.out.println("The largest number is: " + num1);
//        } else if (num2 >= num1 && num2 >= num3) {
//            System.out.println("The largest number is: " + num2);
//        } else {
//            System.out.println("The largest number is: " + num3);
//        }
//    }
//}
