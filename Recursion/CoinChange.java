package Recursion;

public class CoinChange {
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] arr = {2};
        System.out.println("main "+coinChange(arr,10));
        System.out.println("ans" + ans);
    }
    static int coinChange(int[] coins, int amount) {

        return helper(coins,amount,0,0);

    }

    private static int helper(int[] coins, int amount, int count,int index) {
        if(amount < 0){
            ans = -1;
            return 0;
        }
        if(amount == 0){
            ans = Math.min(ans, count);
            System.out.println(count);
            return count;
        }

        int min = Integer.MAX_VALUE;
        for (int i = index; i < coins.length; i++) {
            int a = helper(coins,amount-coins[i],count+1,i);
//            System.out.println("ans" + ans);
            if(a != 0){
                Math.min(a,min);
            }
        }

        return min;
    }
}
