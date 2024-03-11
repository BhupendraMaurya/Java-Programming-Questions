public class InsertionSort{

    public static void selectionsort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int j=i-1;
            
            while(j>=0 && arr[j]>curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {4,1,7,3};

        selectionsort(arr);
        printarr(arr);
    }
}