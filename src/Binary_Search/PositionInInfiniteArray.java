package Binary_Search;

public class PositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1 ,2 , 3 ,5 ,8 ,99,988,};
        int target = 99;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end-start + 1)*2;
            start = temp;
        }
        return binarysearch(arr, target, start, end);
    }
    static int binarysearch(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end -start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid -1;
            }else if( target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
