package Printing_Patterns;

public class patterns {
    public static void main(String[] args) {
        int n = 4;
        pattern_3(n);
    }

    static void pattern_2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row +1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n){
        for (int row = 0 ; row < 2*n; row++) {
            int totalColumnsInRow = row > n ? 2*n- row : row;
            int totalWhiteSpace = n - totalColumnsInRow;
            for (int s = 0; s < totalWhiteSpace; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col <totalColumnsInRow; col++) {
                    System.out.print('*');
            }
                System.out.println();
        }
    }


//    static void pattern_20(int n){
//
//    }
}
