package fr.simplon.exercises;

/**
 * Exercice 5: Tableaux - Opérations de base
 * 
 * Objectif: Apprendre à manipuler des tableaux
 */
public class Exercise05ArraysBasics {

    /**
     * Crée un tableau contenant les nombres de 1 à n
     * 
     * @param n la taille du tableau
     * @return un tableau [1, 2, 3, ..., n]
     */
    public int[] createSequence(int n) {
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    /**
     * Retourne le premier élément d'un tableau
     * 
     * @param array le tableau
     * @return le premier élément
     */
    public int getFirstElement(int[] array) {
        return array[0];
    }

    /**
     * Retourne le dernier élément d'un tableau
     * 
     * @param array le tableau
     * @return le dernier élément
     */
    public int getLastElement(int[] array) {
        int i = array.length - 1;
        return array[i];
    }

    /**
     * Compte le nombre d'occurrences d'une valeur dans un tableau
     * 
     * @param array le tableau
     * @param value la valeur à chercher
     * @return le nombre d'occurrences
     */
    public int countOccurrences(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if( value == array[i]) {
                count++;
            }
        }
        return count;
    }

    /**
     * Vérifie si un tableau contient une valeur
     * 
     * @param array le tableau
     * @param value la valeur à chercher
     * @return true si la valeur est présente, false sinon
     */
    public boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
