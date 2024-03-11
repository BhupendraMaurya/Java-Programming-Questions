public class PrefixxSum {

    public static int prefixSum(int arr[], int n){  // O(n^3); TC;

        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currSum = 0;
                for(int k=i;k<=j;k++){
                    currSum += arr[k];
                }
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static int prefixSum2(int arr[], int n){ // O(n^2); TC
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int currSum = 0;
            for(int j=i;j<n;j++){
                currSum += arr[j];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static int prefixSum3(int arr[], int n){ // (O(n^2))  TC
        int prefix[] = new int[n];
        int max = Integer.MIN_VALUE;
        int curr = 0;
        prefix[0] = arr[0];
        for(int i=1; i<n ; i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
                curr = (start==0)? prefix[end] : prefix[end]- prefix[start-1];
                if(curr>max){
                    max = curr;
                }
            }
        }
        return max;
    }

    public static int kadane(int arr[], int n){// TC = O(n)
        int curr = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            curr += arr[i];
            if(curr > max){
                max = curr;
            }

            if(curr < 0){
                curr = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4,-5};
        int n = arr.length;

        System.out.println(prefixSum(arr, n));
        System.out.println(prefixSum2(arr, n));
        System.out.println(prefixSum3(arr, n));

        System.out.println(kadane(arr, n));
    }
}
