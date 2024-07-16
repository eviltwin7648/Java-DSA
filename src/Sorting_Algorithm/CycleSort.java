package Sorting_Algorithm;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr= {2,1,3,6,5,4};
       sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] -1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else {
                i++;
            }

        }
    }

    static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] =arr[end];
        arr[end]=temp;
    }
}
