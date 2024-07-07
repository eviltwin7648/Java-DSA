package Binary_Search;

public class SmallestLetter {
    public static void main(String[] args) {

        char[] letters = {'a','b', 'e', 'g', 'i'};
        char target = 'i';

        System.out.println(nextGreatestLetter(letters,target));

    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;


        boolean isAsc = letters[start] < letters[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (isAsc) {
                if (target < letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {
                if (target > letters[mid]) {

                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }


        return letters[start % letters.length];
    }
}
