package Algo.ValidateSequence;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> array1 = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence1 = List.of(1, 6, -1, 10);
        // Expected: true

        List<Integer> array2 = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence2 = List.of(5, 1, 22, 25, 6, -1, 8, 10, 12);
        // Expected: False

        List<Integer> array3 = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence3 = List.of(1, 6, -1, -1);
        // Expected: False

        System.out.println("Solution 1: " + ValidateSequence.ValidateSequence1(array1, sequence1));
        System.out.println("Solution 2: " + ValidateSequence.ValidateSequence2(array1, sequence1));
    }
}
