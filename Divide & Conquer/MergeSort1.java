public class MergeSort1{
    public static void printArray(int arr[]){
        System.out.print("Sorted Array is:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void mergeSort(int arr[],int si,int ei){

        //base case
        if(si>=ei){
            return;
        }

        //kaam
        int mid = si + (ei-si)/2;    // (si+ei)/2
        mergeSort(arr,si,mid);    //left part
        mergeSort(arr,mid+1,ei);  //right part
        merge(arr,si,ei,mid); 
    }
    
    public static void merge(int arr[],int si,int ei,int mid){

        //temporary array to store sorted elements
        int temp[] = new int[ei-si+1];
        
        int i = si;   //iterator for left part
        int j = mid+1;  //iterator for right part
        int k = 0;   //iterator for temp array

        while(i<=mid && j<= ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }


        // left part for any remaining element
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // right part for any remaining element
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copy temp in original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }


    }
    public static void main(String args[]){
        int arr[] = {4,3,9,2,1,8,-1,0};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
}