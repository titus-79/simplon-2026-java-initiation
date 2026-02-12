package fr.simplon.exercises;

/**
 * Exercice 15: Tri par sélection (Selection Sort)
 * 
 * Objectif: Apprendre un algorithme de tri efficace basé sur la sélection du
 * minimum
 */
public class Exercise15SelectionSort {

    /**
     * Trie un tableau en utilisant l'algorithme de tri par sélection
     * 
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] selectionSort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                int min = array[i];
                int minIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (min > array[j]) {
                        min = array[j];
                        minIndex = j;
                        sorted = false;
                    }
                }
                if (min != array[i]) {
                    array[minIndex] = array[i];
                    array[i] = min;
                }
            }
        }
        return array;

    }

    /**
     * Trie un tableau en ordre décroissant avec le tri par sélection
     * 
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] selectionSortDescending(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                int max = array[i];
                int maxIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (max < array[j]) {
                        max = array[j];
                        maxIndex = j;
                        sorted = false;
                    }
                }
                if (max != array[i]) {
                    array[maxIndex] = array[i];
                    array[i] = max;
                }
            }
        }
        return array;
    }

    /**
     * Trouve les k plus petits éléments d'un tableau (non triés entre eux)
     * 
     * @param array le tableau
     * @param k     le nombre d'éléments à trouver
     * @return un tableau contenant les k plus petits éléments
     */
    public int[] findKSmallest(int[] array, int k) {
        int[] myArray = new int[k];
        int index = 0;
        while (index < k) {
            for (int i = 0; i < 1; i++) {
                int minIndex = 0;
                for (int j = i + 1; j < array.length; j++) {
                    if ((array[minIndex] > array[j] && index == 0)
                            || (array[minIndex] > array[j] && array[j] > myArray[index - 1])) {
                        minIndex = j;
                    }
                }
                myArray[index++] = array[minIndex];
            }

        }
        return myArray;

    }

    /**
     * Compte le nombre de comparaisons effectuées pendant le tri par sélection
     * 
     * @param array le tableau à trier
     * @return le nombre de comparaisons
     */
    public int countComparisons(int[] array) {
        boolean sorted = false;
        int count = 0;
        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                int min = array[i];
                int minIndex = i;
                for (int j = i + 1; j < array.length; j++) {
                    count++;
                    if (min > array[j]) {
                        min = array[j];
                        minIndex = j;
                        sorted = false;
                    }
                }
                if (min != array[i]) {
                    array[minIndex] = array[i];
                    array[i] = min;
                }
            }
        }
        return count;
    }
}
