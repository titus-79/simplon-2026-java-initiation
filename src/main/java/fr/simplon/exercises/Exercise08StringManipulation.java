package fr.simplon.exercises;

/**
 * Exercice 8: Manipulation de chaînes de caractères
 * 
 * Objectif: Apprendre à manipuler les String
 */
public class Exercise08StringManipulation {

    /**
     * Inverse une chaîne de caractères
     * 
     * @param str la chaîne à inverser
     * @return la chaîne inversée
     */
    public String reverseString(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    /**
     * Vérifie si une chaîne est un palindrome
     * 
     * @param str la chaîne à vérifier
     * @return true si c'est un palindrome, false sinon
     */
    public boolean isPalindrome(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        return str.matches(revStr);

    }

    /**
     * Compte le nombre de voyelles dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de voyelles (a, e, i, o, u)
     */
    public int countVowels(String str) {
        int count = 0;
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.toLowerCase().charAt(i) == (vowels.charAt(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Compte le nombre de mots dans une chaîne
     * 
     * @param str la chaîne
     * @return le nombre de mots (séparés par des espaces)
     */
    public int countWords(String str) {
        String[] myArray = str.split(" ");
        return myArray.length;
    }

    /**
     * Met la première lettre de chaque mot en majuscule
     * 
     * @param str la chaîne
     * @return la chaîne avec chaque mot commençant par une majuscule
     */
    public String capitalizeWords(String str) {
        String[] myArray = str.split(" ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i].substring(0, 1).toUpperCase() + myArray[i].substring(1);
        }

        return String.join(" ", myArray);
    }
}
