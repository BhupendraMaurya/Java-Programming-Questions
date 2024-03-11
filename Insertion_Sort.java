import java.util.*;
public class Insertion_Sort{
    public static void insertionsort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }
    public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
    }
    public static void main(String args[]){
        int arr[] = {5,4,9,1,7,88,3,9};
        insertionsort(arr);
        printArr(arr);
    }
}