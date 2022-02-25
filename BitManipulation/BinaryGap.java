package BitManipulation;

import java.util.Arrays;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(22));

    }
    static int binaryGap(int n) {

        int[] bit = new int[32];
        int k = 0;
        for (int i = 1; i < 32; i++) {
            if((n&1) == 1){
                bit[k++] = i;
            }
            n = n>>1;
        }
        int diff = 0;
        for (int i = 0; i < k-1; i++) {
            diff = Math.max(Math.abs(bit[i] - bit[i+1]), diff);
        }


        return diff;
    }
}
