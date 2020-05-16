import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingValleysTest {

    @Test
    void emptyStringShouldReturnZero() {
        assertEquals(0, CountingValleys.countingValleys(0, ""));
    }


    @Test
    void downUpShouldReturnOneValley() {
        assertEquals(1, CountingValleys.countingValleys(2, "DU"));
    }
    @Test
    void downDownUpUpShouldReturnOneValley() {
        assertEquals(1, CountingValleys.countingValleys(4, "DDUU"));
    }

    @Test
    void downUpDownUpShouldReturnTwoValley() {
        assertEquals(2, CountingValleys.countingValleys(4, "DUDU"));
    }

    @Test
    void upDownShouldReturnZeroValley() {
        assertEquals(0, CountingValleys.countingValleys(2, "UD"));
    }

}