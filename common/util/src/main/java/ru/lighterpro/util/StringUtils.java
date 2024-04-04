package ru.lighterpro.util;

public class StringUtils {
    public static final String EMPTY = "";

    public static String trim(String s) {
        return s == null ? EMPTY : s.trim();
    }

    public static String capitalizeSecondChar(String s) {
        if (s == null) {
            return EMPTY;
        }
        if (s.length() < 2) {
            return s;
        }
        return s.substring(0, 1) + s.substring(1, 2).toUpperCase() + s.substring(2);
    }
}
