//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class PDF_16{
//    public static void main(String[] args) {
//        // Creating an ArrayList of type String
//        ArrayList<String> stringList = new ArrayList<>();
//
//        // Adding 10 string elements to the ArrayList
//        for (int i = 1; i <= 10; i++) {
//            stringList.add("Element " + i);
//        }
//
//        // Adding an element to the ArrayList
//        stringList.add("New Element");
//
//        // Iterating through the ArrayList using Iterator object
//        Iterator<String> iterator = stringList.iterator();
//        System.out.println("Iterating through the ArrayList:");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        // Adding an element at a specific index
//        stringList.add(5, "Inserted Element");
//
//        // Removing an element from the ArrayList
//        stringList.remove("Element 3");
//
//        // Removing an element at a specific index
//        stringList.remove(4);
//
//        // Updating the element at a specific index
//        stringList.set(2, "Updated Element");
//
//        // Checking the element at a particular index
//        String elementAtIndex = stringList.get(2);
//        System.out.println("Element at index 2: " + elementAtIndex);
//
//        // Getting the element at a particular index
//        String specificElement = stringList.get(5);
//        System.out.println("Element at index 5: " + specificElement);
//
//        // Finding out the size of the ArrayList
//        int size = stringList.size();
//        System.out.println("Size of the ArrayList: " + size);
//
//        // Checking if a given element is present in the ArrayList
//        boolean isPresent = stringList.contains("Element 7");
//        System.out.println("Is 'Element 7' present: " + isPresent);
//
//        // Removing all elements of the ArrayList
//        stringList.clear();
//        System.out.println("All elements removed. Size of the ArrayList: " + stringList.size());
//    }
//}
//import java.util.HashMap;
//
//public class HashMapOperations {
//    public static void main(String[] args) {
//        // Creating a HashMap with at least 10 key-value pairs of Student ID and Name
//        HashMap<Integer, String> studentMap = new HashMap<>();
//        studentMap.put(101, "Alice");
//        studentMap.put(102, "Bob");
//        studentMap.put(103, "Charlie");
//        studentMap.put(104, "David");
//        studentMap.put(105, "Eve");
//        studentMap.put(106, "Frank");
//        studentMap.put(107, "Grace");
//        studentMap.put(108, "Hannah");
//        studentMap.put(109, "Ivy");
//        studentMap.put(110, "Jack");
//
//        // Inserting a key-value mapping into the map
//        studentMap.put(111, "Kim");
//
//        // Fetching the value of a key
//        String studentName = studentMap.get(103);
//        System.out.println("Student with ID 103: " + studentName);
//
//        // Creating a clone/copy of HashMap
//        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
//        System.out.println("Cloned Map: " + clonedMap);
//
//        // Checking if the given key is in the map
//        boolean hasKey = studentMap.containsKey(104);
//        System.out.println("Does key 104 exist? " + hasKey);
//
//        // Checking if the value is in the map
//        boolean hasValue = studentMap.containsValue("Eve");
//        System.out.println("Does value 'Eve' exist? " + hasValue);
//
//        // Checking if the map is empty
//        boolean isEmpty = studentMap.isEmpty();
//        System.out.println("Is the map empty? " + isEmpty);
//
//        // Printing the size of the map to the console
//        int size = studentMap.size();
//        System.out.println("Size of the map: " + size);
//
//        // Printing all the keys of the map to the console
//        System.out.println("Keys of the map: " + studentMap.keySet());
//
//        // Printing all the values of the map to the console
//        System.out.println("Values of the map: " + studentMap.values());
//
//        // Removing a specific key-value pair
//        studentMap.remove(109);
//        System.out.println("Map after removing key 109: " + studentMap);
//
//        // Copying all the elements of the map to another map
//        HashMap<Integer, String> newMap = new HashMap<>();
//        newMap.putAll(studentMap);
//        System.out.println("New map with all elements copied: " + newMap);
//    }
//}
//import java.util.HashSet;
//        import java.util.Iterator;
//
//public class HashSetOperations {
//    public static void main(String[] args) {
//        // Creating a HashSet with at least 10 elements of type String
//        HashSet<String> stringSet = new HashSet<>();
//        stringSet.add("Element1");
//        stringSet.add("Element2");
//        stringSet.add("Element3");
//        stringSet.add("Element4");
//        stringSet.add("Element5");
//        stringSet.add("Element6");
//        stringSet.add("Element7");
//        stringSet.add("Element8");
//        stringSet.add("Element9");
//        stringSet.add("Element10");
//
//        // Adding an element to the HashSet
//        stringSet.add("Element11");
//        System.out.println("HashSet after adding an element: " + stringSet);
//
//        // Iterating through the HashSet using an Iterator object
//        Iterator<String> iterator = stringSet.iterator();
//        System.out.println("Iterating through the HashSet:");
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        // Checking if an element is present in the HashSet
//        boolean containsElement = stringSet.contains("Element5");
//        System.out.println("Is 'Element5' present in the HashSet? " + containsElement);
//
//        // Removing an element from the HashSet
//        stringSet.remove("Element3");
//        System.out.println("HashSet after removing 'Element3': " + stringSet);
//
//        // Checking if the HashSet is empty
//        boolean isEmpty = stringSet.isEmpty();
//        System.out.println("Is the HashSet empty? " + isEmpty);
//
//        // Finding out the size of the HashSet
//        int size = stringSet.size();
//        System.out.println("Size of the HashSet: " + size);
//
//        // Converting the HashSet to an array and printing the elements
//        String[] array = stringSet.toArray(new String[0]);
//        System.out.println("Elements of the HashSet as an array:");
//        for (String element : array) {
//            System.out.println(element);
//        }
//
//        // Clearing all elements from the HashSet
//        stringSet.clear();
//        System.out.println("HashSet after clearing all elements: " + stringSet);
//    }
//}
