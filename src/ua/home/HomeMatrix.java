package ua.home;

/**
 * Created by VN on 22.11.2016.
 */
import ua.home.method.MatrixUtils;

public class HomeMatrix {
    public static void main(String[] args) {

        int[][] mat = MatrixUtils.createRealMatrix(3, 3, 250);

        String result = MatrixUtils.convert(mat);

        int sumMat = MatrixUtils.sumMatrix(mat);

        int maximum = MatrixUtils.maxNumb(mat);
        int manimum = MatrixUtils.minNumb(mat);

        System.out.println(result);
        System.out.println("Sum the Matrix is = " + sumMat);
        System.out.println("Max number in the Matrix is = " + maximum);
        System.out.println("Min number in the Matrix is = " + manimum);

    }
}
