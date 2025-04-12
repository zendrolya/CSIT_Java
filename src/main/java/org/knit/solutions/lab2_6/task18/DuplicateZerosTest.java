package org.knit.solutions.lab2_6.task18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateZerosTest {
    @Test
    public void testExample1() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        new DuplicateZeros().duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

    @Test
    public void testExample2() {
        int[] arr = {1, 2, 3};
        new DuplicateZeros().duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    public void testAllZeros() {
        int[] arr = {0, 0, 0, 0};
        new DuplicateZeros().duplicateZeros(arr);
        assertArrayEquals(new int[]{0, 0, 0, 0}, arr);
    }

    @Test
    public void testNoZeros() {
        int[] arr = {1, 2, 3, 4};
        new DuplicateZeros().duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }

    @Test
    public void testEdgeZeroAtEnd() {
        int[] arr = {1, 2, 3, 0};
        new DuplicateZeros().duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3, 0}, arr);
    }

    @Test
    public void testPerformance() {
        int[] arr = new int[10_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 5 == 0 ? 0 : 1;
        }

        long start = System.currentTimeMillis();
        new DuplicateZeros().duplicateZeros(arr);
        long end = System.currentTimeMillis();

        System.out.println((end - start) + "ms");
        assertEquals(10_000, arr.length);
    }
}
