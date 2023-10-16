import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilTest {

    @Test
    public void testReverseString() {
        // Given a string
        String string = "aBc";

        // When the string is reversed
        String result = Util.reverseString(string);

        // Then the result should be the reversed string
        assertEquals("cBa", result);
    }

    @Test
    public void testCapitalizeString() {
        // Given a string
        String string = "aBc";

        // When the string is capitalized
        String result = Util.capitalizeString(string);

        // Then the result should be the capitalized string
        assertEquals("ABC", result);
    }

    @Test
    public void testLowercaseString() {
        // Given a string
        String string = "aBc";

        // When the string is lowercased
        String result = Util.lowercaseString(string);

        // Then the result should be the lowercased string
        assertEquals("abc", result);
    }
}
