import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reversedArray(array);
        System.out.println(Arrays.toString(array));

    }

    public static void reversedArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
