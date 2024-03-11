//❌ Heap sort for Increasing Order ❌
public class HeapSort{
    public static void heapSort(int arr[], int n){
        // first we will build maxHeap of given array;
        for(int i=n/2;i>=0;i--){
            heapify(arr, i, n);
        }

        // now taking largest element and push in last in arry
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0,i);
        }
    }

    public static void heapify(int arr[], int i, int n){
        int maxIdx = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }

        if(right < n && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(maxIdx != i){
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr, maxIdx, n);
        }

    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,1,3,5,6,2};
        int n = arr.length;
        printArray(arr);
        heapSort(arr, n); 
        printArray(arr);



    }
}