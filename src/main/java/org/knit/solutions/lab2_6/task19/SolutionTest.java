package org.knit.solutions.lab2_6.task19;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testMergeNormalCase() {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        sol.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void testMergeWithEmptyNums2() {
        Solution sol = new Solution();
        int[] nums1 = {1};
        int[] nums2 = {};
        sol.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testMergeWithEmptyNums1() {
        Solution sol = new Solution();
        int[] nums1 = {0};
        int[] nums2 = {1};
        sol.merge(nums1, 0, nums2, 1);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testAllElementsInNums2() {
        Solution sol = new Solution();
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {1, 2, 3};
        sol.merge(nums1, 0, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 3}, nums1);
    }

    @Test
    public void testWithNegativeNumbers() {
        Solution solution = new Solution();
        int[] nums1 = {-5, 0, 0, 0, 0};
        int[] nums2 = {-7, -3, 2, 4};
        solution.merge(nums1, 1, nums2, 4);
        assertArrayEquals(new int[]{-7, -5, -3, 2, 4}, nums1);
    }

    @Test
    public void testWithDuplicates() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 4, 5};
        solution.merge(nums1, 4, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 2, 3, 4, 5}, nums1);
    }

    @Test
    public void testPerformanceLargeArrays() {
        Solution sol = new Solution();
        int size = 100_000;
        int[] nums1 = new int[size * 2];
        int[] nums2 = new int[size];
        for (int i = 0; i < size; i++) {
            nums1[i] = i;
            nums2[i] = i;
        }
        long start = System.currentTimeMillis();
        sol.merge(nums1, size, nums2, size);
        long end = System.currentTimeMillis();
        System.out.println((end - start) + " ms");
        for (int i = 0; i < size * 2 - 1; i++) {
            assertTrue(nums1[i] <= nums1[i + 1]);
        }
    }
}