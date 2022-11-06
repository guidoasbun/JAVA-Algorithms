package Algo.SortedSquaredArray;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 5, 6, 8, 9};
        // solution = [1, 4, 9, 25, 36, 64, 81]

        int[] array2 = new int[]{-10, -5, 0, 5, 10};
        // solution = [0, 25, 25, 100, 100]

        int[] solution1 = SortedSquaredArray.sortedSquaredArray1(array2);
        System.out.println(Arrays.toString(solution1));

        int[] solution2 = SortedSquaredArray.sortedSquaredArray2(array2);
        System.out.println(Arrays.toString(solution2));
    }
}
