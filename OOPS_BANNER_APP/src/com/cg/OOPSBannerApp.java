package com.cg;

/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case improves UC4 by combining String array declaration and
 * initialization into a single statement using String.join(), making
 * the code more concise and readable while preserving modularity.
 *
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Declare and initialize the banner lines in a single statement
        String[] lines = {

                String.join("",
                        "   ***   ", "   ***   ", "  ******   ", "   *****  "),

                String.join("",
                        " **   ** ", " **   ** ", " **    **  ", " **       "),

                String.join("",
                        "**     **", "**     **", " **     ** ", "**        "),

                String.join("",
                        "**     **", "**     **", " **    **  ", " **       "),

                String.join("",
                        "**     **", "**     **", " ******    ", "   ***    "),

                String.join("",
                        "**     **", "**     **", " **         ", "      **  "),

                String.join("",
                        "**     **", "**     **", " **         ", "       ** "),

                String.join("",
                        " **   ** ", " **   ** ", " **         ", "      **  "),

                String.join("",
                        "   ***   ", "   ***   ", " **         ", "  *****   ")
        };

        // Print each line using a for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
