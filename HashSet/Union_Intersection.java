import java.util.*;
public class Union_Intersection {
    public static void main(String[] args) {
        int arr1[] = {4,8,1,2};
        int arr2[] = {4,2,8,6,3,1};

        HashSet<Integer> set = new HashSet<>();

        // Union
        // for(int i=0;i<arr1.length;i++){
        //     set.add(arr1[i]);
        // }
        // for(int i=0;i<arr2.length;i++){
        //     set.add(arr2[i]);
        // }

        // System.out.println("Union of arrays is given by: " +set);
        // System.out.println("And size of union is: "+ set.size());

        // Intersection:

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                System.out.print( arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println();
        System.out.println("Size of intersection is: " +count);


        
    }
}
