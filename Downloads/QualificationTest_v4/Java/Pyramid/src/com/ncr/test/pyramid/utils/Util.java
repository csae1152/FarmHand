package com.ncr.test.pyramid.utils;

/**
 * The following functions are part of common third-party libraries
 * such as Google's guava, Apache's commons, etc.
 * However, to be fair to everybody, we want to rely on the standard
 * Java library only.
 * <p/>
 * Here, we do not strive for efficiency, but for transparency.
 */
public class Util {

    public final static String NEW_LINE = System.getProperty("line.separator");

    public static String repeatChar(char c, int n) {

        final StringBuilder builder = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            builder.append(c);
        }
        return builder.toString();
    }
}
