package org.example;

/**
 * HackerRank Interview Preparation Kit
 * Difficulty: Easy
 *
 */
public class CountingValleys {
    public static void main( String[] args ) {

    }

    static int countingValleys(int n, String s) {
        char[] letters = s.toCharArray();
        int currentLevel = 0;
        int consecutiveDown = 0;
        int valleys = 0;

        for (char letter : letters) {
            // if letter is equal to D
            if (Character.compare(letter, 'D') == 0)  {
                currentLevel--;

            } else {
                currentLevel++;
                if (currentLevel == 0) {
                    valleys++;
                }
            }


        }
        return valleys;
    }
}
