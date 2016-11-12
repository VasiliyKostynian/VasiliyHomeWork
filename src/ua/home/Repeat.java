package ua.home;

/**
 * Created by zvito_000 on 12.11.2016.
 */
public class Repeat {
    public static void main(String[] args) {
        int[] mas = {3, 65, 33, -5, 3, 1, 78, 3, 21};

        int sum = numb(mas);

        System.out.println(sum);
    }

    public static int numb(int[] mas ){
        int count = 0;

        for(int i = 0; i < mas.length; i++){
            if(mas[i] == 3){
                count++;
            }
        }
        return count;
    }

}
