package Array;

public class SortedSubArray {
    public static void main(String[] args) {
        int[] arr = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(arr));

    }

    static int findUnsortedSubarray(int[] arr) {

        boolean isSorted = true;
        int leftIndex = 0;
        int rightIndex = 0;

        outerLoop:
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    isSorted = false;
                    leftIndex = i;
                    break outerLoop;
                }
            }
        }

//        outerLoop:

//        System.out.println( "left " + leftIndex);

        if(isSorted){
            return 0;
        }

        rightLoop:
        for(int i=arr.length-1; i>0; i--){
            for(int j=i-1; j>=0; j--){
                if(arr[i] < arr[j]){
                    rightIndex = i;
                    break rightLoop;
                }
            }
        }

//        System.out.println("right " + rightIndex);


        return ((rightIndex - leftIndex) + 1);

    }
}
