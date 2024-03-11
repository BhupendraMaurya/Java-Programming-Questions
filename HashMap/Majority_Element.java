/*
  Given an array A of N elements. Find the majority element in the array.
   A majority element in an array A of size N is an element that appears more than N/3 times in the array.
 */
import java.util.*;
public class Majority_Element{
    public static void majorityElement(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<>();


        for(int i=0;i< arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }

        Set<Integer> keys = hm.keySet();
        for (Integer k : keys) {
            if(hm.get(k) > (arr.length/3) ){
                System.out.println(k);
            }
            
        }
    }
    public static void main(String[] args) {   
        int arr[] = {1,2,2,2,2,2,2,2,2,3,4,5,6};
        majorityElement(arr);
    }
}