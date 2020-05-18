import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualizeArrayTest {

    @Test
    void equalArrayShouldReturnZero() {
        int[] array = {2,2,2};
        assertEquals(0, EqualizeArray.equalizeArray(array));
    }
    @Test
    void arrayWithTwoDifferentNumbersShouldReturnOne() {
        int[] array = {2,3};
        assertEquals(1, EqualizeArray.equalizeArray(array));
    }

    @Test
    void arrayWithTwoDifferentNumbersAndLenghtThreeShouldReturnOne() {
        int[] array = {2,3};
        assertEquals(1, EqualizeArray.equalizeArray(array));
    }
}