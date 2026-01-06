package com.cg;

/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class
 * to encapsulate character-to-pattern mappings. The application retrieves
 * and displays the "OOPS" banner using these mappings, improving code
 * organization, modularity, and reusability.
 *
 * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * CharacterPatternMap – Inner static class for storing
     * character-to-pattern mappings.
     *
     * Encapsulates a single character and its corresponding
     * ASCII art pattern.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        private final Character character;

        /** ASCII art pattern lines for the character */
        private final String[] pattern;

        /**
         * Constructs a CharacterPatternMap with a character and its pattern.
         *
         * @param character the character to be mapped
         * @param pattern   the ASCII art pattern as an array of strings
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Retrieves the mapped character.
         *
         * @return the character associated with this pattern
         */
        public Character getCharacter() {
            return character;
        }

        /**
         * Retrieves the ASCII art pattern.
         *
         * @return the pattern array representing the character
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array for
     * predefined characters: 'O', 'P', 'S', and space.
     *
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] characterPatternMaps = new CharacterPatternMap[4];

        // Pattern for letter 'O'
        characterPatternMaps[0] = new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        });

        // Pattern for letter 'P'
        characterPatternMaps[1] = new CharacterPatternMap('P', new String[]{
                " ******  ",
                " **    ** ",
                " **     **",
                " **    ** ",
                " ******  ",
                " **       ",
                " **       ",
                " **       "
        });

        // Pattern for letter 'S'
        characterPatternMaps[2] = new CharacterPatternMap('S', new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "  *****  "
        });

        // Pattern for space ' '
        characterPatternMaps[3] = new CharacterPatternMap(' ', new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        });

        return characterPatternMaps;
    }

    /**
     * Retrieves the ASCII pattern for a given character.
     *
     * @param ch       the character to look up
     * @param charMaps array of CharacterPatternMap objects
     * @return pattern array for the character, or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // Fallback: return space pattern if character not found
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ' ') {
                return map.getPattern();
            }
        }

        return new String[0];
    }

    /**
     * Prints a message as a banner using ASCII art patterns.
     *
     * @param message  the message string to display
     * @param charMaps available character pattern mappings
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        // Each character pattern has equal height
        int height = charMaps[0].getPattern().length;

        for (int row = 0; row < height; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[row]).append(" ");
            }

            System.out.println(lineBuilder.toString());
        }
    }

    /**
     * Main method – Entry point for the banner display application.
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        // Message to display
        String message = "OOPS";

        // Print banner message
        printMessage(message, charMaps);
    }
}
