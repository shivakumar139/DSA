package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CoinChange {
    public static void main(String[] args) {
        int rs = 11;
        int[] coins = {1,2,5};
        System.out.println(coinChange(rs,coins));
    }

    private static int coinChange(int amount, int[] coins) {
        int sum = 0;
        int count = 0;
        int i = 0;
        Arrays.sort(coins);
        reverse(coins);


        while(i < coins.length){
            if(sum + coins[i] <= amount){
                sum+=coins[i];
                count++;
            } else{
                i++;
            }
        }

        return count == amount?-1:count;
    }

    private static void reverse(int[] coins) {
        int left = 0, right = coins.length-1;

        while(left < right){
            int temp = coins[left];
            coins[left] = coins[right];
            coins[right] = temp;
            left++;
            right--;
        }
    }
}
