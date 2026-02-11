package fr.simplon.exercises;

/**
 * Exercice 10: Opérations sur les ensembles
 * 
 * Objectif: Apprendre les opérations mathématiques sur les ensembles (union,
 * intersection, différence)
 */
public class Exercise10SetOperations {

    /**
     * Vérifie si une valeur est présente dans un tableau (sur une portion)
     * 
     * @param array le tableau à parcourir
     * @param value la valeur recherchée
     * @return true si la valeur est trouvée dans les length premiers éléments
     */
    public boolean contains(int[] array, int value) {
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                b = true;
            }
        }
        return b;

    }

    /**
     * Union de deux tableaux (tous les éléments uniques des deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant tous les éléments uniques des deux tableaux
     */
    public int[] union(int[] array1, int[] array2) {

        int length = array1.length + array2.length;
        int[][] arrays = { array1, array2 };
        int temp[] = new int[length];
        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                boolean isNotUnique = false;
                for (int k = 0; k < index; k++) {
                    if (temp[k] == arrays[i][j]) {
                        isNotUnique = true;
                        break;
                    }

                }
                if (!isNotUnique) {
                    temp[index++] = arrays[i][j];
                }

            }
        }

        int[] myArray = new int[index];
        for (int i = 0; i < index; i++) {
            myArray[i] = temp[i];
        }
        return myArray;

    }

    /**
     * Intersection de deux tableaux (éléments présents dans les deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans les deux tableaux
     */
    public int[] intersection(int[] array1, int[] array2) {

        int[] temp = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    temp[index++] = array1[i];
                }
            }
        }

        int[] myArray = new int[index];
        for (int i = 0; i < index; i++) {
            myArray[i] = temp[i];
        }
        return myArray;

    }

    /**
     * Différence de deux tableaux (éléments de array1 qui ne sont pas dans array2)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments de array1 absents de array2
     */
    public int[] difference(int[] array1, int[] array2) {
        int[] temp = new int[array1.length + array2.length];
        boolean isUnique = true;
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            isUnique = true;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[index++] = array1[i];
            }
        }
        int[] myArray = new int[index];
        for (int i = 0; i < index; i++) {
            myArray[i] = temp[i];
        }
        return myArray;
    }

    /**
     * Différence symétrique (éléments présents dans un seul des deux tableaux)
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return un tableau contenant les éléments présents dans un seul tableau
     */
    public int[] symmetricDifference(int[] array1, int[] array2) {
        int[] temp = new int[array1.length + array2.length];
        int[][] arrays = { array1, array2 };
        int index = 0;
        for (int i = 0; i < 2; i++) {
            int j = 1;
            if (i == 1) {
                j = 0;
            }
            boolean isNotUnique = false;
            for (int k = 0; k < arrays[i].length; k++) {
                for (int l = 0; l < arrays[j].length; l++) {
                    if (arrays[i][k] == arrays[j][l]) {
                        isNotUnique = true;
                        break;
                    }
                }
                if (!isNotUnique) {
                    temp[index++] = arrays[i][k];
                }
                isNotUnique = false;
            }

        }
        int[] myArray = new int[index];
        for (int i = 0; i < index; i++) {
            myArray[i] = temp[i];
        }
        return myArray;
    }

    /**
     * Vérifie si array1 est un sous-ensemble de array2
     * 
     * @param array1 le premier tableau
     * @param array2 le second tableau
     * @return true si tous les éléments de array1 sont dans array2
     */
    public boolean isSubset(int[] array1, int[] array2) {
        boolean found = true;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                found = false;
                if (array1[i] == array2[j]) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                break;
            }

        }
        return found;

    }

    /**
     * Supprime les doublons d'un tableau
     * 
     * @param array le tableau
     * @return un tableau contenant uniquement les éléments uniques
     */
    public int[] removeDuplicates(int[] array) {
        int[] temp = new int[array.length];
        int index = 0;
        boolean dooble = true;
        for (int i = 0; i < array.length; i++) {
            dooble = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    dooble = true;
                    break;
                }
            }
            if (!dooble) {
                temp[index++] = array[i];
            }
        }
        int[] myArray = new int[index];
        for (int i = 0; i < index; i++) {
            myArray[i] = temp[i];
        }
        return myArray;
    }

    /**
     * Compte le nombre d'éléments uniques dans un tableau
     * 
     * @param array le tableau
     * @return le nombre d'éléments uniques
     */
    public int countUnique(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique == true) {
                count++;
            }
        }
        return count;

    }
}
