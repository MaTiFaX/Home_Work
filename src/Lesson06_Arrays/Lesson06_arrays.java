package Lesson06_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;

public class Lesson06_arrays {
    public static void main(String[] args) throws Exception {
        System.out.println("Task 1: beginning \n");
        int[] massive = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(massive));

        System.out.println("\nTask 2: beginning\n");
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverse = new int[10];

        System.arraycopy(array2, 0, reverse, 0, 10);
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < reverse.length / 2; i++) {
            int temp = reverse[i];
            reverse[i] = reverse[array2.length - 1 - i];
            reverse[reverse.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("\nTask 3: beginning\n");
        int[] array = {1, 2, 3, 4, 5};
        swap(array, 0, 1);

        int[] array1 = new int[]{2, 3, 4, 5, 6, 10};
        swap(array1, 2, 5);


    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indexA " + indexA + " and " + indexB);

        for (int i = 0; i < 1; i++) {
            int arr = array[indexA];
            array[indexA] = array[indexB];
            array[indexB] = arr;
        }
        System.out.println(" Result: " + Arrays.toString(array) + "\n");
    }

}



