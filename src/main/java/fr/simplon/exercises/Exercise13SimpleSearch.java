package fr.simplon.exercises;

/**
 * Exercice 13: Recherche dans un tableau
 * 
 * Objectif: Apprendre à rechercher des éléments dans un tableau
 */
public class Exercise13SimpleSearch {

    /**
     * Vérifie si le tableau est trié en ordre croissant
     * 
     * @param array le tableau
     * @return true si le tableau est trié, false sinon
     */
    public boolean isSorted(int[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    /**
     * Recherche linéaire: trouve l'index d'une valeur dans un tableau
     * 
     * @param array  le tableau
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int linearSearch(int[] array, int target) {
        int indexTarget = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indexTarget = i;
                break;
            }
        }
        return indexTarget;
    }

    /**
     * Recherche binaire: trouve l'index d'une valeur dans un tableau TRIÉ
     * 
     * @param array  le tableau trié
     * @param target la valeur à chercher
     * @return l'index de la valeur, ou -1 si non trouvée
     */
    public int binarySearch(int[] array, int target) {
        int indexTarget = -1;
        int indexBinary = array.length;

        while (indexTarget < indexBinary - 1) {
            int temp = (indexTarget + indexBinary) / 2;
            if (array[temp] < target) {
                indexTarget = temp;
            } else {
                indexBinary = temp;
            }
        }
        if (target != array[indexBinary]) {
            indexBinary = -1;
        }
        return indexBinary;

    }

    /**
     * Trouve tous les indices où une valeur apparaît
     * 
     * @param array  le tableau
     * @param target la valeur à chercher
     * @return un tableau contenant tous les indices où la valeur apparaît
     */
    public int[] findAllIndices(int[] array, int target) {
        int[] temp = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                temp[index++] = i;
            }
        }
        int[] myArray = new int[index];
        for (int i = 0; i < index; i++) {
            myArray[i] = temp[i];
        }
        return myArray;
    }

    /**
     * Trouve le deuxième plus grand élément d'un tableau
     * 
     * @param array le tableau
     * @return le deuxième plus grand élément
     */
    public int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                secondMax = max;
                max = array[i];
            } else if (secondMax < array[i]) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }
}
