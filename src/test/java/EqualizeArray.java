import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class EqualizeArray {
    static int equalizeArray(int[] arr) {
        Arrays.sort(arr);
        //int previousNumber = 0;
        int currentNumber = 0;
        int recordCounter = 0;
        int currentCounter = 0;
        //int recordNumber = 0;
        for(int i =0; i < arr.length; i++) {
            if(arr[i] != currentNumber) {
                if (currentCounter > recordCounter) {
                    recordCounter = currentCounter;
          //          recordNumber = currentNumber;
                }
            //    previousNumber = currentNumber;
                currentNumber = arr[i];
                currentCounter = 0;
            }
            currentCounter++;
        }
        return arr.length - Math.max(recordCounter, currentCounter);
    }
}
