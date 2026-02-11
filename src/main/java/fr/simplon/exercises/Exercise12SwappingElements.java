package fr.simplon.exercises;

/**
 * Exercice 12: Comparaison et échange d'éléments
 * 
 * Objectif: Apprendre les opérations de base nécessaires pour le tri
 */
public class Exercise12SwappingElements {

    /**
     * Échange deux éléments dans un tableau
     * 
     * @param array le tableau
     * @param i     premier index
     * @param j     second index
     */
    public int[] swap(int[] array, int i, int j) {
        int temp = 0;

        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return array;

    }

    /**
     * Décale un élément vers la gauche
     * 
     * @param array     le tableau
     * @param fromIndex position source (plus grande)
     * @param toIndex   position destination (plus petite)
     * @return le tableau modifié
     */
    public int[] shiftLeft(int[] array, int fromIndex, int toIndex) {
        int indexTemp = fromIndex;
        for (int i = 0; i < fromIndex - toIndex; i++) {
            swap(array, indexTemp, indexTemp - 1);
            indexTemp--;
        }
        return array;
    }

    /**
     * Décale un élément vers la droite
     * 
     * @param array     le tableau
     * @param fromIndex position source (plus petite)
     * @param toIndex   position destination (plus grande)
     * @return le tableau modifié
     */
    public int[] shiftRight(int[] array, int fromIndex, int toIndex) {
        int indexTemp = fromIndex;
        for (int i = 0; i < toIndex - fromIndex; i++) {
            swap(array, indexTemp, indexTemp + 1);
            indexTemp++;
        }
        return array;
    }

    /**
     * Place le plus petit élément au début du tableau
     * 
     * @param array le tableau
     * @return le tableau modifié
     */
    public int[] moveSmallestToFront(int[] array) {
        int minIndexValue = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndexValue]) {
                minIndexValue = i;
            }
        }
        return shiftLeft(array, minIndexValue, 0);
    }

    /**
     * Place le plus grand élément à la fin du tableau
     * 
     * @param array le tableau
     * @return le tableau modifié
     */
    public int[] moveLargestToEnd(int[] array) {
        int maxIndexValue = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndexValue]) {
                maxIndexValue = i;
            }
        }
        return shiftRight(array, maxIndexValue, array.length - 1);

    }

    /**
     * Vérifie si deux éléments adjacents sont dans le bon ordre
     * 
     * @param array le tableau
     * @param i     l'index du premier élément
     * @return true si array[i] <= array[i+1], false sinon
     */
    public boolean isInOrder(int[] array, int i) {

        return (array[i] < array[i + 1]);
    }

    /**
     * Échange tous les éléments adjacents qui ne sont pas dans le bon ordre
     * (une seule passe)
     * 
     * @param array le tableau
     * @return le tableau après une passe
     */
    public int[] bubblePass(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (!isInOrder(array, i)) {
                swap(array, i, i + 1);
                i++;
            }
        }
        return array;
    }

    /**
     * Compte le nombre de paires d'éléments adjacents mal ordonnées
     * 
     * @param array le tableau
     * @return le nombre de paires où array[i] > array[i+1]
     */
    public int countInversions(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (!isInOrder(array, i)) {
                count++;
            }
        }
        return count;
    }
}
