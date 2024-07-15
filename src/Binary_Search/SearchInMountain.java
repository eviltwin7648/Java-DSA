package Binary_Search;

public class SearchInMountain {
    public static void main(String[] args) {



    }

    static int search (int[] arr, int target){
        int peak = peakindex(arr, target);
        int firstTry = orderbinarysearch(arr,target,0,peak);
        if(firstTry!= -1){
            return firstTry;
        }
        return orderbinarysearch(arr,target,peak+1,arr.length -1);
    }

    static int peakindex(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
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
    static int orderbinarysearch(int[] arr, int target,int start, int end){


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
