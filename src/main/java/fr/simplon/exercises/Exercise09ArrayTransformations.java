package fr.simplon.exercises;

/**
 * Exercice 9: Tableaux - Transformations
 * 
 * Objectif: Apprendre à créer de nouveaux tableaux à partir de tableaux
 * existants
 */
public class Exercise09ArrayTransformations {

    /**
     * Double tous les éléments d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec tous les éléments doublés
     */
    public int[] doubleElements(int[] array) {
        int[] myArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[i] * 2;
        }
        return myArray;
    }

    /**
     * Filtre les nombres pairs d'un tableau
     * 
     * @param array le tableau source
     * @return un nouveau tableau contenant seulement les nombres pairs
     */
    public int[] filterEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        int[] myArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                myArray[index] = array[i];
                index++;
            }
        }
        return myArray;
    }

    /**
     * Copie un tableau dans l'ordre inverse
     * 
     * @param array le tableau source
     * @return un nouveau tableau avec les éléments dans l'ordre inverse
     */
    public int[] reverseArray(int[] array) {
        int[] myArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            myArray[(array.length - 1) - i] = array[i];
        }
        return myArray;
    }

    /**
     * Concatène deux tableaux
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un nouveau tableau contenant d'abord les éléments de array1, puis
     *         ceux de array2
     */
    public int[] concatenate(int[] array1, int[] array2) {
        int [] myArray = new int [array1.length + array2.length];
        int [][] arrays = {array1, array2};
        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                myArray[index++] = arrays [i][j];
            }
        }
        return myArray;
    }

    /**
     * Extrait une sous-partie d'un tableau
     * 
     * @param array le tableau source
     * @param start l'index de début (inclus)
     * @param end   l'index de fin (exclus)
     * @return un nouveau tableau contenant les éléments de start à end-1
     */
    public int[] slice(int[] array, int start, int end) {
        int [] myArray = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            myArray[index++] = array[i];
        }
        return myArray;

    }
}
