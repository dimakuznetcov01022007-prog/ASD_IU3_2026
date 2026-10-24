package ru.bmstu.lab1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Task9Test {
    @Test
    void shouldCheckSorted() {
        int[] sorted = {1, 2, 3};
        boolean isSorted = true;
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] < sorted[i - 1]) { isSorted = false; break; }
        }
        assertTrue(isSorted);
    }
}