package Binary_Search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {11, 23, 34, 55, 56, 87, 98, 111};
        int target = 365;

        System.out.println(celing(arr, target));
    }

    static int celing(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }


        return arr[start];
    }
}