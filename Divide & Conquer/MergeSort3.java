public class MergeSort3 {
    public static void main(String args[]){
        int arr[] = {4,5,1,9,1};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2; //mid part

        //merge sort for left subarray
        mergeSort(arr, si, mid);

        //merge sort fir right part'
        mergeSort(arr, mid+1, ei);

        //merging both subarray
        merge(arr,si,mid,ei);
    }

        public static void merge(int arr[],int si,int mid,int ei){
            int temp[] = new int[ei-si+1];

            int i = si; // iterator for left subarray
            int j= mid+1; // iterator for right subarray
            int k = 0;

            while(i<=mid && j<=ei){//placing element in temporary array
                if(arr[i]< arr[j]){
                    temp[k] = arr[i];
                    i++;
                }
                else{
                    temp[k] = arr[j];
                    j++;

                }
                k++;
            }

            while(i<=mid){
                temp[k] = arr[i];
                i++;
                k++;
            }
            while(j<=ei){
                temp[k] = arr[j];
                j++;
                k++;
            }

            for(k=0,i = si;k<temp.length;k++,i++){
                arr[i] = temp[k];
            }

        }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
