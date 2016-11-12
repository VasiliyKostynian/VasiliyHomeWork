package ua.artcode.week1.coddingbat.test1;

import ua.artcode.week1.coddingbat.test.Array1;

/**
 * Created by zvito_000 on 06.11.2016.
 */
public class TeswtArray1Sum2 {


//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true
//    commonEnd([1, 2, 3], [1]) → true
//    commonEnd([1, 2, 3], [2]) → false

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {7, 3};

        boolean expected = true;

        boolean actual = Array1.commonEnd(arr1, arr2);

        boolean result = expected == actual;




        System.out.printf("commonEnd result %s, expected -> %s, actual -> %s", result, expected, actual);
    }
}
