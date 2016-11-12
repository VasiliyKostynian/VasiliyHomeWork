package ua.home;

import java.util.Arrays;

/**
 * Created by zvito_000 on 12.11.2016.
 */
public class MInMaxSecond {
    public static void main(String[] args) {
        int[] mus= {2, 4, 67, 5, 12, 54, 0};

        int max = MaxFind(mus);
        int min = MinFind(mus);

        int maxNumb = 67;
        int minNumb = 0;

        System.out.println("The max number " + max);
        System.out.println("Test for max number " + (max == maxNumb));

        System.out.println("The min number " + min);
        System.out.println("Test for min number " + (min == minNumb));

        int maxInd = getIndex(mus, max);
        int minInd = getIndex(mus, min);

        mus[maxInd] = min;
        mus[minInd] = max;
        System.out.println("New massive " + Arrays.toString(mus));
    }

    public static int MaxFind(int[] mus) {
        int max = mus[0];

        for(int i = 0; i < mus.length; i++){
            if(max < mus[i]){
                max = mus[i];
            }
        }
        return max;
    }
    public static int MinFind(int[] mus){
        int min = mus[0];

        for(int j = 0; j < mus.length; j++){
            if(min > mus[j]){
                min = mus[j];
            }
        }
        return min;
    }

    public static int getIndex(int[] mus, int Value){
        int index = 0;
        for(int i = 0; i < mus.length; i++){
            if(Value == mus[i]){
                index = i;
            }
        }
        return index;
    }

}
