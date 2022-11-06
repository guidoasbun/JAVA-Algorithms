package Algo.TwoNumberSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    // O(n^2)
    public static int[] TwoNumberSum1(int[] array, int targetSum) {
    int arrayLength = array.length;
        for (int i = 0; i < arrayLength ; i++) {
            int firstNumber = array[i];
            for (int j = i + 1; j < arrayLength; j++) {
                int secondNumber = array[j];
                if (firstNumber + secondNumber == targetSum) {
                    return new int[] {firstNumber, secondNumber};
                }
            }
        }
        return new int[0];
    }

    public static int[] TwoNumberSum2(int[] array, int targetSum) {
        // O(n)
        Map<Integer, Boolean> hashMap = new HashMap<>();
        for(int elem : array)
        {
            int potentialMath = targetSum - elem;
            if(hashMap.containsKey(potentialMath)) {
                return new int[] {potentialMath, elem};
            }
            else {
                hashMap.put(elem, true);
            }
        }
        return new int[0];
    }

    public static int[] TwoNumberSum3(int[] array, int targetSum) {
        // O(nlog(n))
        Arrays.sort(array);
        int leftPointer = 0;
        int rightPointer = array.length -1;

        while (leftPointer < rightPointer)
        {
            int currentSum = array[leftPointer] + array[rightPointer];
            if (currentSum == targetSum) {
                return new int[]{array[rightPointer], array[leftPointer]};
            } else if (currentSum < targetSum) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return new int[0];
    }
}
