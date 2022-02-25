package Array;

public class MinimizeHeight {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        System.out.println(getMinDiff(arr,5));
    }
    static int getMinDiff(int[] arr, int k) {
        // code here
        int min = Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int item: arr){
            if(item-k<0)
                min = Math.min((item+k),min);
            else
                min = Math.min((item-k),min);
        }
        for(int item: arr){
            if(item-k<0)
                max = Math.max((item+k),max);
            else
                max = Math.max((item-k),max);
        }

        System.out.println("Max: "+max+" Min: "+min);

        return(max-min);
    }
}
