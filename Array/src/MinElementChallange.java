import java.util.Scanner;

public class MinElementChallange {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] enteredArray = readIntegers();
        System.out.println("Minimum Number: " + findMin(enteredArray));
    }

    public static int[] readIntegers() {
        System.out.println("Enter the number of elements Count");
        int count = scanner.nextInt();
        System.out.println("Enter the " + count + " elements");
        int[] enteredArray = new int[count];
        for (int i = 0; i < count; i++) {
            enteredArray[i] = scanner.nextInt();
        }
        return enteredArray;
    }

    public static int findMin(int[] array) {
        int minElem = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minElem > array[i]) {
                minElem = array[i];
            }
        }
        return minElem;
    }
}
