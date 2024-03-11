//Find whether an array is subset of another array
import java.util.*;
public class SubsetProblem{
    static boolean subset(int arr1[], int arr2[]){  // using nested loops
        int i;
        int j;
        for(i=0;i<arr2.length;i++){
            for(j=0;j<arr1.length;j++){
                if(arr1[j] == arr2[i]){


                    break;
                }
            }
            if(j == arr1.length){
                return false;
            }
        }
        return true;
    }

    // using hashset
    static boolean isSubset(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(!hs.contains(arr1[i])){ 
                hs.add(arr1[i]);
            }
        }

        for(int i=0;i<arr2.length;i++){
            if(!hs.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
    // using hashset with another approach but works if there are no duplicates;
    static boolean isSubset2(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            if(!hs.contains(arr1[i])){
                hs.add(arr1[i]);
            }
        }

        int p = hs.size();
        for(int i=0;i<arr2.length;i++){
            if(!hs.contains(arr2[i])){
                hs.add(arr2[i]);
            }
        }
        
        int q = hs.size();

        if(p == q){
            return true;
        }
        return false;
         
    }


    public static void main(String[] args) {
        int arr1[] = {1 ,2 ,3, 4 ,5 ,6, 7, 8};
        int arr2[] = {1 ,2 ,3 ,1};
        if(isSubset2(arr1, arr2)){
            System.out.println("IT is a subset of given array");
        }
        else{
            System.out.println("Not a subset");
        }
    }
}