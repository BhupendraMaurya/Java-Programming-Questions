import java.util.*;
public class Selection_Sort2{
    public static void selectionsort(int arr[]){
        int n = arr.length;
        //outer loop for number of passes
        for(int i=0;i<n-1;i++){
            int min=i;
            //for 
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){//for decreasing order array || { arr[j]<arr[min]}
                    min=j;
                }
            }
            //swapping
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selectionsort(arr);
        printarr(arr);
    }
}