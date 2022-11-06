package Algo.ValidateSequence;

import java.util.List;
import java.util.Objects;

public class ValidateSequence {
    public static boolean ValidateSequence1(List<Integer> array, List<Integer> sequence) {
        int arraySize = array.size();
        int sequenceSize = sequence.size();
        int arrayPointer = 0;
        int sequencePointer = 0;

        while(arrayPointer < arraySize && sequencePointer < sequenceSize) {
            if(Objects.equals(array.get(arrayPointer), sequence.get(sequencePointer))) {
                sequencePointer++;
            }
            arrayPointer++;
        }
        return sequencePointer == sequenceSize;
    }

    public static boolean ValidateSequence2(List<Integer> array, List<Integer> sequence) {
        int sequenceSize = sequence.size();
        int sequencePointer = 0;

        for (int element : array) {
            if (sequencePointer == sequenceSize) {
                break;
            }
            if (sequence.get(sequencePointer).equals(element))
            {
                sequencePointer++;
            }
        }
        return sequencePointer == sequenceSize;
    }
}
