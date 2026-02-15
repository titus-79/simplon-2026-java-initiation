package fr.simplon.exercises;

import java.util.Arrays;

public class Exercise17QuickSort {

    /**
     * Exercice 1: Tri par insertion (Quick Sort)
     * 
     * Objectif: Apprendre l'algorithme de tri par insertion, similaire au tri de
     * cartes
     */

    /**
     * Trie un tableau en utilisant l'algorithme de tri par insertion
     * 
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] quickSort(int[] array) {
        if (array.length <= 1)
            return array;
        int pivot = array[array.length - 1];
        int[] arraySmall = new int[array.length - 1];
        int[] arrayHigh = new int[array.length - 1];
        int indexSmaller = 0;
        int indexHigh = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < pivot) {
                arraySmall[indexSmaller++] = array[i];
            } else {
                arrayHigh[indexHigh++] = array[i];
            }
        }

        int[] sortedSmall = quickSort(Arrays.copyOf(arraySmall, indexSmaller));
        int[] sortedHigh = quickSort(Arrays.copyOf(arrayHigh, indexHigh));

        int index = 0;
        for (int i : sortedSmall) {
            array[index++] = i;
        }
        array[index++] = pivot;
        for (int i : sortedHigh) {
            array[index++] = i;
        }

        return array;
    }

    /**
     * Trie un tableau en ordre décroissant avec le tri par insertion
     * 
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] quickSortDescending(int[] array) {
        if (array.length <= 1)
            return array;
        int pivot = array[array.length - 1];
        int[] arraySmall = new int[array.length - 1];
        int[] arrayHigh = new int[array.length - 1];
        int indexSmaller = 0;
        int indexHigh = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > pivot) {
                arrayHigh[indexHigh++] = array[i];

            } else {
                arraySmall[indexSmaller++] = array[i];
            }
        }

        int[] sortedSmall = quickSortDescending(Arrays.copyOf(arraySmall, indexSmaller));
        int[] sortedHigh = quickSortDescending(Arrays.copyOf(arrayHigh, indexHigh));
        int index = 0;
        for (int i : sortedHigh) {
            array[index++] = i;
        }
        array[index++] = pivot;
        for (int i : sortedSmall) {
            array[index++] = i;
        }
        return array;
    }

    /**
     * Compte le nombre de décalages effectués pendant le tri par insertion
     * 
     * @param array le tableau à trier
     * @return le nombre de décalages effectués
     */
    public int countShiftsQuickSort(int[] array) {
        int count = 0;
        if (array.length <= 1)
            return count;
        boolean isSorted = true;
        for( int i = 0 ; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            return count;
        }
        int pivot = array[array.length - 1];
        int[] arraySmall = new int[array.length - 1];
        int[] arrayHigh = new int[array.length - 1];
        int indexSmaller = 0;
        int indexHigh = 0;

        for (int i = 0; i < array.length - 1; i++) {
            count++;
            if (array[i] < pivot) {
                arraySmall[indexSmaller++] = array[i];
            } else {
                arrayHigh[indexHigh++] = array[i];
            }
        }

        int[] sortedSmall = Arrays.copyOf(arraySmall, indexSmaller);
        int[] sortedHigh = Arrays.copyOf(arrayHigh, indexHigh);

        count += countShiftsQuickSort(sortedSmall);
        count += countShiftsQuickSort(sortedHigh);

        int index = 0;
        for (int i : sortedSmall) {
            array[index++] = i;
        }
        array[index++] = pivot;
        for (int i : sortedHigh) {
            array[index++] = i;
        }

        return count;
    }

    /**
     * Insère un élément à sa place dans un tableau déjà trié
     * 
     * @param sortedArray le tableau trié
     * @param element     l'élément à insérer
     * @return un nouveau tableau avec l'élément inséré à la bonne place
     */
    public int[] quickInsertIntoSorted(int[] sortedArray, int element) {
        if (sortedArray.length == 0) {
            return new int[]{element};
        }
        int[] myArray = new int[sortedArray.length + 1];
        int indexMyArray = 0;
        boolean isInsert = false;
        for (int i = 0; i < sortedArray.length; i++) {
            if (element < sortedArray[i] && !isInsert) {
                myArray[indexMyArray++] = element;
                isInsert = true;
            }

            myArray[indexMyArray++] = sortedArray[i];

            if (isInsert == false && i == sortedArray.length - 1) {
                myArray[indexMyArray++] = element;
                isInsert = true;
            }

        }
        return myArray;
    }
}
