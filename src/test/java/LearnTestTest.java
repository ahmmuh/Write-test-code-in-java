import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearnTestTest {
LearnTest learnTest = new LearnTest();
    @Test
    void getAverage() {
        assertEquals(learnTest.getAt(2));
    }

    private void assertEquals(double v) {
    }

    @Test
    void findPositions() {
    }

    @Test
    void appendLast() {
    assertEquals(learnTest.appendLast(2));
    }

    @Test
    void insertAt() {
    assertEquals(learnTest.insertAt(2,4));
    }

    @Test
    void getAt() {
        assertEquals(learnTest.getAt(2));
    }

    @Test
    void setAt() {
        assertEquals(learnTest.setAt(2,33));
    }

    @Test
    void deleteAt() {
        assertEquals(learnTest.deleteAt(2));
    }
}