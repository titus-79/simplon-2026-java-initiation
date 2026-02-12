package fr.simplon.exercises;

/**
 * Exercice 16: Tri par insertion (Insertion Sort)
 * 
 * Objectif: Apprendre l'algorithme de tri par insertion, similaire au tri de
 * cartes
 */
public class Exercise16InsertionSort {

    /**
     * Trie un tableau en utilisant l'algorithme de tri par insertion
     * 
     * @param array le tableau à trier
     * @return le tableau trié
     */
    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Trie un tableau en ordre décroissant avec le tri par insertion
     * 
     * @param array le tableau à trier
     * @return le tableau trié en ordre décroissant
     */
    public int[] insertionSortDescending(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j - 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Compte le nombre de décalages effectués pendant le tri par insertion
     * 
     * @param array le tableau à trier
     * @return le nombre de décalages effectués
     */
    public int countShifts(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j + 1] < array[j]) {
                    count++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
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
    public int[] insertIntoSorted(int[] sortedArray, int element) {
        int[] myArray = new int[sortedArray.length + 1];
        int indexMyArray = 0;
        boolean isInsert = false;
        for (int i = 0; i < sortedArray.length; i++) {
            if (element < sortedArray[i] && isInsert == false) {
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
