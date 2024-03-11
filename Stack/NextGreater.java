
import java.util.Stack;

public class NextGreater {
    // next greater
    public static long[] nextGreaterRight(long arr[], int n){
        long nums[] = new long[arr.length];
        
        Stack<Long> s = new Stack<>();
        
    
        
        for(int i=n-1;i>=0;i--){
            
                while( (!s.isEmpty()) && arr[i] >= s.peek()){
                    s.pop();
                }
                if(s.isEmpty()){
                    nums[i] = -1;
                   
                }
                else{
                    nums[i] = s.peek();
                    
                }
                s.push(arr[i]);
        }
        
        return nums;
    }

    public static long[] nextGreaterLeft(long arr[], int n){
        long nums[] = new long[arr.length];
        
        Stack<Long> s = new Stack<>();
        
    
        
        for(int i=0;i<n;i++){
            
                while( (!s.isEmpty()) && arr[i] >= s.peek()){
                    s.pop();
                }
                if(s.isEmpty()){
                    nums[i] = -1;
                   
                }
                else{
                    nums[i] = s.peek();
                    
                }
                s.push(arr[i]);
        }
        
        return nums;
    }

    public static long[] nextSmallerRight(long arr[], int n){
        long nums[] = new long[arr.length];
        
        Stack<Long> s = new Stack<>();
        
    
        
        for(int i=n-1;i>=0;i--){
            
                while( (!s.isEmpty()) && arr[i] <= s.peek()){
                    s.pop();
                }
                if(s.isEmpty()){
                    nums[i] = -1;
                   
                }
                else{
                    nums[i] = s.peek();
                    
                }
                s.push(arr[i]);
        }
        
        return nums;
    }

    public static long[] nextSmallerLeft(long arr[], int n){
        long nums[] = new long[arr.length];
        
        Stack<Long> s = new Stack<>();
        
    
        
        for(int i=0;i<n;i++){
            
                while( (!s.isEmpty()) && arr[i] <= s.peek()){
                    s.pop();
                }
                if(s.isEmpty()){
                    nums[i] = -1;
                   
                }
                else{
                    nums[i] = s.peek();
                    
                }
                s.push(arr[i]);
        }
        
        return nums;
    }
    public static void main(String args[]){
        long arr[] =  { 7,8,1,4};
        int n = arr.length;
        long nums2[] = nextSmallerLeft(arr, n);
        for(int i=0;i<nums2.length;i++){
            System.out.print(nums2[i]+" ");
        }
        System.out.println();
        
    }
}
