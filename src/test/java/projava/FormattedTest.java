package projava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormattedTest {

    @Test
    void format() {
        Formatted instance = new Formatted("test%s");
        String result = instance.format(120);
        assertEquals("120", result);
    }
}