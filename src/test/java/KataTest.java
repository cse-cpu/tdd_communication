import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    @DisplayName("Test the sum of all the numbers in a given array")

    public void sumAllTheNumbers() {
        // ARRANGE
        Kata kata = new Kata();

        int[] arr1 = null;
        int[] arr2 = {1};
        int[] arr3 = {1, 2};
        int[] arr4 = {1, 2, 3};
        int[] arr5 = {5, 2, 6, 10, 22};

        // ACT
        int total1 = kata.sumAllNumbers(arr1);
        int total2 = kata.sumAllNumbers(arr2);
        int total3 = kata.sumAllNumbers(arr3);
        int total4 = kata.sumAllNumbers(arr4);
        int total5 = kata.sumAllNumbers(arr5);

        // ASSERT
        assertEquals(0, total1);
        assertEquals(0, total2);
        assertEquals(0, total3);
        assertEquals(2, total4);
        assertEquals(21, total5);
    }
}