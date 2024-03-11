public class Duplicate {
    public static void deplicate(int arr[], int n){
        // creating a new array of same length
        int nums[] = new int[arr.length];

        int j =0;// creating index for nums array
        for(int i=0;i<n;i++){
            // if value at current index  is negative , then insert that value in nums array and increment j index
            if(arr[i] < 0){
                nums[j] = arr[i];
                j++;
            }
        }

        for(int i=0;i<arr.length;i++){
            // if all negative values have been inserted in nums array , then
            // insert positive values in nums and increase j
            if(arr[i] >= 0){
                nums[j] = arr[i];
                j++;
            }
        }
        
        // assign the value of nums array in original array,
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
    }
    public static void main(String args[]){
        int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
        int n = arr.length;
        deplicate(arr, n);

        for(int i=0;i<arr.length;i++){
            // printing values
            System.out.print(arr[i]+" ");
        }
    }
}
