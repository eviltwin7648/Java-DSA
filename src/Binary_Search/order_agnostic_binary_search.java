package Binary_Search;

public class order_agnostic_binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,8,999,4422,33322};
        int target = 8;
        System.out.println(orderbinarysearch(arr,target));
    }
    static int orderbinarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end -start)/2;
            if( target == arr[mid]){
                return mid;
            }

            if (isAsc){
            if(target < arr[mid]){
                end = mid - 1;
            } else  {
                start = mid + 1;

            }
            } else {
                if(target > arr[mid]){

                    end = mid -1;
                } else  {
                    start = mid + 1;
                }

            }
        }



        return -1;
    }
}
