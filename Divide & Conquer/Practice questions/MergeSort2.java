public class MergeSort2{
    public static void printArray(int arr[]){
        System.out.print("Sorted array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void MergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }

        //kaam
        int mid = si + (ei-si)/2;
        MergeSort(arr,si,mid);// left part
        MergeSort(arr,mid+1,ei);//right part
        Merge(arr,si,mid,ei);

    }

    public static void Merge(int arr[], int si,int mid,int ei){
        int temp[] = new int[ei-si+1];

        int i = si;
        int j = mid +1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[] = {7,8,9,77,1,0,6,2,10};
        MergeSort(arr,0,arr.length-1);
        printArray(arr);

    }
}