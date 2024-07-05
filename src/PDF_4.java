import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PDF_4 {

    // 1. Write a function to add integer values of an array
    public int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // 2. Write a function to calculate the average value of an array of integers
    public double averageArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (double) sum / array.length;
    }

    // 3. Write a program to find the index of an array element
    public int findIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // 4. Write a function to test if array contains a specific value
    public boolean containsValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    // 5. Write a function to remove a specific element from an array
    public int[] removeElement(int[] array, int element) {
        int count = 0;
        for (int value : array) {
            if (value == element) {
                count++;
            }
        }

        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int value : array) {
            if (value != element) {
                newArray[index++] = value;
            }
        }

        return newArray;
    }

    // 6. Write a function to copy an array to another array
    public int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    // 7. Write a function to insert an element at a specific position in the array
    public int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = element;
            } else {
                newArray[i] = array[j++];
            }
        }
        return newArray;
    }

    // 8. Write a function to find the minimum and maximum value of an array
    public int[] minMaxArray(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        return new int[]{min, max};
    }

    // 9. Write a function to reverse an array of integer values
    public void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // 10. Write a function to find the duplicate values of an array
    public Set<Integer> findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int value : array) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }
        return duplicates;
    }

    // 11. Write a program to find the common values between two arrays
    public Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int value : array1) {
            set1.add(value);
        }

        for (int value : array2) {
            if (set1.contains(value)) {
                common.add(value);
            }
        }

        return common;
    }

    // 12. Write a method to remove duplicate elements from an array
    public int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }
        int[] newArray = new int[set.size()];
        int i = 0;
        for (int value : set) {
            newArray[i++] = value;
        }
        return newArray;
    }

    // 13. Write a method to find the second largest number in an array
    public int secondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > first) {
                second = first;
                first = value;
            } else if (value > second && value != first) {
                second = value;
            }
        }

        return second;
    }

    // 14. Write a method to find the second largest number in an array (Duplicate task)
    // Use the same solution as above

    // 15. Write a method to find number of even numbers and odd numbers in an array
    public int[] countEvenOdd(int[] array) {
        int countEven = 0;
        int countOdd = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        return new int[]{countEven, countOdd};
    }

    // 16. Write a function to get the difference of largest and smallest value
    public int differenceMaxMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int value : array) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        return max - min;
    }

    // 17. Write a method to verify if the array contains two specified elements (12, 23)
    public boolean containsElements(int[] array, int elem1, int elem2) {
        boolean foundElem1 = false;
        boolean foundElem2 = false;

        for (int value : array) {
            if (value == elem1) {
                foundElem1 = true;
            }
            if (value == elem2) {
                foundElem2 = true;
            }
            if (foundElem1 && foundElem2) {
                return true;
            }
        }

        return false;
    }

    // 18. Write a program to remove the duplicate elements and return the new array (Duplicate task)
    // Use the same solution as task 12

    // 19. Write a function to find the missing number of sorted array of 1 to 100
    public int findMissingNumber(int[] array) {
        int n = 100;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int value : array) {
            arraySum += value;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
       PDF_4 tasks = new PDF_4();

        // Test data
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayWithDuplicates = {1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 9};
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] arrayMissing = {1, 2, 3, 5, 6, 7, 8, 9, 10}; // Missing number is 4

//        // Test cases
        System.out.println("Sum of array: " + tasks.sumArray(array));
        System.out.println("Average of array: " + tasks.averageArray(array));
        System.out.println("Index of element 5: " + tasks.findIndex(array, 5));
        System.out.println("Contains value 5: " + tasks.containsValue(array, 5));
        System.out.println("Array after removing element 5: " + java.util.Arrays.toString(tasks.removeElement(array, 5)));
        System.out.println("Copied array: " + java.util.Arrays.toString(tasks.copyArray(array)));
        System.out.println("Array after inserting element 11 at position 5: " + java.util.Arrays.toString(tasks.insertElement(array, 11, 5)));
        System.out.println("Min and Max of array: " + java.util.Arrays.toString(tasks.minMaxArray(array)));
        tasks.reverseArray(array);

    }
}
