package Linear_search;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {21, 33, 25, 26,7, 6, 0};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int minimumNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimumNum){
                minimumNum = arr[i];
            }
        }
        return minimumNum;
    }
    static int max(int[] arr){
        int MaximumNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MaximumNum){
                MaximumNum = arr[i];
            }
        }
        return MaximumNum;
    }

}
