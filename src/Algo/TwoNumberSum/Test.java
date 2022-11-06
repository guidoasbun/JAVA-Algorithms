package Algo.TwoNumberSum;


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum1 = 10;
        // Expected result = [11, -1]

        int[] array2 = new int[]{4, 6};
        int targetSum2 = 10;
        // Expected result = [4,6]

        int[] array3 = new int[]{-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum3 = 164;
        // Expected result = []

        int[] solution1 = TwoNumberSum.TwoNumberSum1(array1, targetSum1);
        System.out.println("Solution1: " + Arrays.toString(solution1));

        int[] solution2 = TwoNumberSum.TwoNumberSum2(array1, targetSum1);
        System.out.println("Solution2: " + Arrays.toString(solution2));

        int[] solution3 = TwoNumberSum.TwoNumberSum3(array1, targetSum1);
        System.out.println("Solution3: " + Arrays.toString(solution3));
    }
}
