package ua.artcode.week1.coddingbat.test;

/**
 * Created by zvito_000 on 06.11.2016.
 */
public class Array1 {
    public static boolean commonEnd(int[] a, int[] b) {
        if(a[0] == b[0] || a[a.length - 1] == b[b.length - 1] ){
            return true;
        } else {
            return false;
        }
    }
}
