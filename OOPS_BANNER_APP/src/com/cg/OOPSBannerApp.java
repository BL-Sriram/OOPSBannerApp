package com.cg;

import java.util.HashMap;

/**
 * OOPSBannerApp UC8 – Advanced OOP Concepts Implementation
 *
 * This use case extends UC7 by utilizing the Java Collections Framework
 * (HashMap) to manage character-to-pattern mappings in a more flexible
 * and efficient manner. The application retrieves and displays the
 * "OOPS" banner using a character map.
 *
 * @author Developer
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     *
     * Each character is mapped to an array of strings where each string
     * represents one line of the character's ASCII art pattern.
     *
     * @return HashMap with character as key and ASCII pattern as value
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for letter 'O'
        charMap.put('O', new String[]{
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
        charMap.put('P', new String[]{
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
        charMap.put('S', new String[]{
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
        charMap.put(' ', new String[]{
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the provided character map.
     *
     * The banner is rendered horizontally by combining corresponding
     * lines of each character's ASCII art pattern.
     *
     * @param message the message to display as a banner
     * @param charMap HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        // All patterns have the same height
        int patternHeight = charMap.get('O').length;

        // Loop through each row of the pattern
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            // Loop through each character in the message
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main entry point of the application.
     */
    public static void main(String[] args) {

        // Create character map
        HashMap<Character, String[]> charMap = createCharacterMap();

        // Message to display
        String message = "OOPS";

        // Display banner
        displayBanner(message, charMap);
    }
}
