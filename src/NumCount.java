import java.sql.SQLOutput;
import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        System.out.println("Enter the no.of which NumCount is required");
        int m = in.nextInt();

        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == m){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
