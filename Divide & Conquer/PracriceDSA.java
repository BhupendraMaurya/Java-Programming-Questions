import java.util.*;
public class PracriceDSA {
     

    // 1st method: using for loop
    // public static void reverseArray(int arr[],int size){
    //     for(int i=size-1;i>=0;i--){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }

    //2nd method: using while loop

    // public static void reverseArray(int arr[],int si,int ei){
    //     while(si<ei){
    //         int temp = arr[si];
    //         arr[si] = arr[ei];
    //         arr[ei] = temp;
    //         si++;
    //         ei--;
    //     }
    // }

    // 3rd method: using recursion;

    public static void reverseArray(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
        reverseArray(arr, si+1, ei-1);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        reverseArray(arr, 0, 4);
        printArray(arr);
        
        
    }
}
