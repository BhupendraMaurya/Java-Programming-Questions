public class QuickSort2{
    public static void Quicksort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int pidx = partition(arr,si,ei);
        Quicksort(arr,si,pidx-1);
        Quicksort(arr,pidx+1,ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = 
    }
    public static void main(String args[]){
        int arr[] = {1,4,2,6,7,0,9};
    }
}