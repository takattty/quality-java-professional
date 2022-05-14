package projava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("ALL")
class FormattedTest {

    @Test
    void 数値のformat処理 () {
        Formatted instance = new Formatted("test%s");
        String result = instance.format(120);
        assertEquals("120", result);
    }

    @Test
    void 四桁以上の数値のformat処理() {
        Formatted instance  = new Formatted("test%s");
        String result = instance.format(1200);
        assertEquals("1,200", result);
    }

    @Test
    void 文字列のformat処理() {
        Formatted instance = new Formatted("test%d");
        String result = instance.format(120);
        assertNotEquals("test120", result);
    }
}