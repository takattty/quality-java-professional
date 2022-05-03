package projava.junit;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void add() {
        // assertEquals(期待値, 実際の値[, テスト内容を表すメッセージ]);
        assertEquals(4, new Calc().add(2, 2), "2 + 2 = 4");
        assertEquals(6, new Calc().add(2, 4), "2 + 4 = 8");

        assertAll(() -> assertEquals(4, new Calc().add(2, 2), "2 + 2 = 4"),
                  () -> assertEquals(6, new Calc().add(2, 4), "2 + 4 = 6"));
    }
}