package fr.simplon.exercises;

/**
 * Exercice 14: Tri à bulles (Bubble Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri le plus simple
 */
public class Exercise14BubbleSort {

    /**
     * Trie un tableau en utilisant l'algorithme de tri à bulles
     * 
     * @param array le tableau à trier
     * @return le tableau trié (modifier le tableau en place)
     */
    public int[] bubbleSort(int[] array) {
        int temp = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    /**
     * Trie un tableau en ordre décroissant avec le tri à bulles
     * 
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] bubbleSortDescending(int[] array) {
        int temp = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    /**
     * Compte le nombre d'échanges effectués pendant le tri à bulles
     * 
     * @param array le tableau à trier
     * @return le nombre d'échanges effectués
     */
    public int countSwaps(int[] array) {
        int temp = 0;
        boolean sorted = false;
        int count = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Trie uniquement les k premiers éléments d'un tableau avec le tri à bulles
     * 
     * @param array le tableau
     * @param k     le nombre d'éléments à trier
     * @return le tableau avec les k premiers éléments triés
     */
    public int[] partialBubbleSort(int[] array, int k) {
     
        int indexTarget = 0;
        for (int i = 0; i < k ; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexTarget]) {
                    indexTarget = j;
                    min = array[j];
                }
            }
            int indexFrom = indexTarget;
            int indexTo = i;
            min = array[indexFrom];
            for (int j = indexFrom; j > indexTo ; j--) {
                array[j] = array[j - 1];
            }
            array[i] = min;
           }
        return array;

    }
}
