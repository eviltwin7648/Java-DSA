package Binary_Search;

public class SplitArrayLargestSum {

    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m){
        int start = 0;
        int end =0;

        for (int i = 0; i <  nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end){
            int middle = start + (end -start)/2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > middle){
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }

            if(pieces>m){
                start = middle +1;
            }else {
                end = middle;
            }

        }
        return end;
    }

}
