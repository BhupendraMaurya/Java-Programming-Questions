
import java.util.*;

public class Intersection{
    
    public static void main(String args[]) {
       int arr1[] = {1,2,3,4,4,4,4,7,8,8,5};
       int arr2[] = {4,1,2,2,7,9};

       ArrayList<Integer> list = new ArrayList<>();

    //    for(int i=0;i<arr1.length;i++){ // tc = O(n^2); sc = O(n);
    //       int curr = arr1[i];
    //       for(int j=0;j<arr2.length;j++){
    //         if(arr2[j] == curr){
    //             list.add(curr);
    //             break;
    //         }
    //       }
    //    }

       HashSet<Integer> set = new HashSet<>();


       for(int i=0;i<arr1.length;i++){// inserting elements of array1 in set.
           set.add(arr1[i]);
       }

       for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){// checking that current element is present in set or not, 
                                       // if yes, then add that element in list
                list.add(arr2[i]);
                set.remove(arr2[i]);
            }
       }
        Collections.sort(list);// sorting the list;
       System.out.println(list);
       
        
       
    }
}
