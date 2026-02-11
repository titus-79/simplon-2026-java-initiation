package fr.simplon.exercises;

/**
 * Exercice 11: Tableaux à deux dimensions
 * 
 * Objectif: Apprendre à manipuler des tableaux à deux dimensions (matrices)
 */
public class Exercise11TwoDimensionalArrays {

    /**
     * Crée une matrice remplie de zéros
     * 
     * @param rows nombre de lignes
     * @param cols nombre de colonnes
     * @return une matrice rows x cols remplie de 0
     */
    public int[][] createMatrix(int rows, int cols) {
        int[][] myArray = new int[rows][cols];
        return myArray;

    }

    /**
     * Calcule la somme de tous les éléments d'une matrice
     * 
     * @param matrix la matrice
     * @return la somme de tous les éléments
     */
    public int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;

    }

    /**
     * Trouve le maximum dans une matrice
     * 
     * @param matrix la matrice
     * @return la valeur maximale
     */
    public int findMaxInMatrix(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Transpose une matrice (lignes ↔ colonnes)
     * 
     * @param matrix la matrice à transposer
     * @return la matrice transposée
     */
    public int[][] transpose(int[][] matrix) {
        // int [][] temp = new int[][]{matrix.length};
        int rows = 0;
        int columns = 0;
        for (int i = 0; i < matrix.length; i++) {
            columns++;
            for (int j = 0; j < matrix[i].length; j++) {
                rows++;
            }
        }
        int[][] myArray = new int[rows/columns][columns];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                myArray[j][i] = matrix[i][j];
            }
        }
        return myArray;
    }

    /**
     * Retourne la diagonale principale d'une matrice carrée
     * 
     * @param matrix la matrice carrée
     * @return un tableau contenant les éléments de la diagonale
     */
    public int[] getDiagonal(int[][] matrix) {
        int[] myArray = new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            myArray[i] = matrix[i][i];
        }
        return myArray;
    }

}
