import java.util.*;
public class Selection_Sort{
    public static void selectionsort(int arr[]){
        int n=arr.length;
        //loop for different passes
        for(int i=0;i<n-1;i++){
            int min=i;
            //loop for comparing and finding min element
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //swapping
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={10,5,2,1,8,9,80,12};
        selectionsort(arr);
        printArr(arr);
    }
}