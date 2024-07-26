package Recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,22,36,41,56,99,5};
        int target = 52;
        System.out.println(linear(arr,target,0));
    }

    static int linear(int[] arr, int target, int index) {
        if(index == arr.length){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        return linear(arr,target,index+1);
    }
}
