package ua.home;

import java.util.Arrays;

/**
 * Created by zvito_000 on 12.11.2016.
 */
public class RewriteMas {
    public static void main(String[] args) {
        int[] mas1 = {1, 6, 4, 9, 32, 44};
        int[] mas2 = {44, 22, 43, -1, 3, 9};

        mas2 = mas1;

        System.out.println(Arrays.toString(mas2));

    }
}
