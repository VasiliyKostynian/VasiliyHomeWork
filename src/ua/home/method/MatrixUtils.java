package ua.home.method;

/**
 * Created by VN on 22.11.2016.
 */
public class MatrixUtils {
    public static int[][] createRealMatrix(int rows, int columns, int range) {
        int[][] mat = new int[rows][columns];

        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * range);
            }
        }
        return mat;
    }

    public static String convert(int[][] mat){
        String resMat = "";
        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                int col = mat[i][j];
                resMat += col + " ";
            }
            resMat += "\n";
        }
        return resMat;
    }

    public static int sumMatrix(int[][] mat) {
        int sumMat = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sumMat += mat[i][j];
            }
        }
        return sumMat;

    }

    public static int maxNumb(int[][] mat) {
        int maximum = mat[0][0];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(maximum < mat[i][j]){
                    maximum = mat[i][j];
                }
            }
        }
        return maximum;
    }
    public static int minNumb(int[][] mat) {
        int minimum = mat[0][0];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(minimum > mat[i][j]){
                    minimum = mat[i][j];
                }
            }
        }
        return minimum;
    }
}

