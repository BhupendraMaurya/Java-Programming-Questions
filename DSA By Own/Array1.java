// Last duplicate element in a sorted array
// public class Array1{
//     static void duplicateNumber(int arr[]){
//         for(int i=arr.length-1;i>0;i--){
//             if(arr[i] == arr[i-1]){
//                 System.out.println("Index is : "+i);
//                 System.out.println("Value is : "+ arr[i]);
//                 return;
//             }
//         }
//         System.out.println("No duplicate found");
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,5,6,7};
//        duplicateNumber(arr);
//     }
// }

// Using Arraylist

import java.util.ArrayList;

public class Array1{
    public static ArrayList<Integer> duplicateNumber(int arr[],int n){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=n-1;i>0;i--){
            if(arr[i] == arr[i-1]){
                list.add(i);
                list.add(arr[i]);
                return list;
            }
        }
        if(list.size() == 0){
            list.add(-1); 
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,5,6,6,7};
        int n = arr.length;
        System.out.println(duplicateNumber(arr, n));
    }
}
