package com.sda.algorytmy;


/**
 * Hello world!
 */
public class App {
    public static int suma(int[] tab) {

        if (tab.length == 0) {
            return 0;
        }
        int[] tab2 = new int[tab.length - 1];
        for (int i = 0; i < tab.length - 1; i++) {
            tab2[i] = tab[i + 1];
        }
        return tab[0] + suma(tab2);
    }

    public static void main(String[] args) {

        int[] tab = {2, 4, 6, 2, 2};

        System.out.println(suma(tab));
    }

    int[] tab = {12,15,11,0,5,20};



}
