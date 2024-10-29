import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodTest {

    @Test
    @DisplayName("Test to determine mood from array of moods")
    void moodReport() {
        // ARRANGE
        Mood mood = new Mood();
        String[] stringArray1 = {"LIKE", "DISLIKE" }; // should return NEUTRAL
        String[] stringArray2 = {"LIKE"}; // should return LIKE
        String[] stringArray3 = {"DISLIKE", "DISLIKE"}; // should return NEUTRAL
        String[] stringArray4 = {}; // should return NEUTRAL
        String[] stringArray5 = {"DISLIKE", "DISLIKE", "LIKE"}; // should return NEUTRAL



        // ACT
        String result1 = mood.moodReport(stringArray1);
        String result2 = mood.moodReport(stringArray2);
        String result3 = mood.moodReport(stringArray5);
        String result4 = mood.moodReport(stringArray4);
        String result5 = mood.moodReport(stringArray5);

        // ASSERTS
        assertAll(
                () -> assertEquals("NEUTRAL", result1),
                () -> assertEquals("LIKE", result2),
                () -> assertEquals("NEUTRAL", result3),
                () -> assertEquals("NEUTRAL", result5),
                () -> assertEquals("LIKE", result5)
        );
    }
}