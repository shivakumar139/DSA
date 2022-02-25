package BitManipulation;

public class PrimeSetBits {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(10,15));
    }
    static boolean check(int n){
        return (n==2 || n==3 || n== 5 || n==7 || n==11 || n==13 || n==17 || n== 19);
    }
    static int countPrimeSetBits(int left, int right) {

        int noOfBits = 0;
        int ans = 0;
        int n=0;
        boolean isPrime = false;
        while(left<=right){
            isPrime = true;
            noOfBits = 0;
            n = left;
            while(n>0){
                n = n&(n-1);
                noOfBits++;
            }



            if(check(noOfBits)){
                ans++;
            }
            left++;

        }

        return ans;
    }
}
