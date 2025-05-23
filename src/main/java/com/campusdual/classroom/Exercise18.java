package com.campusdual.classroom;

import com.campusdual.Utils;

public class Exercise18 {

    public static void main(String[] args) {
        int [] array = createAndInitializeArray(Utils.integer("Introduce el tamaño del array: "));
        showInlineArray(array);
    }

    public static int[] createAndInitializeArray(int num) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i+1);
        }
        return array;
    }

    public static void showInlineArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
