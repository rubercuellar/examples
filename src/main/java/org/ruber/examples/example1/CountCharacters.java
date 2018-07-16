package org.ruber.examples.example1;

/**
 * Class to count characters.
 */
public final class CountCharacters {

    /**
     * Private Constructor.
     */
    private CountCharacters() {
    }

    /**
     * Count characters.
     * @param word The word's to count
     * @return integer
     */
    public static int countChars(final String word) {
        return word.length();

    }

    /**
     * Count how many times a specific char is repeated in a given string.
     * @param word String to check
     * @param character char to check in String
     * @return int
     */
    public static int countDefinedChar(final String word, final char character) {
        int counter = 0;
        for (Character singleChar : word.toCharArray()) {
            if (singleChar.equals(character)) {
                counter++;
            }
        }
        return counter;
    }

}
