public class Subsequences {

    public static int subsequence(int idx, int arr[], int sum, int k, int n){
        if(idx == n){
            if(sum == k){
                return 1;

            }
            else {
                return 0;
            }
        }
        
        sum = sum + arr[idx];
        int left = subsequence(idx+1, arr, sum,k,n);

        sum = sum - arr[idx];
        int right = subsequence(idx+1, arr, sum,k,n);

        return left + right;
    }
    public static void main(String args[]){
        int arr[] = {1,2,1};
        int n = arr.length;
        int sum = 0;
        int k = 5;
        // System.out.println(subsequence(0,arr,sum,k,n));
        System.out.println(1/2);
    }
}
