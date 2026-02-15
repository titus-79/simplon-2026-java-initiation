package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 16
 */
class Exercise17QuickSortTest {
    
    Exercise17QuickSort exercise = new Exercise17QuickSort();
    
    @Test
    void testquickSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.quickSort(new int[]{5, 2, 4, 1, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.quickSort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.quickSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 3, 6, 7}, exercise.quickSort(new int[]{7, 3, 1, 6, 2}));
        assertArrayEquals(new int[]{10, 20, 30, 40}, exercise.quickSort(new int[]{40, 10, 30, 20}));
    }
    
    @Test
    void testquickSortDescending() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.quickSortDescending(new int[]{5, 2, 4, 1, 3}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, exercise.quickSortDescending(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 6, 3, 2, 1}, exercise.quickSortDescending(new int[]{7, 3, 1, 6, 2}));
        assertArrayEquals(new int[]{40, 30, 20, 10}, exercise.quickSortDescending(new int[]{10, 40, 20, 30}));
    }
    
    @Test
    void testcountShiftsQuickSorts() {
        assertEquals(0, exercise.countShiftsQuickSort(new int[]{1, 2, 3, 4, 5})); // Déjà trié, aucun décalage
        assertTrue(exercise.countShiftsQuickSort(new int[]{5, 4, 3, 2, 1}) > 0); // Plusieurs décalages nécessaires
        assertTrue(exercise.countShiftsQuickSort(new int[]{2, 1, 3}) > 0); // Au moins un décalage
        assertTrue(exercise.countShiftsQuickSort(new int[]{3, 1, 2}) > 0);
        assertEquals(0, exercise.countShiftsQuickSort(new int[]{10, 20, 30}));
    }
    
    @Test
    void testquickInsertIntoSorted() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.quickInsertIntoSorted(new int[]{1, 2, 4, 5}, 3));
        assertArrayEquals(new int[]{0, 1, 2, 3}, exercise.quickInsertIntoSorted(new int[]{1, 2, 3}, 0));
        assertArrayEquals(new int[]{1, 2, 3, 10}, exercise.quickInsertIntoSorted(new int[]{1, 2, 3}, 10));
        assertArrayEquals(new int[]{5, 10, 15, 20}, exercise.quickInsertIntoSorted(new int[]{5, 10, 20}, 15));
        assertArrayEquals(new int[]{1, 7, 10, 20}, exercise.quickInsertIntoSorted(new int[]{1, 10, 20}, 7));
    }
}