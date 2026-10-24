package ru.bmstu.lab1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class Task4Test {
    @Test
    void shouldFindAllIndexes() {
        int[] arr = {1, 2, 1};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) sb.append(i).append(" ");
        }
        assertTrue(sb.toString().contains("0 2"));
    }
}