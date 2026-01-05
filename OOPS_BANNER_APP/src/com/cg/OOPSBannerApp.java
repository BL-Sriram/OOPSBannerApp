package com.cg;

/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * This class extends UC2 by refactoring the banner construction
 * to use String.join() instead of string concatenation.
 *
 * Using String.join() avoids creating multiple intermediate
 * String objects and improves readability and efficiency.
 *
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each println represents one row of the OOPS banner
        // String.join("", ...) is used to join parts of each line

        System.out.println(String.join("",
                "   ***   ", "   ***   ", "  ******   ", "   *****  "));

        System.out.println(String.join("",
                " **   ** ", " **   ** ", " **    **  ", " **       "));

        System.out.println(String.join("",
                "**     **", "**     **", " **     ** ", "**        "));

        System.out.println(String.join("",
                "**     **", "**     **", " **    **  ", " **       "));

        System.out.println(String.join("",
                "**     **", "**     **", " ******    ", "   ***    "));

        System.out.println(String.join("",
                "**     **", "**     **", " **         ", "      **  "));

        System.out.println(String.join("",
                "**     **", "**     **", " **         ", "       ** "));

        System.out.println(String.join("",
                " **   ** ", " **   ** ", " **         ", "      **  "));

        System.out.println(String.join("",
                "   ***   ", "   ***   ", " **         ", "  *****   "));
    }
}
