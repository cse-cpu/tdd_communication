import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeanTest {

    @Test
    @DisplayName("Test for mean value of an array of numbers")
    void meanValue() {
        // ARRANGE
        Mean mean = new Mean();
        double[] arr1 = {1, 2, 3 };
        double[] arr2 = { 40, 16, 5, 8};

        // ACT
        double mean1 = mean.meanValue(arr1);
        double mean2 = mean.meanValue(arr2);

        // ASSERTS
        assertEquals(2, mean1);
        assertEquals(17.25, mean2);

    }
}