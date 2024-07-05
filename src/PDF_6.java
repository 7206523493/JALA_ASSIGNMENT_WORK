public class PDF_6 {

    public static void main(String[] args) {
        // 1. Different ways creating a string
        String str1 = "Hello";
        String str2 = new String("World");
        char[] charArray = {'J', 'A', 'V', 'A'};
        String str3 = new String(charArray);
        String str4 = String.valueOf(charArray);
        System.out.println("Different ways to create strings:");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        // 2. Concatenating two strings using + operator
        String concatenatedString = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concatenatedString);

        // 3. Finding the length of the string
        System.out.println("\nLength of String: " + concatenatedString.length());

        // 4. Extract a string using Substring
        String substring = concatenatedString.substring(6);
        System.out.println("\nSubstring: " + substring);

        // 5. Searching in strings using indexOf()
        int indexOfWorld = concatenatedString.indexOf("World");
        System.out.println("\nIndex of 'World': " + indexOfWorld);

        // 6. Matching a String Against a Regular Expression With matches()
        boolean matches = concatenatedString.matches(".*World.*");
        System.out.println("\nMatches '.*World.*': " + matches);

        // 7. Comparing strings using the methods equals(), equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
        String compareStr1 = "Hello";
        String compareStr2 = "hello";
        System.out.println("\nEquals: " + compareStr1.equals(compareStr2));
        System.out.println("Equals Ignore Case: " + compareStr1.equalsIgnoreCase(compareStr2));
        System.out.println("Starts With 'He': " + compareStr1.startsWith("He"));
        System.out.println("Ends With 'lo': " + compareStr1.endsWith("lo"));
        System.out.println("Compare To: " + compareStr1.compareTo(compareStr2));

        // 8. Trimming strings with trim()
        String trimStr = "   Hello World   ";
        System.out.println("\nTrimmed String: '" + trimStr.trim() + "'");

        // 9. Replacing characters in strings with replace()
        String replacedString = concatenatedString.replace("World", "JAVA");
        System.out.println("\nReplaced String: " + replacedString);

        // 10. Splitting strings with split()
        String[] splitString = concatenatedString.split(" ");
        System.out.println("\nSplitting Strings:");
        for (String str : splitString) {
            System.out.println(str);
        }

        // 11. Converting Numbers to Strings with valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("\nNumber to String: " + numStr);

        // 12. Converting integer objects to Strings
        Integer integerObject = 200;
        String intObjStr = integerObject.toString();
        System.out.println("Integer Object to String: " + intObjStr);

        // 13. Converting to uppercase and lowercase
        String lowerStr = "hello";
        String upperStr = "WORLD";
        System.out.println("\nLower to Upper: " + lowerStr.toUpperCase());
        System.out.println("Upper to Lower: " + upperStr.toLowerCase());
    }
}
