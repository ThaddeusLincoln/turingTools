package com.turing.tools.threads.colors;

/**
 * The way this colors are used we need to append the color we want before the texts
 * that we're going to show and once a color is set that color will remain until we use
 * another's color code. So if we want to return to the default code we use or append
 * the ANSI_RESET which will set us back to the default color
 *
 */
public class Color {
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

}
