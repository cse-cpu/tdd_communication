import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ASCIITest {

    @Test
    @DisplayName("Test for the sum total of all the ASCII values of characters in a string")
    void calculateASCII() {
        // ARRANGE
        ASCII ascii = new ASCII();
        String string1 = "northcoders";
        String string2 = "Northcoders"; // should return 1163
        String string3 = "a";
        String string4 = "501";
        String string5 = "";

        // ACT
        int result1 = ascii.calculateASCII(string1);
        int result2 = ascii.calculateASCII(string2);
        int result3 = ascii.calculateASCII(string3);
        int result4 = ascii.calculateASCII(string4);
        int result5 = ascii.calculateASCII(string5);

        // ASSERTS
        assertAll(
                () -> assertEquals(1195, result1),
                () -> assertEquals(1163, result2),
                () -> assertEquals(97, result3),
                () -> assertEquals(150, result4),
                () -> assertEquals(0, result5)
        );
    }
}