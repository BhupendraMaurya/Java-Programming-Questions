public class HeapSort2 {
    public static void heapSort(int arr[], int n){
        // build minHeap
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);  
        }

        // take smallest and push in last in array
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0,i);  
        }
    }

    public static void heapify(int arr[], int i, int n){
        int minIdx = i;
        int left = 2*i+1;
        int right = 2*i+1;

        if(left < n && arr[left] < arr[minIdx]){
            minIdx = left;
        }


        if(right < n && arr[right] < arr[minIdx]){
            minIdx = right;
        }


        if(minIdx != i){
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            heapify(arr,minIdx, n);
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] ={1,5,2,4,2,3,10,-1};
        int n = arr.length;
        printArray(arr);
        heapSort(arr,n);
        printArray(arr);
    }
}
