package Linear_search;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDIgits {
    public static int main(String[] args) {
        int[] arr ={22, 21, 35, 36, 78955, 9955};
        int evenDigit = 0;
        for (int i = 0; i < arr.length; i++) {



            int num = arr[i];
            if(even(num)){
                evenDigit++;
            }
        }

       return evenDigit;
    }

    static boolean even(int num){

        int NoofDigits = digits(num);
        if(NoofDigits%2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){

        if(num<-1){
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }

        int count = 0;
         while (num>0){
             count++;
             num = num/10;
         }

        return count;
    }
}
