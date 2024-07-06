package Linear_search;

public class linear {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int target = 8  ;
        int ans = linearSearch(array, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length ; i++) {
           int element = arr[i];
           if(target == element){
                return i;
           }
        }
        return Integer.MAX_VALUE;
    }
}
