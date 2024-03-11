/*
  Given an array A of N elements. Find the majority element in the array.
   A majority element in an array A of size N is an element that appears more than N/3 times in the array.
 */
public class Majority_ELement{ // Self DOne question
    public static void majorityElement(int arr[]){ // Using brute force approach O(n^2)
        int a = arr.length;
        int maxcount=0;
        int i, j;
        int index =-1;
        for(i=0;i<a;i++){
            int count =0;
            for(j=0;j<a;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxcount){
                maxcount = count;
                index = i;
            }
        }
        if(maxcount > (a/3)){
            System.out.println(arr[index]);
        }
        else{
            System.out.println("Not exist");
        }
    }
    public static void main(String[] args) {   
        int arr[] = {3,1,3,3,2,7,9, 9, 4, 3, 9, 9, 4, 9, 9, 8};
        majorityElement(arr);
    }
}
