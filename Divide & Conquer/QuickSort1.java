1public class QuickSort1{
    public static void printArray(int arr[]){
        System.out.print("Sorted array is:");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei){

        //base case
        if(si>=ei){
            return;
        }

        int pidx = partition(arr,si,ei);
        QuickSort(arr,si,pidx-1);//left side
        QuickSort(arr,pidx+1,ei);

    }

    public static int partition(int arr[], int si, int ei){
        
        int pivot = arr[ei];
        int i = si-1; // to make place for elements smaller than pivot element

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]){
        int arr[] = {8,5,1,7,0,4,2};
        QuickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}