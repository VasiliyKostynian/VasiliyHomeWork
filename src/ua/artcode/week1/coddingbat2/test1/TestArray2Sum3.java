package ua.artcode.week1.coddingbat2.test1;

import ua.artcode.week1.coddingbat2.test.Array2;

/**
 * Created by zvito_000 on 06.11.2016.
 */
public class TestArray2Sum3 {
    public static void main(String[] args) {
//        sum3([1, 2, 3]) → 6
//        sum3([5, 11, 2]) → 18
//        sum3([7, 0, 0]) → 7
//        sum3([1, 2, 1]) → 4
//        sum3([1, 1, 1]) → 3
//        sum3([2, 7, 2]) → 11

        int[] new1 = {5, 11, 2};

        int expected = 5 + 11 + 2;
        int actual = Array2.sum3(new1);

        System.out.printf("sum3 result %s, expected -> %s, actual -> %s", expected == actual, expected, actual);

    }
}
