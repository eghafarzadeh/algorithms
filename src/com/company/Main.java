package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String s = "AZazdbb";
        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        char u = 0;
        System.out.println(u);
//        for (char c : s_array) {
//            letters[c]++;
//        }
//        for (char i = 0; i < 128; i++) {
//            System.out.println(i);
//        }
        int index = 3;
        int mask= 1 << index;
        System.out.println(mask);

        byte val = 100;
        val = (byte) (val >> 2);
        System.out.println(val);
    }




}
