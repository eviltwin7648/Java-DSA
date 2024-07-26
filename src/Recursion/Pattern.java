package Recursion;

import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
   int[] arr = {2,6,3,4};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }


    static void pattern1(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print(c+1);
            pattern1(r,c+1);
        }else {
            System.out.println();
            pattern1(r-1,0);
        }
    }
    static void bubble(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);
        }else {

            bubble(arr,r-1,0);
        }
    }

    static void selection(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c);
            }else {
                selection(arr,r,c+1,max);
            }
        }else {
            int temp = arr[max];
            arr[max]= arr[r-1];
            arr[r-1] = temp;

            selection(arr,r-1,0,0);
        }

    }
}
