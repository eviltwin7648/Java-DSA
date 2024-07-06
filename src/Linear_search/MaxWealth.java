package Linear_search;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] accounts = {{2,8,7},{7,1,3},{1,19,5}};

        System.out.println(maximumwealth(accounts));


    }
    static int maximumwealth(int[][] accounts){
        int ans = 0;
        for (int i  = 0; i  < accounts.length ; i ++) {

            int money = 0;
            for (int j = 0; j < accounts[i].length; j++) {

                money += accounts[i][j];

            }
            if(ans < money){
                ans = money;
            }

        }
        return ans;
    }
}
