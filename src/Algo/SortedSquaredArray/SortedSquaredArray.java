package Algo.SortedSquaredArray;

import java.util.Arrays;

public class SortedSquaredArray {
    public static int[] sortedSquaredArray1(int[] array) {
        int[] solution = new int[array.length];
        int index = 0;
        for (int value: array) {
            solution[index] = (int) Math.pow(value, 2);
            index++;
        }
        Arrays.sort(solution);
        return solution;
    }

    public static int[] sortedSquaredArray2(int[] array) {
        int arrayLength = array.length;
        int[] output = new int[arrayLength];
        int startPointer = 0;
        int endPointer = arrayLength - 1;

        for (int index = arrayLength - 1; index >= 0; index--) {
            int startValue = array[startPointer];
            int endValue = array[endPointer];

            if(Math.abs(startValue) > Math.abs(endValue)) {
                output[index] = (int) Math.pow(startValue,2);
                startPointer++;
            } else {
                output[index] = (int) Math.pow(endValue,2);
                endPointer--;
            }
        }
        return output;
    }
}
