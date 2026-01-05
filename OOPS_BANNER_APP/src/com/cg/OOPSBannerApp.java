package com.cg;

/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store
 * banner lines and iterating through them with a for-each loop,
 * eliminating hardcoded print statements and improving modularity
 * and reusability.
 *
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // 1. Define a String array with size equal to number of banner lines
        String[] lines = new String[9];

        // 2. Populate each index using String.join()
        lines[0] = String.join("",
                "   ***   ", "   ***   ", "  ******   ", "   *****  ");

        lines[1] = String.join("",
                " **   ** ", " **   ** ", " **    **  ", " **       ");

        lines[2] = String.join("",
                "**     **", "**     **", " **     ** ", "**        ");

        lines[3] = String.join("",
                "**     **", "**     **", " **    **  ", " **       ");

        lines[4] = String.join("",
                "**     **", "**     **", " ******    ", "   ***    ");

        lines[5] = String.join("",
                "**     **", "**     **", " **         ", "      **  ");

        lines[6] = String.join("",
                "**     **", "**     **", " **         ", "       ** ");

        lines[7] = String.join("",
                " **   ** ", " **   ** ", " **         ", "      **  ");

        lines[8] = String.join("",
                "   ***   ", "   ***   ", " **         ", "  *****   ");

        // 3. Use a for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
