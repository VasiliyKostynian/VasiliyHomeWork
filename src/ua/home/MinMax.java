package ua.home;

import com.sun.prism.shader.Solid_ImagePattern_Loader;
import com.sun.xml.internal.messaging.saaj.util.SAAJUtil;

import java.util.Arrays;

/**
 * Created by zvito_000 on 12.11.2016.
 */
public class MinMax {
    public static void main(String[] args) {
        int[] mas = {4, 3, 5, 8, 12, 43, 1};
        int maxN = maxNumb(mas);
        int minN = minNumb(mas);

        int sum = 43;
        int min = 1;

        System.out.println("The maximum number ist " + maxN);
        System.out.println("Test maxNum is " + (maxN == sum));

        System.out.println("The minimum number ist " + minN);
        System.out.println("Test minNum is " + (minN == min));

        int maxInd = getIndex(mas, maxN);
        int minInd = getIndex(mas, minN);

        System.out.println(maxInd);
        System.out.println(minInd);

        mas[maxInd] = minN;
        mas[minInd] = maxN;

        System.out.println(Arrays.toString(mas));


    }

    public static int maxNumb(int[] mas){
        int max = mas[0];

        for(int i = 0; i < mas.length; i++){
            if(max < mas[i]){
                max = mas[i];
            }
        }
        return max;
    }

    public static int minNumb(int[] mas){
        int min = mas[0];

        for(int i = 0; i < mas.length; i++){
            if(min > mas[i]){
                min = mas[i];
            }
        }
        return min;
    }

    public static int getIndex(int[] mas, int Value){
        int index = 0;

        for(int i = 0; i < mas.length; i++){

            if(Value == mas[i]){
                index = i;
            }
        }
        return index;
    }

}
