import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        int[] sortedArray = sortIntegers(myIntegers);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        System.out.println("Array Elements");
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        sortedArray = Arrays.copyOf(array, array.length);
        int largestElem = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
