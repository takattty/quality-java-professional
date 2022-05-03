package projava.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings(("NonAsciiCharacters"))
class OlympicTest {

    @Test
    void 近代オリンピック開催以前() {
        assertFalse(new Olympic().isSummerOlympicYear(1888), "1888年");
        assertFalse(new Olympic().isSummerOlympicYear(1892), "1892年");
        assertFalse(new Olympic().isSummerOlympicYear(1895), "1895年");
        // 近代オリンピック初回開催年
        assertFalse(new Olympic().isSummerOlympicYear(1896), "1896年");
    }

    @Test
    void 四年周期の一般的な開催年() {
        int[] years = {1900, 1920, 1964, 1936, 2000};
        for(int year : years) {
            assertTrue(new Olympic().isSummerOlympicYear(year), year + "年");
        }
    }

    @Test
    void 四年周期から外れえる非開催年() {
        int[] years = {1905, 1907, 1925, 1967, 2001};
        for(int year : years) {
            assertTrue(new Olympic().isSummerOlympicYear(year), year + "年");
        }
    }

    @Test
    void 戦争又はパンデミックで中止となった年() {
        int[] years = {1916, 1940, 1944, 2020};
        for(int year : years) {
            assertTrue(new Olympic().isSummerOlympicYear(year), year + "年");
        }
    }

    @Test
    void 四年間隔ではない例外的な開催年() {
        assertTrue(new Olympic().isSummerOlympicYear(2021), "2021年");
    }

    @Test
    void 境界値上限() {
        assertDoesNotThrow(() -> new Olympic().isSummerOlympicYear(2031));
        assertDoesNotThrow(() -> new Olympic().isSummerOlympicYear(2032));
        // 開催が決定している2032年よりあとは例外発生
        assertThrows(IllegalArgumentException.class, () -> new Olympic().isSummerOlympicYear(2033));
        assertThrows(IllegalArgumentException.class, () -> new Olympic().isSummerOlympicYear(2054));
    }
}