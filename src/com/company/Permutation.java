package com.company;

/**
 * @author Elham
 * @since 5/27/2021
 */
public class Permutation {
    public static void main(String[] args) {
        permutation("abcd");
    }

    public static void permutation(String str) {
        permutation(str, "");
    }

    public static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        }
        for (int i = 0; i < str.length(); i++) {
            permutation(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i));
        }
    }
}
