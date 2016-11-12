package ua.artcode.other;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

/**
 * Created by zvito_000 on 11.11.2016.
 */
public class Test {
    public static void main(String[] args) {
        int[] nums1 = {5, 1, 7, 3, 8, 9, 11, 6};
        int first = nums1[0];

        int last = nums1[nums1.length - 1];

        int mid = nums1[nums1.length / 2];


        int max = first;

        if (max < last) {
            max = last;
        }

        if (max < mid) {
            max = mid;
        }

        System.out.println(max);
    }
}
