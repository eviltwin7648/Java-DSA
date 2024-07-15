package Sorting_Algorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr={11,5,2,8,9};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }

    }

    static void swap(int[] array, int first, int second)  {
            int temp = array[first];
            array[first] = array[second];
            array[second] = temp;
    }

    static int getMaxIndex(int[] array, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
         if (array[max] < array[i]){
             max = i;
         }
        }
        return max;
    }
}
