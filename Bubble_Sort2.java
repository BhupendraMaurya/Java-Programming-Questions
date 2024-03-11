import java.util.*;
public class Bubble_Sort2{
    public static void bubblesort(int arr[]){
        int n=arr.length;
        //loop for number of turns
        for(int turn=0;turn<n-1;turn++){
            //inner loop for camparisons
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubblesort(arr);
        printarr(arr);
    }
}