package gic2;

public class hw2 {

    public static void main(String[] args) {
        /*Задание 1*/
/*
            int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr1.length; i++){
                arr1[i] = arr1[i] == 1 ? 0 : 1;
                System.out.print(arr1[i] + " ");
            }

            *//*Задание 2*//*

            System.out.println("задание");
            int[] arr2 = new int[8];
            for (int i = 1; i < arr2.length; i++)
                arr2[i] = 3 * i +1;
            for (int x : arr2) System.out.print(x + " ");
            }*/
        /*Задание 3*/

        System.out.println("задание");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }
        /*Задание 4*/
        System.out.println("4 задание");
        int[] arr4 = {25, 6, 5, 5, 13, 4, 8, 2, 14, 8, 1, 1};
        int min = arr4[0], max = arr4[0],
                indexMax = 0, indexMin = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
                indexMax = i;
            }
            if (arr4[i] < min) {
                min = arr4[i];
                indexMin = i;
            }
        }
        System.out.println("Макс" + max);
        System.out.println("Мин" + min);


    }
}



