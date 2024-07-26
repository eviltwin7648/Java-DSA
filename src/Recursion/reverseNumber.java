package Recursion;

public class reverseNumber {
    public static void main(String[] args) {
        int n = 5632;
        reverse(n);
        System.out.println(sum);
    }
    static int sum = 0;

    static void reverse(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse(n/10);

    }
}
