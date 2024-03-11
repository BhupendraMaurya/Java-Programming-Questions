// Most frequent element in an array
// public class Array2{
//     static int mostFrequent(int arr[], int n){
//         int maxCount =0;
//         int most_Frequent_Element = 0;

//         for(int i=0;i<n;i++){
//             int count =0;
//             for(int j=0;j<n;j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count > maxCount){
//                 maxCount = count;
//                 most_Frequent_Element = arr[i];
//             }
//         }
//         return most_Frequent_Element;
//     }
//     public static void main(String args[]){
//         int arr[] = {1,2,2,2,2,2,2,4,1,1,5,5,6,3};
//         int n = arr.length;
//         System.out.println(mostFrequent(arr, n));
//     }
// }

// Using searching technique: linear search
import java.util.*;
public class Array2{
    static int mostFrequent(int arr[], int n){
        Arrays.sort(arr);
        int maxCount = 0;
        int count =0;
        int ans = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                count = 0;
            }
            if(count>maxCount){
                maxCount = count;
                ans = arr[i-1];
            }
        }
        return ans;

        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,2,2,4,1,1,5,5,6,3};
        int n = arr.length;
        System.out.println(mostFrequent(arr, n));
    }
}